/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.megan.designpatterns.Creational.AbstartMethod;

import com.megan.designpatterns.Creational.FactoryMethod.Animals;
import com.megan.designpatterns.Creational.FactoryMethod.Cats;
import com.megan.designpatterns.Creational.FactoryMethod.Dog;

/**
 *
 * @author Megan
 */
public class MammalFactory extends SpeciesFactory{
    @Override 
    public Animals getAnimal (String type){
        if("dog".equals(type)){
            return new Dog();
        }else{
            return new Cats();
            
        }
    }
    
}
