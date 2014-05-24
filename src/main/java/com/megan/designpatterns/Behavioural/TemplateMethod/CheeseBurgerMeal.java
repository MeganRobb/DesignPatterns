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
public class CheeseBurgerMeal extends Meal {
     @Override 
    public void prepareIngredients(){
        System.out.println("Getting ground beef and cheese");
    }
    @Override
    public void cook(){
        System.out.println("Cooking ground beef in pan");
    }
@Override 
public void cleanUp(){
    System.out.println("doing dishes");
}
 public String finalMeal()
    {
        return "Cheeseburger";
    }
}
