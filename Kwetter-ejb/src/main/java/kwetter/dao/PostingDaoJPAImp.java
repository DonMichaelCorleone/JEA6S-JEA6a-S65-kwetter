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
import kwetter.dao.UserDaoImp;

public class PostingDaoJPAImp implements PostingDao {

     private final EntityManager em;

    public PostingDaoJPAImp(EntityManager em) {
        this.em = em;
    }

    @Override
    public void create(Posting p) {
        em.persist(p);
    }

    @Override
    public void edit(Posting p) {
        em.merge(p);
    }

    @Override
    public void remove(Long id) {
        Posting i =  em.find(Posting.class, id);
        em.remove(i);
    }

    @Override
    public List<Posting> findAll(User u) {
        Query q =  em.createNamedQuery("Posting.findAll",Posting.class);
        q.setParameter("id", u.getId());
        return (List<Posting>) q.getResultList();
    }

    @Override
    public Posting find(Long id) {
        Posting p = em.find(Posting.class, id);
        return p;
    }
        
       
}
