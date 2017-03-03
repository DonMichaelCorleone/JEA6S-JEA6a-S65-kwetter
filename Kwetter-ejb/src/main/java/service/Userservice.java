/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;
import kwetter.dao.UserDaoImp;
import kwetter.dao.UserDao;
import model.User;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;
import model.*;
/**
 *
 * @author Loek
 */
public class Userservice{
    
    private final UserDao userDao;
    
    public Userservice() {
        userDao = UserDaoImp.getUserDao();
    }
    
    public void create(User u){
        userDao.create(u);
    }
    
    public void remove(Long id){
        userDao.remove(id);
    }
    
    public void edit(User u){
        userDao.edit(u);
    };
        
    
    public User find(Long id){
        return userDao.find(id);
    };
    
    public List<User> findAllFollowers(Long id){
        return userDao.findAllFollowers(id);
    };
    
    public List<User> findAllFollows(Long id){
        return userDao.findAllFollows(id);
    };    
    
    public User getFollower(Long id){
        return userDao.getFollower(id);
    };
    
    public User getFollows(Long id){
        return userDao.getFollows(id);
    };
    
    public void setPassword(Long id , String password){
        userDao.setPassword(id,password);
    };
}
