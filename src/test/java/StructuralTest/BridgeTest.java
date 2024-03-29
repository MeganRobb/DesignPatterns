/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package StructuralTest;

import com.megan.designpatterns.Structural.Bridge.BigBus;
import com.megan.designpatterns.Structural.Bridge.BigEngine;
import com.megan.designpatterns.Structural.Bridge.SmallCar;
import com.megan.designpatterns.Structural.Bridge.SmallEngine;
import com.megan.designpatterns.Structural.Bridge.Vehicle;
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
public class BridgeTest {
    
    public BridgeTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
     @Test
    public void testBridge() {
        Vehicle vehicle = new BigBus(new SmallEngine());
        Assert.assertEquals(vehicle.drive(), "Slow Speed");
        vehicle.setEngine(new BigEngine());
        Assert.assertEquals(vehicle.drive(), "Slow Speed");
        
        vehicle = new SmallCar(new SmallEngine());
        Assert.assertEquals(vehicle.drive(), "Average Speed");
        vehicle.setEngine(new BigEngine());
        Assert.assertEquals(vehicle.drive(), "Fast Speed");
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
