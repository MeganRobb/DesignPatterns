/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package StructuralTest;

import com.megan.designpatterns.Behavioural.State.Person;
import com.megan.designpatterns.Structural.Composite.Composite;
import com.megan.designpatterns.Structural.Composite.Leaf;
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
public class CompositeTest {
    
    public CompositeTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
     @Test
    public void testComposite() {
        
        Leaf pers1 = new Leaf("Tracy");
        Leaf pers2 = new Leaf("JR");
        Leaf pers3 = new Leaf("Simon");
        
        Composite comp1 = new Composite();
        comp1.add(pers1);
        comp1.add(pers2);
        comp1.add(pers3);
        
        //Assert.assertEquals(pers1.sayHello(), "Tracy person says hello");
        Assert.assertNotNull(comp1);
        
        
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
