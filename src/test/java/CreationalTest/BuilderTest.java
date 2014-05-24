/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package CreationalTest;

import com.megan.designpatterns.Creational.Builder.ItalianMealBuilder;
import com.megan.designpatterns.Creational.Builder.Meal;
import com.megan.designpatterns.Creational.Builder.MealBuilder;
import com.megan.designpatterns.Creational.Builder.MealDirector;
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
public class BuilderTest {
    
    public BuilderTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void builderTest() {
        MealBuilder pb = new ItalianMealBuilder();
        MealDirector pd = new MealDirector(pb);
        pd.constructMeal();
        Meal pers = pd.getMeal();
        
        Assert.assertEquals("pizza", pers.getMainCourse());
        
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
