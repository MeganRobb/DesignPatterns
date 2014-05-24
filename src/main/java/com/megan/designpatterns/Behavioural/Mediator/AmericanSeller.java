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
public class AmericanSeller {
    Mediator mediator;
    float priceinDollars;
    
    public AmericanSeller(Mediator mediator,float priceinDollars){
        this.mediator = mediator;
        this.priceinDollars = priceinDollars;
        this.mediator.registerAmericanSeller(this);
    }
    public boolean isBidAccepted (float bidinDollars){
        if(bidinDollars >= priceinDollars){
            System.out.println("Seller accepts the bid of"+bidinDollars+"dollars\n");
            return true;
        }else{System.out.println("Seller rejects the bid of"+bidinDollars+"dollars\n");
        return false;
        }
    }
    
}
