/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package CreationalTest;

import com.megan.designpatterns.Creational.FactoryMethod.AnimalFactory;
import com.megan.designpatterns.Creational.FactoryMethod.Animals;
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
public class FactoryTest {
      private static AnimalFactory trans;
    private static Animals vehicle1;
    private static Animals vehicle2;
    public FactoryTest() {
    }

   
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void createTransport() {
        
        trans = new AnimalFactory();
        
        vehicle1 =  trans.getAnimal("canine");
        vehicle2 =  trans.getAnimal("cat");
        
        Assert.assertEquals("woof", vehicle1.makeSound());
        
        Assert.assertEquals("meow", vehicle2.makeSound());
        
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
