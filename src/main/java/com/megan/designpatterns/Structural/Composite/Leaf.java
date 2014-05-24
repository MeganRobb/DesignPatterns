/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.megan.designpatterns.Structural.Composite;

/**
 *
 * @author Megan
 */
public class Leaf implements Component {
    String name;
    
    public Leaf(String name){
        this.name = name;
    }
   
    public void sayHello(){
        System.out.println(name+"Leaf says hello");
    }
    
    public void sayGoodBye(){
        System.out.println(name+"leaf says Goodbye");
    }
}
