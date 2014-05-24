/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.megan.designpatterns.Structural.Proxy;

/**
 *
 * @author Megan
 */
public class SlowThing extends Thing {
    public SlowThing (){
        try{
            Thread.sleep(5000);
            System.out.println("Created slow thing");
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
    
}
