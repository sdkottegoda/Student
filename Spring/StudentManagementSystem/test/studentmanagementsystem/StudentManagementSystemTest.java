/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package studentmanagementsystem;

import org.junit.Assert;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Sasikala Kottegoda
 */
public class StudentManagementSystemTest {

    public StudentManagementSystemTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    @Test
    public void testListAllStudents() {
        System.out.println("listAllStudents");
        StudentManagementSystem instance = new StudentManagementSystem();
        instance.getRepository().saveStudent(null);
        // TODO review the generated test code and remove the default call to fail.
        try{
            Assert.assertNotNull("The repo is not initialized",instance.getRepository());
            instance.listAllStudents();
        }
        catch(Exception e){
            fail("Student is null");
        }
    }

    /**
     * Test of registerStudent method, of class StudentManagementSystem.
     */
    @Test
    public void testRegisterStudent() {
        System.out.println("registerStudent");
        StudentManagementSystem instance = new StudentManagementSystem();
        try{
            Assert.assertNotNull("The repo is not initialized",instance.getRepository());       
        }
        catch(Exception e){
            fail("The test case is a prototype.");
        }
        
    }

}