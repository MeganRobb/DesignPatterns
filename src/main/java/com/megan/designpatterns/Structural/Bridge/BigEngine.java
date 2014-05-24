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
public class BigEngine implements Engine {
    int horsepower;
    public BigEngine(){
        horsepower = 350;
    }
    @Override
    public int go(){
        System.out.println("The big engine is running");
        return horsepower;
    }
    
}
