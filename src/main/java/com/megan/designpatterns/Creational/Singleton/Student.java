/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.megan.designpatterns.Creational.Singleton;

/**
 *
 * @author Megan
 */
public class Student {
    
    private static Student myStudent;
    private String name = "Test";
    
    private Student()
    {
    
    }
    
    public synchronized static Student instance(){
        if(myStudent == null){
            myStudent = new Student();
        }
        return myStudent;
    }
    
    public String getName(){
        return name;
    }
    
}

