
package com.mycompany.lalitidlisanchamacker;


public class Deep extends  Hemisphere {

 public Deep(double radius ){
    super(radius);
  }

    public double getDeepArea(){
       return getHemisphereArea();
    }

    public double getDeepVolume() {
        return getHemisphereVolume();
    }
    
    }
 