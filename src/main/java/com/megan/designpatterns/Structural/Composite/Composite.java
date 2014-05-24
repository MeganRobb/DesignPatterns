/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.megan.designpatterns.Structural.Composite;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Megan
 */
public class Composite implements Component {
    List<Component> components = new ArrayList<Component>();
   
    public void sayHello(){
        for(Component component: components){
            component.sayHello();
        }
    }
    public void sayGoodBye(){
        for(Component component:components){
            component.sayGoodBye();
        }
    }
    public void add(Component component){
        components.add(component);
    }
    public void remove(Component component){
        components.remove(component);
    }
    public List<Component> getComponents(int index){
        return components;
    }
   public Component getComponent(int index)
    {
        return components.get(index);
    }
}
