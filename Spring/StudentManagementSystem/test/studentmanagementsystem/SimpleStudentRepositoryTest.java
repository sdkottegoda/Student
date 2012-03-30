/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package studentmanagementsystem;

import java.util.List;
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
public class SimpleStudentRepositoryTest {

    public SimpleStudentRepositoryTest() {
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

    /**
     * Test of saveStudent method, of class SimpleStudentRepository.
     */
    @Test
    public void testSaveStudent() {
        System.out.println("saveStudent");
        Student stu = null;
        SimpleStudentRepository instance = new SimpleStudentRepository();
        try{
            instance.saveStudent(stu);
        }
        catch (Exception e){
            fail("StudentNull");
        }
    }

    /**
     * Test of deleteStudent method, of class SimpleStudentRepository.
     */
    @Test
    public void testDeleteStudent() {
        System.out.println("deleteStudent");
        Student stu = null;
        SimpleStudentRepository instance = new SimpleStudentRepository();
        
        try{
            instance.deleteStudent(stu);

        }
        catch(Exception e){
                        fail("Student empty");
        }
    
    }

    /**
     * Test of findStudent method, of class SimpleStudentRepository.
     */
    @Test
    public void testFindStudent() {
        System.out.println("findStudent");
        long regNumber = 0L;
        SimpleStudentRepository instance = new SimpleStudentRepository();
        Student expResult = null;
        Student result = instance.findStudent(regNumber);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updateStudent method, of class SimpleStudentRepository.
     */
    @Test
    public void testUpdateStudent() {
        System.out.println("updateStudent");
        Student stu = null;
        String aField = "";
        String aValue = "";
        SimpleStudentRepository instance = new SimpleStudentRepository();
        instance.updateStudent(stu, aField, aValue);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findAllStudents method, of class SimpleStudentRepository.
     */
    @Test
    public void testFindAllStudents() {
        System.out.println("findAllStudents");
        SimpleStudentRepository instance = new SimpleStudentRepository();
        List expResult = null;
        List result = instance.findAllStudents();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

}