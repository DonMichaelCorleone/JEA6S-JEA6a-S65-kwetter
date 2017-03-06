///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package model;
//
//import java.util.ArrayList;
//import java.util.Set;
//import org.junit.After;
//import org.junit.AfterClass;
//import org.junit.Before;
//import org.junit.BeforeClass;
//import org.junit.Test;
//import static org.junit.Assert.*;
//import model.*;
//import org.junit.runner.RunWith;
//import org.mockito.Mock;
//import org.mockito.Mockito;
//import org.mockito.junit.MockitoJUnitRunner;
//
///**
// *
// * @author Loek
// */
//public class UserTest {
//    private User instance = null;
//    private Posting p = null;
//    private ArrayList<User> followers =  new ArrayList<User>();
//    private ArrayList<Posting> tweets =  new ArrayList<Posting>();
//    public UserTest() {
//      
//    }
//    
//    @Before
//    public void setUp() {
//        instance =  new User("Instance");
//     
//        for(int i = 0; i < 16; i++){
//            User u = new User("Follower : " + i);
//            long id = i;
//            u.setUserName("Follower : " + i);
//            u.setId(id);
//            followers.add(u);
//        }
//        instance.setFollowers(followers);
//        System.out.println(instance.getFollowers());
//        
//        for(int i = 0; i < 16; i++){
//            Posting p  = new Posting(instance, "TestPosting" + i, "Testdescription" + i);
//            long id = i;
//            p.setId(id);
//            tweets.add(p);
//        }
//        instance.setFollowers(followers);
//        instance.setTweets(tweets);
//    }
//    /**
//     * Test of getUserName method, of class User.
//     */
//    @Test
//    public void testGetUserName() {
//        System.out.println("getUserName");
//        String expResult = "Instance";
//        String result = instance.getUserName();
//        assertEquals("There was a mismatch between expected result: " + expResult + " " + "And:  " + result, expResult, result);
//    }
//
//    /**
//     * Test of setUserName method, of class User.
//     */
//    @Test
//    public void testSetUserName() {
//        System.out.println("setUserName");
//        String expResult = "Instance1";
//        instance.setUserName(expResult);
//        String result = instance.getUserName();
//        assertEquals("There was a mismatch between expected result: " + expResult + " " + "And:  " + result, expResult, result);
//    }
//
//    /**
//     * Test of getProfilePicture method, of class User.
//     */
//    @Test
//    public void testGetProfilePicture() {
//        System.out.println("getProfilePicture");
//        String expResult = "c:/Doc/Picture";
//        instance.setProfilePicture(expResult);
//        String result = instance.getProfilePicture();
//        assertEquals("There was a mismatch between expected result: " + expResult + " " + "And:  " + result, expResult, result);
//    }
//
//    /**
//     * Test of setProfilePicture method, of class User.
//     */
//    @Test
//    public void testSetProfilePicture() {
//        System.out.println("getProfilePicture");
//        String expResult = "c:/Doc/Picture";
//        instance.setProfilePicture(expResult);
//        String result = instance.getProfilePicture();
//        assertEquals("There was a mismatch between expected result: " + expResult + " " + "And:  " + result, expResult, result);
//    }
//
//    /**
//     * Test of getTweets method, of class User.
//     */
//    @Test
//    public void testGetTweets() {
//        System.out.println("getTweets");
//        int expResult = tweets.size();
//        int result = instance.getTweets().size();
//        assertEquals("There was a mismatch between expected result: " + expResult + " " + "And:  " + result ,expResult, result);
//    }
//
//    /**
//     * Test of setTweets method, of class User.
//     */
//    @Test
//    public void testSetTweets() {
//        System.out.println("getTweets");
//        int expResult = tweets.size();
//        int result = instance.getTweets().size();
//        assertEquals("There was a mismatch between expected result: " + expResult + " " + "And:  " + result ,expResult, result);
//    }
//
//    /**
//     * Test of getFollowers method, of class User.
//     */
//    @Test
//    public void testGetFollowers() {
//        int expResult = followers.size();
//        int result = instance.getFollowers().size();
//        assertEquals("There was a mismatch between expected result: " + expResult + " " + "And:  " + result ,expResult, result);
//    }
//
//    /**
//     * Test of setFollowers method, of class User.
//     */
//    @Test
//    public void testSetFollowers() {
//        instance.setFollowers(followers);
//        int expResult = followers.size();
//        int result = instance.getFollowers().size();
//        assertEquals("There was a mismatch between expected result: " + expResult + " " + "And:  " + result ,expResult, result);
//    }
//
//    /**
//     * Test of getFollowing method, of class User.
//     */
//    @Test
//    public void testGetFollowing() {
//        instance.setFollowing(followers);
//        int expResult = followers.size();
//        int result = instance.getFollowing().size();
//        assertEquals("There was a mismatch between expected result: " + expResult + " " + "And:  " + result ,expResult, result);
//    }
//
//    /**
//     * Test of setFollowing method, of class User.
//     */
//    @Test
//    public void testSetFollowing() {
//        instance.setFollowing(followers);
//        int expResult = followers.size();
//        int result = instance.getFollowing().size();
//        assertEquals("There was a mismatch between expected result: " + expResult + " " + "And:  " + result ,expResult, result);
//    }
//
//    /**
//     * Test of getLocation method, of class User.
//     */
//    @Test
//    public void testGetLocation() {
//        String expResult = "Roermond";
//        instance.setLocation(expResult);
//        String result = instance.getLocation();
//        assertEquals("There was a mismatch between expected result: " + expResult + " " + "And:  " + result ,expResult, result);
//    }
//
//    /**
//     * Test of setLocation method, of class User.
//     */
//    @Test
//    public void testSetLocation() {
//        String expResult = "Roermond";
//        instance.setLocation(expResult);
//        String result = instance.getLocation();
//        assertEquals("There was a mismatch between expected result: " + expResult + " " + "And:  " + result ,expResult, result);
//    }
//
//    /**
//     * Test of getBiography method, of class User.
//     */
//    @Test
//    public void testGetBiography() {
//        String expResult = "Bib1";
//        instance.setBiography(expResult);
//        String result = instance.getBiography();
//        assertEquals("There was a mismatch between expected result: " + expResult + " " + "And:  " + result ,expResult, result);
//    }
//
//    /**
//     * Test of setBiography method, of class User.
//     */
//    @Test
//    public void testSetBiography() {
//        String expResult = "Bib1";
//        instance.setBiography(expResult);
//        String result = instance.getBiography();
//        assertEquals("There was a mismatch between expected result: " + expResult + " " + "And:  " + result ,expResult, result);
//    }
//
//    /**
//     * Test of getWebsiteURL method, of class User.
//     */
//    @Test
//    public void testGetWebsiteURL() {
//        String expResult = "http://test";
//        instance.setWebsiteURL(expResult);
//        String result = instance.getWebsiteURL();
//        assertEquals("There was a mismatch between expected result: " + expResult + " " + "And:  " + result ,expResult, result);
//    }
//
//    /**
//     * Test of setWebsiteURL method, of class User.
//     */
//    @Test
//    public void testSetWebsiteURL() {
//       String expResult = "http://test";
//        instance.setWebsiteURL(expResult);
//        String result = instance.getWebsiteURL();
//        assertEquals("There was a mismatch between expected result: " + expResult + " " + "And:  " + result ,expResult, result);
//    }
//
//    /**
//     * Test of getId method, of class User.
//     */
//    @Test
//    public void testGetId() {
//        Long id = 1234567L;
//        instance.setId(id);
//        Long result = instance.getId();
//        assertEquals(id, result);
//    }
//
//    /**
//     * Test of setId method, of class User.
//     */
//    @Test
//    public void testSetId() {
//        Long id = 1234567L;
//        instance.setId(id);
//        Long result = instance.getId();
//        assertEquals(id, result);
//    }
//
//    /**
//     * Test of hashCode method, of class User.
//     */
//    @Test
//    public void testHashCode() {
//        Long id = 1234567L;
//        instance.setId(id);
//        int hashCode = id.hashCode();
//        int result = instance.hashCode();
//        assertEquals(hashCode, result);
//    }
//
//    /**
//     * Test of equals method, of class User.
//     */
//    @Test
//    public void testEquals() {
//        User testUser = new User("testuser");
//        testUser.setId(213891723L);
//        instance.setId(12391731L);        
//        assertFalse(instance.equals(testUser));
//        assertTrue(instance.equals(instance));
//    }
//
//    /**
//     * Test of toString method, of class User.
//     */
//    @Test
//    public void testToString() {
//        Long id = 1234567L;
//        instance.setId(id);
//        String expresult = "model.User[ id=" + id + " ]";
//        assertEquals(expresult, "model.User[ id=1234567 ]");
//    }
//    
//}
