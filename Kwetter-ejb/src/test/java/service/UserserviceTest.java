/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import java.util.List;
import javax.ejb.embeddable.EJBContainer;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import model.Posting;
import model.User;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import util.DatabaseCleaner;

/**
 *
 * @author Loek
 */
public class UserserviceTest {
    EntityManagerFactory emf = Persistence.createEntityManagerFactory("kwetterPU");
    EntityManager  em = emf.createEntityManager();
    
    DatabaseCleaner DBCleaner =  new DatabaseCleaner(em);
    Userservice userService = new Userservice(em);
    
    private User u;
    private User uInstance;
    
    @Before
    public void setUp() throws Exception {
//        DBCleaner.clean();
        u = new User("Loek");
        uInstance = new User("Delahaye");
        userService.create(u);
    }   
    
    public UserserviceTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of create method, of class Userservice.
     */
    @Test
    public void testCreate() throws Exception {
        userService.create(uInstance);
        assertEquals(uInstance, userService.find(uInstance.getId()));
    }

    /**
     * Test of findByUserName method, of class Userservice.
     */
    @Test
    public void testFindByUserName() throws Exception {
       String userName = "Loek Delahaye"; 
       u.setUserName(userName);
       userService.edit(u);
       User found = (User) userService.findByUserName(userName);
       assertNotNull(found);
    }

    /**
     * Test of remove method, of class Userservice.
     */
    @Test
    public void testRemove() throws Exception {
        userService.remove(u.getId());
        assertNull(userService.find(u.getId()));
    }

    /**
     * Test of edit method, of class Userservice.
     */
    @Test
    public void testEdit() throws Exception {
        String url = "http://test.com";
        u.setWebsiteURL(url);
        userService.edit(u);
        User newInstance = userService.find(u.getId());
        assertSame(u.getWebsiteURL(), url);
                
    }

    /**
     * Test of find method, of class Userservice.
     */
    @Test
    public void testFind() throws Exception {
        userService.create(u);
        User instance = userService.find(u.getId());
        assertSame(instance, u);
    }

    /**
     * Test of findAllFollowers method, of class Userservice.
     */
    @Test
    public void testFindAllFollowers() throws Exception {
       userService.create(uInstance);
       u.addFollower(uInstance);
       userService.edit(u);
       assertSame(uInstance, u.getFollowers().indexOf(0));
    }

//    /**
//     * Test of findAllFollows method, of class Userservice.
//     */
//    @Test
//    public void testFindAllFollows() throws Exception {
//        System.out.println("findAllFollows");
//        Long id = null;
//        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
//        Userservice instance = (Userservice)container.getContext().lookup("java:global/classes/Userservice");
//        List<User> expResult = null;
//        List<User> result = instance.findAllFollows(id);
//        assertEquals(expResult, result);
//        container.close();
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of getFollower method, of class Userservice.
//     */
//    @Test
//    public void testGetFollower() throws Exception {
//        System.out.println("getFollower");
//        Long id = null;
//        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
//        Userservice instance = (Userservice)container.getContext().lookup("java:global/classes/Userservice");
//        User expResult = null;
//        User result = instance.getFollower(id);
//        assertEquals(expResult, result);
//        container.close();
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of getFollows method, of class Userservice.
//     */
//    @Test
//    public void testGetFollows() throws Exception {
//        System.out.println("getFollows");
//        Long id = null;
//        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
//        Userservice instance = (Userservice)container.getContext().lookup("java:global/classes/Userservice");
//        User expResult = null;
//        User result = instance.getFollows(id);
//        assertEquals(expResult, result);
//        container.close();
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of setPassword method, of class Userservice.
//     */
//    @Test
//    public void testSetPassword() throws Exception {
//        System.out.println("setPassword");
//        Long id = null;
//        String password = "";
//        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
//        Userservice instance = (Userservice)container.getContext().lookup("java:global/classes/Userservice");
//        instance.setPassword(id, password);
//        container.close();
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
    
}
