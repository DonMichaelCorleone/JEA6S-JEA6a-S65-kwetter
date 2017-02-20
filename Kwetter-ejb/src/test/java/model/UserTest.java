/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import model.*;
import org.mockito.Mockito;

/**
 *
 * @author Loek
 */
public class UserTest {
    private User instance = null;
    private Posting p = null;
    public UserTest() {
      
    }
    
    @BeforeClass
    public static void setUpClass() {
          
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        System.out.println("setUp method called" );
//        instance =  new User("Instance");
instance = Mockito.mock(User.class);
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getUserName method, of class User.
     */
    @Test
    public void testGetUserName() {
        instance.setUserName("Instance1");
        String expResult = "Instance1";
        String result = instance.getUserName();
        assertEquals("There was a mismatch between expected result: " + expResult + " " + "And:  " + result, expResult, result);
    }

    /**
     * Test of setUserName method, of class User.
     */
    @Test
    public void testSetUserName() {
        System.out.println("setUserName");
        String userName = "";
        User instance = null;
        instance.setUserName(userName);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getProfilePicture method, of class User.
     */
    @Test
    public void testGetProfilePicture() {
        System.out.println("getProfilePicture");
        User instance = null;
        String expResult = "";
        String result = instance.getProfilePicture();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setProfilePicture method, of class User.
     */
    @Test
    public void testSetProfilePicture() {
        System.out.println("setProfilePicture");
        String profilePicture = "";
        User instance = null;
        instance.setProfilePicture(profilePicture);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTweets method, of class User.
     */
    @Test
    public void testGetTweets() {
        System.out.println("getTweets");
        User instance = null;
        ArrayList<Posting> expResult = null;
        ArrayList<Posting> result = instance.getTweets();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTweets method, of class User.
     */
    @Test
    public void testSetTweets() {
        System.out.println("setTweets");
        ArrayList<Posting> tweets = null;
        User instance = null;
        instance.setTweets(tweets);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFollowers method, of class User.
     */
    @Test
    public void testGetFollowers() {
        System.out.println("getFollowers");
        User instance = null;
        ArrayList<User> expResult = null;
        ArrayList<User> result = instance.getFollowers();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setFollowers method, of class User.
     */
    @Test
    public void testSetFollowers() {
        System.out.println("setFollowers");
        ArrayList<User> followers = null;
        User instance = null;
        instance.setFollowers(followers);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFollowing method, of class User.
     */
    @Test
    public void testGetFollowing() {
        System.out.println("getFollowing");
        User instance = null;
        ArrayList<User> expResult = null;
        ArrayList<User> result = instance.getFollowing();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setFollowing method, of class User.
     */
    @Test
    public void testSetFollowing() {
        System.out.println("setFollowing");
        ArrayList<User> following = null;
        User instance = null;
        instance.setFollowing(following);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLocation method, of class User.
     */
    @Test
    public void testGetLocation() {
        System.out.println("getLocation");
        User instance = null;
        String expResult = "";
        String result = instance.getLocation();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setLocation method, of class User.
     */
    @Test
    public void testSetLocation() {
        System.out.println("setLocation");
        String location = "";
        User instance = null;
        instance.setLocation(location);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getBiography method, of class User.
     */
    @Test
    public void testGetBiography() {
        System.out.println("getBiography");
        User instance = null;
        String expResult = "";
        String result = instance.getBiography();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setBiography method, of class User.
     */
    @Test
    public void testSetBiography() {
        System.out.println("setBiography");
        String biography = "";
        User instance = null;
        instance.setBiography(biography);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getWebsiteURL method, of class User.
     */
    @Test
    public void testGetWebsiteURL() {
        System.out.println("getWebsiteURL");
        User instance = null;
        String expResult = "";
        String result = instance.getWebsiteURL();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setWebsiteURL method, of class User.
     */
    @Test
    public void testSetWebsiteURL() {
        System.out.println("setWebsiteURL");
        String websiteURL = "";
        User instance = null;
        instance.setWebsiteURL(websiteURL);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getId method, of class User.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        User instance = null;
        Long expResult = null;
        Long result = instance.getId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setId method, of class User.
     */
    @Test
    public void testSetId() {
        System.out.println("setId");
        Long id = null;
        User instance = null;
        instance.setId(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of hashCode method, of class User.
     */
    @Test
    public void testHashCode() {
        System.out.println("hashCode");
        User instance = null;
        int expResult = 0;
        int result = instance.hashCode();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of equals method, of class User.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object object = null;
        User instance = null;
        boolean expResult = false;
        boolean result = instance.equals(object);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class User.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        User instance = null;
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
