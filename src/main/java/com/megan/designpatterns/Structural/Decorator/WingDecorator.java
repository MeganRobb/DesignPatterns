/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.megan.designpatterns.Structural.Decorator;

/**
 *
 * @author Megan
 */
public class WingDecorator extends AnimalDecorator {
    public WingDecorator (Animal animal){
        super(animal);
    }
    
    public String describe(){
        animal.describe();
        fly();
        return "I have wings";
        
    }
    public void fly(){
        System.out.println("I can Fly");
    }
}
