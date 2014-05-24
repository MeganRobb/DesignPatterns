/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package StructuralTest;

import com.megan.designpatterns.Structural.FlyWeight.FlyWeight;
import com.megan.designpatterns.Structural.FlyWeight.FlyWeightFactory;
import org.testng.Assert;
import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author Megan
 */
public class FlyWeightTest {
    
    public FlyWeightTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
     @Test
    public void testFlyweight() {
        FlyWeightFactory flyweightF = FlyWeightFactory.getInstance();
        
        FlyWeight add = flyweightF.getFlyweight("add");
        
        Assert.assertEquals(add.doMath(2, 3), 5);
       
        FlyWeight multiply = flyweightF.getFlyweight("multiple");
        
        Assert.assertEquals(multiply.doMath(2, 3), 6);
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
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
