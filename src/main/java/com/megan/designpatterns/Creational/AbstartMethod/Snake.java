/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.megan.designpatterns.Creational.AbstartMethod;

import com.megan.designpatterns.Creational.FactoryMethod.Animals;

/**
 *
 * @author Megan
 */
 public class Snake extends Animals{
    @Override 
    public String makeSound(){
        return "Hiss";
    }
    
}
