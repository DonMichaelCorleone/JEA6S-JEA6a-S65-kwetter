/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kwetter.dao;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import model.User;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;
import model.Posting;
import org.omg.CosNaming.NamingContextPackage.NotFound;
/**
 *
 * @author Loek
 */
public class UserDaoImp implements UserDao{
        private static UserDaoImp instance = null;
        private ConcurrentHashMap<Long, User> users;
        private AtomicLong nextId = new AtomicLong(0L);
     
    public static synchronized UserDao getUserDao() {
        if (instance == null) {
            instance = new UserDaoImp();
        }
        return instance;
    }

    @Override
    public void create(User u) {
       if (u == null) {
            throw new IllegalArgumentException("User is null");
        }
        u.setId(nextId.getAndIncrement());
        users.put(u.getId(), u);
    }

    @Override
    public void edit(User u) {
        if (!users.containsKey(u.getId())) {
            throw new IllegalArgumentException("Id not found: " + u.getId());
        }
        
        User editUser = users.get(u.getId());
        editUser.setUserName(u.getUserName());
        editUser.setProfilePicture(u.getProfilePicture());
        editUser.setTweets(u.getTweets());
        editUser.setFollowers(u.getFollowers());
        editUser.setFollowing(u.getFollowing());
        editUser.setLocation(u.getLocation());
        editUser.setBiography(u.getBiography());
        editUser.setWebsiteURL(u.getWebsiteURL());    
    }

    @Override
    public void remove(Long id) {
       if(users.containsKey(id)){
           User deleteUser = users.get(id);
           users.remove(id, deleteUser);
       }else{
           throw new IllegalArgumentException("User not found: " + id);
       }
    }

      
    @Override
    public User find(Long id) {
         if(users.containsKey(id)){
           User u = users.get(id);
           return u;
         }
         else{
           throw new IllegalArgumentException("User not found: " + id);
       }
    }


    @Override
    public List<User> findAllFollowers(Long id) {
        if(users.containsKey(id)){
           User u = users.get(id);
           return (List) u.getFollowers();
        }else{
           throw new IllegalArgumentException("User not found: " + id);
       }
    }

    @Override
    public List<User> findAllFollows(Long id) {
        if(users.containsKey(id)){
           User u = users.get(id);
           return (List) u.getFollowing();
        }else{
           throw new IllegalArgumentException("User not found: " + id);
       }
    }  

    @Override
    public User getFollower(Long id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public User getFollows(Long id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setPassword(Long id ,String password) {
        if(users.containsKey(id)){
           User u = users.get(id);
            u.setPassword(this.generateHash(password));
        }else{
            throw new IllegalArgumentException("User not found: " + id);
        }
      
    }
    
    public static String generateHash(String input) {
		StringBuilder hash = new StringBuilder();

		try {
			MessageDigest sha = MessageDigest.getInstance("SHA-1");
			byte[] hashedBytes = sha.digest(input.getBytes());
			char[] digits = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9',
					'a', 'b', 'c', 'd', 'e', 'f' };
			for (int idx = 0; idx < hashedBytes.length; ++idx) {
				byte b = hashedBytes[idx];
				hash.append(digits[(b & 0xf0) >> 4]);
				hash.append(digits[b & 0x0f]);
			}
		} catch (NoSuchAlgorithmException e) {
                  return e.getMessage();
		}
		return hash.toString();
	}
}
