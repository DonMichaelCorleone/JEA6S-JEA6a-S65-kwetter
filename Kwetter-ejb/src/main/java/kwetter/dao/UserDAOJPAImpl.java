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

    public UserDAOJPAImpl(EntityManager em) {
        this.em = em;
    }
    
    @Override
    public void create(User user) {
        em.persist(user);
    }
    
    @Override
    public void edit(User user) {
        em.merge(user);
    }
    
    @Override
    public void remove(Long id) {
       User u =  em.find(User.class, id);
       em.remove(u);
    }

    @Override
    public User find(Long id) {
        Query q =  em.createNamedQuery("User.findById",User.class);
        q.setParameter("id", id);
        return (User) q.getSingleResult();
    }
    
    @Override
    public List<User> findAllFollowers(Long id) {
        Query q =  em.createNamedQuery("User.findAllfollowers",User.class);
        q.setParameter("id", id);
        return (List<User>) q.getResultList();
    }

     @Override
    public List<User> findAllFollows(Long id) {
        Query q =  em.createNamedQuery("User.findAllFollows",User.class);
        q.setParameter("id", id);
        return (List<User>) q.getResultList();
    }


    @Override
    public User getFollower(Long id) {
        Query q =  em.createNamedQuery("User.getFollower",User.class);
        q.setParameter("id", id);
        return (User) q.getResultList();
    }

    @Override
    public User getFollows(Long id) {
         Query q =  em.createNamedQuery("User.getFollows",User.class);
        q.setParameter("id", id);
        return (User) q.getResultList();
    }

    @Override
    public void setPassword(Long id, String password) {
        Query q =  em.createNamedQuery("User.setPassword",User.class);
        q.setParameter("id",id);
        q.setParameter("password", password);
    }
}
