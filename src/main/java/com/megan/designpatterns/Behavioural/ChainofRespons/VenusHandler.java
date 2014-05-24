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
public class VenusHandler extends PlanetHandler {
     public void handleRequest (PlanetEnum request){
        if(request == PlanetEnum.VENUS){
            System.out.println("VenusHandler handles"+request);
            System.out.println("Venus is hot");
        }else{System.out.println("VenusHandler doesnt handle"+ request);
        if(successor!= null){
            successor.handleRequest(request);
        }
        }
    }
}
