///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package model;
//
//import util.DatabaseCleaner;
//
//import java.sql.SQLException;
//import javax.persistence.EntityManager;
//import javax.persistence.EntityManagerFactory;
//import javax.persistence.Persistence;
//import javax.persistence.PersistenceContext;
//import org.junit.After;
//import org.junit.AfterClass;
//import org.junit.Before;
//import org.junit.BeforeClass;
//import org.junit.Test;
//import static org.junit.Assert.*;
//import service.Postingservice;
//import service.Userservice;
//
///**
// *
// * @author Loek
// */
//public class PostingJPATest {
//    
//    @PersistenceContext(unitName = "ESW-JPA-Demo1PU")
//    private EntityManager em;
//    
//    Postingservice postingService = new Postingservice();
//    Userservice userService = new Userservice();
//    
//    public PostingJPATest() {
//         util.DatabaseCleaner databaseCleaner = new util.DatabaseCleaner(em);
//        try {
//            databaseCleaner.clean();
//        } catch  (SQLException e) {
//            e.printStackTrace();
//        } finally {
////            em = emf.createEntityManager();
//        }   
//    }
//    @BeforeClass
//    public static void setUpClass() {
//    }
//    
//    @AfterClass
//    public static void tearDownClass() {
//    }
//    
//    @Before
//    public void setUp() {
//    }
//    
//    @After
//    public void tearDown() {
//    }
//
//    // TODO add test methods here.
//    // The methods must be annotated with annotation @Test. For example:
//    //
//    // @Test
//    // public void hello() {}
//}
