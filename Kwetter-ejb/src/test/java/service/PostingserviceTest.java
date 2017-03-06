/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import java.sql.SQLException;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import model.Posting;
import model.User;
import service.*;
import util.DatabaseCleaner;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Loek
 */
public class PostingserviceTest {
    
    EntityManagerFactory emf = Persistence.createEntityManagerFactory("kwetterPU");
    EntityManager  em = emf.createEntityManager();
    
    DatabaseCleaner DBCleaner =  new DatabaseCleaner(em);
    Postingservice postingService = new Postingservice(em);
    
    private User u;
    private Posting p;
    private Posting P;
    
    @Before
    public void setUp() throws Exception {
//        DBCleaner.clean();
        u = new User("Harrie");
        p = new Posting(u, "String1" , "String2");
        P = new Posting(u, "String3" , "String4");
        postingService.create(p);
    }   
    
    public PostingserviceTest() {
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
     * Test of create method, of class Postingservice.
     */
    @Test
    public void testCreate() {
        System.out.println("testCreate");
        postingService.create(P);
        System.out.println("GetId");
        assertEquals(postingService.find(P.getId()), P);
    }

    /**
     * Test of edit method, of class Postingservice.
     */
    @Test
    public void testEdit() {
        System.out.println("testEdit");
        postingService.create(p);
        p.setContent("testEdit setContent");
        postingService.edit(p);
        assertEquals(p.getContent(), postingService.find(p.getId()).getContent());
    }
//
//    /**
//     * Test of remove method, of class Postingservice.
//     */
    @Test
    public void testRemove() {
        System.out.println("remove");
        assertNotNull(postingService.find(p.getId()));
        postingService.remove(p.getId());
        assertNull(postingService.find(p.getId()));
    }
//
//    /**
//     * Test of findAll method, of class Postingservice.
//     */
    @Test
    public void testFindAll() {
         System.out.println("testFindAll");
         System.out.print(" Size: "  + postingService.findAll(u).size());
    }
//
//    /**
//     * Test of find method, of class Postingservice.
//     */
//    @Test
//    public void testFind() {
//        System.out.println("testfind");
//    }
    
}
