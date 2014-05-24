/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.megan.designpatterns.Behavioural.ChainofRespons;

/**
 *
 * @author Megan
 */
public class MercuryHandler extends PlanetHandler{
    public void handleRequest (PlanetEnum request){
        if(request == PlanetEnum.MERCURY){
            System.out.println("MecuryHandler handles"+request);
            System.out.println("Mercury is hot");
        }else{System.out.println("MercuryHandler doesnt handle"+ request);
        if(successor!= null){
            successor.handleRequest(request);
        }
        }
    }
    
}
