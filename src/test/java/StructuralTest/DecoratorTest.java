/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package StructuralTest;

import com.megan.designpatterns.Structural.Decorator.Animal;
import com.megan.designpatterns.Structural.Decorator.LegDecorator;
import com.megan.designpatterns.Structural.Decorator.LivingAnimals;
import com.megan.designpatterns.Structural.Decorator.WingDecorator;
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
public class DecoratorTest {
    
    public DecoratorTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
     @Test
    public void testDecorator() {
        Animal animal = new LivingAnimals();
        
        Assert.assertEquals(animal.describe(),"I am an animal");
        animal = new LegDecorator(animal);
        Assert.assertEquals(animal.describe(),"I have legs");
        
        animal = new WingDecorator(animal);
        Assert.assertEquals(animal.describe(),"I have wings");
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
