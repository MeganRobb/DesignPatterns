/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.megan.designpatterns.Behavioural.TemplateMethod;

/**
 *
 * @author Megan
 */
public class HamburgerMeal extends Meal {
    @Override 
    public void prepareIngredients(){
        System.out.println("Getting burgers,bun,and french fries");
    }
    @Override
    public void cook(){
        System.out.println("Cooking burgers on grill and fries in oven");
    }
@Override 
public void cleanUp(){
    System.out.println("Throwing away paper plates");
}
public String finalMeal()
    {
        return "Hamburger";
    }
}

