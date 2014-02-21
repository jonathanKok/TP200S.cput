/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.tpg200s.cput.newcalculator;

import com.tpg200s.cput.newcalculator.service.calcImplement;
import com.tpg200s.cput.newcalculator.service.calcService;
import org.junit.Ignore;
import org.testng.Assert;
import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author student
 */
public class calcTest {
    
    public static calcService service;
    
    public calcTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
     @Test  
     public void add() 
     {
         Assert.assertEquals(service.add(2, 3), 5);
     }
     @Test
     public void addDoubleVals() 
     {
         Assert.assertEquals(service.addDoubleVals(2.0, 3.0), 5.0);
     }
     @Test
     public void isNull()
     {
         Integer obj = null;         
         
         Assert.assertNull(obj);
     }
     @Test
     public void isNotNull()
     {
         Integer obj = 10;
         
         Assert.assertNotNull(obj);
     }
     @Test
     public void checkObjectSame()
     {
         Integer obj1 = 10;
         Integer obj2 = 10;
     
         Assert.assertSame(service.isEquals(obj1, obj2), true);
     }
     @Test
     public void checkObjectNotSame()
     {
         Integer obj1 = 10;
         Integer obj2 = 10;
     
         Assert.assertNotSame(service.isNotEquals(obj1, obj2), true);
     }
     
     @Test
     public void testAssertTrue()
     {
         boolean a = true;
         Assert.assertTrue(service.testTrue(a));    
     }
     
     @Test
     public void testAssertFalse()
     {
         boolean a = false;
         Assert.assertTrue(service.testFalse(a));
     }
     
     @Test
     public void testAssertMessageRight()
     {
         Assert.assertEquals(service.add(2, 3), 5, "That is correct!");
     }
     
     @Test
     public void testArrayEquals()
     {
         
         String[] arrayColours1 = {"Red", "Blue", "Green"};
         String[] arrayColours2 = {"Purple", "Blue", "Green"};
         
         Assert.assertNotEquals(arrayColours1,arrayColours2);
     }
     
     @Test(expectedExceptions = ArithmeticException.class)
     public void errorMethodNull() throws ArithmeticException
     {
          int testOne = 10/0; 
     }
     
     @Ignore
     public void ignoreThis()
	 {	 
	 }

    @BeforeClass
    public static void setUpClass() throws Exception 
    {
        service = new calcImplement();
        
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }
}
