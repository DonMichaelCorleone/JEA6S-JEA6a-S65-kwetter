package kwetter.dao;

import model.User;
import kwetter.dao.UserDao;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import javax.persistence.EntityExistsException;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.criteria.CriteriaQuery;
import model.Posting;

public class UserDAOJPAImpl implements UserDao {

    private final EntityManager em;

    private static UserDAOJPAImpl instance = null;
    
    public static synchronized UserDAOJPAImpl getUserDao(EntityManager em) {
        if (instance == null) {
            instance = new UserDAOJPAImpl(em);
        }
        return instance;
    }
    
      public UserDAOJPAImpl(EntityManager em) {
        this.em = em;
    }
    
    @Override
    public void create(User user) {
        if (!em.getTransaction().isActive()) {
            em.getTransaction().begin();
        }
        try {
            em.persist(user);
            em.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
            em.getTransaction().rollback();
        }
    }
    
    @Override
    public void edit(User user) {
         if (!em.getTransaction().isActive()) {
            em.getTransaction().begin();
        }
        try {
            em.merge(user);
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
            User u = em.find(User.class, id);
            em.remove(u);
            em.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
            em.getTransaction().rollback();
        }
    }

    @Override
    public User find(Long id) {
        if (!em.getTransaction().isActive()) {
            em.getTransaction().begin();
        }
        return em.find(User.class, id);
    }
    
    @Override
    public List<User> findAllFollowers(Long id) {
         if (!em.getTransaction().isActive()) {
            em.getTransaction().begin();
        }
        Query q =  em.createNamedQuery("User.findAllfollowers",User.class);
        q.setParameter("id", id);
        return (List<User>) q.getResultList();
    }

     @Override
    public List<User> findAllFollows(Long id) {
         if (!em.getTransaction().isActive()) {
            em.getTransaction().begin();
        }
        Query q =  em.createNamedQuery("User.findAllFollows",User.class);
        q.setParameter("id", id);
        return (List<User>) q.getResultList();
    }


    @Override
    public User getFollower(Long id) {
         if (!em.getTransaction().isActive()) {
            em.getTransaction().begin();
        }
        Query q =  em.createNamedQuery("User.getFollower",User.class);
        q.setParameter("id", id);
        return (User) q.getResultList();
    }

    @Override
    public User getFollows(Long id) {
         if (!em.getTransaction().isActive()) {
            em.getTransaction().begin();
        }
         Query q =  em.createNamedQuery("User.getFollows",User.class);
        q.setParameter("id", id);
        return (User) q.getResultList();
    }

    @Override
    public void setPassword(Long id, String password) {
         if (!em.getTransaction().isActive()) {
            em.getTransaction().begin();
        }
        Query q =  em.createNamedQuery("User.setPassword",User.class);
        q.setParameter("id",id);
        q.setParameter("password", password);
    }

    @Override
    public User findByUsername(String username) {
         if (!em.getTransaction().isActive()) {
            em.getTransaction().begin();
        }
        Query q =  em.createNamedQuery("User.findByUsername",User.class);
        q.setParameter("username",username);
        return (User) q.getResultList();
    }
}
