/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.megan.designpatterns.Structural.Bridge;

/**
 *
 * @author Megan
 */
public abstract class Vehicle {
    Engine engine;
    int weightInKilos;
    public abstract String drive();
    
    public void setEngine(Engine engine){
        this.engine = engine;
    }
    public String reportOnSpeed(int horsepower){
        int ratio = weightInKilos /horsepower;
        if(ratio < 3){
           return "Fast speed";
                    }else if((ratio>=3)&&(ratio<8)){
                        return "Average speed";
                    }else{
                            return "slow";
                            }
    }
    
}
