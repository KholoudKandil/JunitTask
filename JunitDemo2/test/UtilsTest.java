/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Ignore;
import static org.mockito.Mockito.*;


/**
 *
 * @author Kholoud
 */
public class UtilsTest {
    
    public UtilsTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of ComputeFactorial method, of class Utils.
     */
    @Test
    public void testComputeFactorial() {
       
        ICalculationsService calculationMock = mock(ICalculationsService.class);
        when(calculationMock.multiply(3, 1)).thenReturn(3);
        when(calculationMock.multiply(10, 2)).thenReturn(20);
        when(calculationMock.multiply(6, 3)).thenReturn(18);
        
        when(calculationMock.multiply(anyInt(), eq(0))).thenReturn(0);
        
        Utils utils = new Utils(calculationMock);
        
        int number = 3;
        int expResult = 0;
        int result = utils.ComputeFactorial(number);
        assertEquals(expResult, result);
       
    }

    
    @Test(expected=IllegalArgumentException.class)
    public void testComputeFactorialfail() {
        Utils utils = new Utils();
        
        utils.ComputeFactorial(-4);
    }
    /**
     * Test of Concat method, of class Utils.
     */

    @Test
    public void testConcatWithEmptyString() {
        System.out.println("Concat");
        String word1 = "";
        String word2 = "";
        Utils instance = new Utils();
        String expResult = "";
        String result = instance.Concat(word1, word2);
        assertEquals(expResult, result);
        
    }
    
    @Test
    public void testConcat() {
        System.out.println("Concat");
        String word1 = "Hel";
        String word2 = "wan";
        Utils instance = new Utils();
        String expResult = "Helwan";
        String result = instance.Concat(word1, word2);
        assertEquals(expResult, result);
        
    }
    
}
