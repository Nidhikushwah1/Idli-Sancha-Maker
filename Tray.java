
package com.mycompany.lalitidlisanchamacker;


public class Tray extends Circle {
    private Deep deep;
    private int deepcount;
    private int NumberOfTray;
   

    public Tray( double deepradius ,int NumberOfDeep ,double trayDiameter,int NumberOfTray) {
        super(trayDiameter);
        this.deep = new Deep(deepradius);
        this.deepcount =  NumberOfDeep;
        this.NumberOfTray = NumberOfTray;
        
    } 

   
     public int getDeepCount()
    {
        return deepcount ;
    }
     
     public Deep getDeep(){
         return deep;
     }
     
      public double getDeepArea(){
        return deep.getHemisphereArea();
        
    }
     public double getDeepVolume(){
        return deep.getHemisphereVolume();
        
    }
   
    public double getTrayHeight(){
        return deep.getRadius()*2;
    }
            
    public double getTreyVolume(){
        return deepcount*getDeepVolume();
    }
    public double getTrayDiamter(){
        return getCircleDiameter();
    }
    public double getNumberOftray(){
        return NumberOfTray;
    }
 }
