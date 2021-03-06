/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kwetter.dao;
import java.util.ArrayList;
import java.util.List;
import model.Posting;
import model.User;

/**
 *
 * @author Loek
 */
public interface UserDao {
    
    void create(User u);
    
    void edit(User u);
        
    void remove(Long id);
    
    User find(Long id);
    
    List<User> findAllFollowers(Long id);
    
    List<User> findAllFollows(Long id);    
    
    User getFollower(Long id);
    
    User getFollows(Long id);
    
    void setPassword(Long id , String password);
    
    User findByUsername(String username);
}
