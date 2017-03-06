/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package kwetter.dao;

import model.Posting;
import java.util.ArrayList;
import java.util.List;
import model.User;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;
import javax.persistence.EntityManager;
import javax.persistence.Query;

public class PostingDaoJPAImp implements PostingDao {

    private final EntityManager em;

    private static PostingDaoJPAImp instance = null;

    public PostingDaoJPAImp(EntityManager em) {
        this.em = em;
    }

    public static synchronized PostingDaoJPAImp getPostingDao(EntityManager em) {
        if (instance == null) {
            instance = new PostingDaoJPAImp(em);
        }
        return instance;
    }

    @Override
    public void create(Posting p) {
        if (!em.getTransaction().isActive()) {
            em.getTransaction().begin();
        }
        try {
            em.persist(p);
            em.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
            em.getTransaction().rollback();
        }
    }

    @Override
    public void edit(Posting p) {
        if (!em.getTransaction().isActive()) {
            em.getTransaction().begin();
        }
        try {
            em.merge(p);
            em.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
            em.getTransaction().rollback();
        }
    }

    @Override
    public void remove(Long id) {
        if (!em.getTransaction().isActive()) {
            em.getTransaction().begin();
        }
        try {
            Posting i = em.find(Posting.class, id);
            em.remove(i);
            em.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
            em.getTransaction().rollback();
        }
    }

    @Override
    public List<Posting> findAll(User u) {
        if (!em.getTransaction().isActive()) {
            em.getTransaction().begin();
        }
        try {
            Query q = em.createNamedQuery("Posting.findAll", Posting.class);
            q.setParameter("author", u);
            return (List<Posting>) q.getResultList();
        } catch (Exception e) {
            e.printStackTrace();
            em.getTransaction().rollback();
        }
        return null;
    }

    @Override
    public Posting find(Long id) {
        try {
            Posting p = em.find(Posting.class, id);
            return p;
        } catch (Exception e) {
            e.printStackTrace();
            em.getTransaction().rollback();
        }
        return null;
    }
}
