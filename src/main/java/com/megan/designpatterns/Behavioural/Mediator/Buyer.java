/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.megan.designpatterns.Behavioural.Mediator;

/**
 *
 * @author Megan
 */
public class Buyer {
    Mediator mediator;
    String unitofCurrency;
    
    public Buyer(Mediator mediator, String unitofCurrency){
        this.mediator=mediator;
        this.unitofCurrency=unitofCurrency;
    }
    public boolean attemptToPurchase(float bid){
        System.out.println("Buyer attemping a bid of"+bid+" "+unitofCurrency);
        return mediator.placeBid(bid, unitofCurrency);
    }
    
}
