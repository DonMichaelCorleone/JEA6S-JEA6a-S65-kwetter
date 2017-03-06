///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package model;
//
//import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.date;
//import java.util.ArrayList;
//import java.util.Date;
//import java.util.GregorianCalendar;
//import java.util.List;
//import jdk.nashorn.internal.objects.NativeArray;
//import static org.hamcrest.CoreMatchers.instanceOf;
//import org.junit.After;
//import org.junit.AfterClass;
//import org.junit.Before;
//import org.junit.BeforeClass;
//import org.junit.Test;
//import static org.junit.Assert.*;
//
///**
// *
// * @author Loek
// */
//public class PostingTest {
//    
//    private Posting instance = null;
//    private User testUser = null;
//    private Posting p = null;
//    private ArrayList<User> followers =  new ArrayList<User>();
//    private ArrayList<Posting> tweets =  new ArrayList<Posting>();
//    
//    public PostingTest() {
//    }
//    
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
//        testUser =  new User("testUser");
//        instance =  new Posting(testUser, "instancePost", "testdescription");
//        instance.addComment("testdescriptionpostinginstance");
//        for(int i = 0; i < 16; i++){
//            User u = new User("Author : " + i);
//            User s =  new User("Follower :" + i);
//            followers.add(s);
//            u.setFollowers(followers);
//            Posting p  = new Posting(testUser, "TestPosting" + i, "Testdescription" + i);
//            p.setAuthor(u);
//            p.addComment("Content : " + i);
//            tweets.add(p);
//        }
//    }
//    
//    @After
//    public void tearDown() {
//    }
//
//    /**
//     * Test of getComments method, of class Posting.
//     */
//    @Test
//    public void testGetComments() {
//        for(int i =0; i < tweets.size(); i++){
//            assertEquals(tweets.get(i).getComments().get(0).getContent(), "Content : " + i);
//        }
//    }
//
//    /**
//     * Test of addComment method, of class Posting.
//     */
//    @Test
//    public void testAddComment() {
//        instance.addComment("testAddComment");
//        assertEquals(instance.getComments().size(), 2);
//    }
//
//    /**
//     * Test of getContent method, of class Posting.
//     */
//    @Test
//    public void testGetContent() {
//        instance.setContent("InstanceContent");
//        assertEquals(instance.getContent(),"InstanceContent");
//        instance.setContent("InstanceContent2");
//        assertEquals(instance.getContent(),"InstanceContent2");
//    }
//
//    /**
//     * Test of setContent method, of class Posting.
//     */
//    @Test
//    public void testSetContent() {
//        instance.setContent("InstanceContent");
//        assertEquals(instance.getContent(),"InstanceContent");
//        instance.setContent("InstanceContent2");
//        assertEquals(instance.getContent(),"InstanceContent2");
//    }
//
//    /**
//     * Test of getDate method, of class Posting.
//     */
//    @Test
//    public void testGetDate() {
//        System.out.println("TestGetDate");
//        System.out.println(instance.getDate());
//        assertThat(instance.getDate(), instanceOf(GregorianCalendar.class));
//    }
//
//    /**
//     * Test of getId method, of class Posting.
//     */
//    @Test
//    public void testGetId() {
//        long expResult = 12387131L;
//        instance.setId(expResult);
//        long result = instance.getId();
//        assertEquals("Difference between result : " + result + " " + "and expResult :" + expResult,result, expResult);
//    }
//
//    /**
//     * Test of setId method, of class Posting.
//     */
//    @Test
//    public void testSetId() {
//        long expResult = 12387131L;
//        instance.setId(expResult);
//        long result = instance.getId();
//        assertEquals("Difference between result : " + result + " " + "and expResult :" + expResult,result, expResult);
//    }
//
//    /**
//     * Test of getAuthor method, of class Posting.
//     */
//    @Test
//    public void testGetAuthor() {
//        
//        instance.setAuthor(testUser);
//        assertEquals("Difference between expected: " + testUser + " " + "And ", instance.getAuthor(), testUser);
//    }
//
//    /**
//     * Test of setAuthor method, of class Posting.
//     */
//    @Test
//    public void testSetAuthor() {
//        System.out.println("setAuthor");
//        User author = null;
//        Posting instance = null;
//        instance.setAuthor(author);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of getTitle method, of class Posting.
//     */
//    @Test
//    public void testGetTitle() {
//        System.out.println("getTitle");
//        Posting instance = null;
//        String expResult = "";
//        String result = instance.getTitle();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of setTitle method, of class Posting.
//     */
//    @Test
//    public void testSetTitle() {
//        System.out.println("setTitle");
//        String title = "";
//        Posting instance = null;
//        instance.setTitle(title);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//    
//}
