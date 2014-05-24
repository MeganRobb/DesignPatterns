/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.megan.designpatterns.Structural.FlyWeight;

/**
 *
 * @author Megan
 */
public class FlyWeightMulti implements FlyWeight{
   String operation;
    
    public FlyWeightMulti() {
        
        operation = "multiplying";
        
        try{
            Thread.sleep(3000);
        }catch(InterruptedException e){
            e.printStackTrace();
        }
    }

    public int doMath(int a, int b) {
        return (a * b);
    }
    
}
