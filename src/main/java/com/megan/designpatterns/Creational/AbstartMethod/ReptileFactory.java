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
public class ReptileFactory extends SpeciesFactory {
    @Override
    public Animals getAnimal (String type){
        if("snake".equals(type)){
            return new Snake();
            
        }else{
            return new Tyrannosarus();
        }
    }
    
}
