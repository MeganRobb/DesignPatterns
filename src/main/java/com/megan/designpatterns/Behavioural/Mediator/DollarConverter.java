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
public class DollarConverter {
    Mediator mediator;
    public static final float DOLLAR_UNIT = 1.0f;
     public static final float EURO_UNIT = 0.7f;
      public static final float KRONA_UNIT = 8.0f;
      
      public DollarConverter (Mediator mediator){
          this.mediator=mediator;
          mediator.registerDollarConverter(this);
      }
      private float convertEuroToDollasr(float euros){
          float dollars = euros*(DOLLAR_UNIT/EURO_UNIT);
          System.out.println("Converting "+euros+"euros to "+dollars+"dollars\n");
          return dollars;
      }
       private float convertKronaToDollasr(float krona){
          float dollars = krona*(DOLLAR_UNIT/KRONA_UNIT);
          System.out.println("Converting "+krona+"krona to "+dollars+"dollars\n");
          return dollars;
      }
        public float convertCurrencyToDollars(float amount, String unitofCurrency){
          if("krona".equals(unitofCurrency)){
              return convertKronaToDollasr(amount);
          }else{return convertEuroToDollasr(amount);}
          
      }
    
    
}
