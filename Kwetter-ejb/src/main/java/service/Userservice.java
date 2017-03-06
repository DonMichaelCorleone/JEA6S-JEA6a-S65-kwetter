/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import kwetter.dao.UserDAOJPAImpl;
import model.User;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import model.*;

/**
 *
 * @author Loek
 */
@Stateless
public class Userservice {

    @Inject
    private UserDAOJPAImpl userDao;

    public Userservice() {
    }

    public Userservice(EntityManager em) {
        userDao = UserDAOJPAImpl.getUserDao(em);
    }

    public void create(User u) {
//        if (u != null || u.getUserName() == null || userDao.findByUsername(u.getUserName()) == null) {
            userDao.create(u);
//            return true;
//        } else {
//            return false;
//        }
    }

    public User findByUserName(String username) {
            return (User) userDao.findByUsername(username);
    }

    public void remove(Long id) {
        userDao.remove(id);
    }

    public void edit(User u) {
        userDao.edit(u);
    };

    public User find(Long id) {
        return userDao.find(id);
    };
    
    public List<User> findAllFollowers(Long id) {
        return userDao.findAllFollowers(id);
    };
    
    public List<User> findAllFollows(Long id) {
        return userDao.findAllFollows(id);
    };    
    
    public User getFollower(Long id) {
        return userDao.getFollower(id);
    };
    
    public User getFollows(Long id) {
        return userDao.getFollows(id);
    };
    
    public void setPassword(Long id, String password) {
        userDao.setPassword(id, password);
    };
}
