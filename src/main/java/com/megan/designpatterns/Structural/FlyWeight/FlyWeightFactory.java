/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.megan.designpatterns.Structural.FlyWeight;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Megan
 */
public class FlyWeightFactory {
    private static FlyWeightFactory flyweightFactory;
    private Map<String,FlyWeight>flyweightPool;
    private FlyWeightFactory(){
        flyweightPool = new HashMap<String,FlyWeight>();
    }
    public static FlyWeightFactory getInstance(){
        if(flyweightFactory == null){
            flyweightFactory = new FlyWeightFactory();
            
        }
        return flyweightFactory;
        }
    public FlyWeight getFlyweight(String key){
        if(flyweightPool.containsKey(key)){
            return flyweightPool.get(key);
        }
        else{
            FlyWeight flyweight;
            if("add".equals(key)){
                flyweight = new FlyWieghtAdder();
            }else{
                flyweight = new FlyWeightMulti();
            }
            flyweightPool.put(key, flyweight);
            return flyweight;
        }
            
    }
    
    
    
}
