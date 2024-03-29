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
public class EarthHandler extends PlanetHandler {
    public void handleRequest (PlanetEnum request){
        if(request == PlanetEnum.EARTH){
            System.out.println("EarthHandler handles"+request);
            System.out.println("Earth is hot");
        }else{System.out.println("EarthHandler doesnt handle"+ request);
        if(successor!= null){
            successor.handleRequest(request);
        }
        }
    }
}
