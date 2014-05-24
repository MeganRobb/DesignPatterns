/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.megan.designpatterns.Behavioural.State;

/**
 *
 * @author Megan
 */
public class HappyState implements EmotionalState {
    @Override
    public String sayGoodbye(){
        return "Bye,friend";
    }
    @Override
    public String sayHello(){
        return "Hello, friend";
    }
    
}
