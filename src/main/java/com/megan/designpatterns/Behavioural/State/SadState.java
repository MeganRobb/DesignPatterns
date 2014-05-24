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
public class SadState implements EmotionalState{
      @Override
    public String sayGoodbye(){
        return "Bye,sniff sniff";
    }
    @Override
    public String sayHello(){
        return "Hello, sniff sniff";
    }
}
