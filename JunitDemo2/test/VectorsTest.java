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
 * @author Hadeel
 */
public class VectorsTest {
    
    public VectorsTest() {
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

    
    
    
    
    @Test
    public void testEqual() {        
        //Arrange
        Vectors instance = new Vectors();
        int[] a=new int[]{1,2};
        int[] b=new int[]{1,2};
        boolean expected = true;
        
        //Act
        boolean result = instance.equal(a, b);
        
        //Assert
        assertEquals("equal arrays doesn't work", expected, result);
        assertFalse("unequal arrays doesn't work", instance.equal(new int[]{1}, new int[]{2}));
        
    }

    @Test(timeout = 100)
    public void testEqualWithUnequalArrays() throws InterruptedException {        
        //Arrange
        Vectors instance = new Vectors();
        //Thread.sleep(4000);
        
        //Act and Assert
        assertFalse("doesn't work", instance.equal(new int[]{1}, new int[]{2}));
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testEqualWithNullArrays() {        
        //Arrange
        Vectors instance = new Vectors();
        //Act
        instance.equal(null, null);
    }
    
    
    
    
//    @Ignore
    @Test
    public void testScalarMultiplication() {
        ICalculationsService calculationMock = mock(ICalculationsService.class);
        when(calculationMock.multiply(1, 1)).thenReturn(1);
        when(calculationMock.multiply(2, 2)).thenReturn(4);
        
        when(calculationMock.multiply(anyInt(), eq(0))).thenReturn(0);
        
        
        Vectors vector = new Vectors(calculationMock);
        int expResult = 1;
        int result = vector.scalarMultiplication(new int[]{1, 2}, new int[]{1, 0});
        assertEquals(expResult, result);
        //verify that the method multiply is called with the paremeters 1 and 1
        verify(calculationMock).multiply(1, 1);
        //verify it's called once
        verify(calculationMock,times(1)).multiply(1, 1);
        
    }    

}
