
package com.mycompany.lalitidlisanchamacker;


public class Cylinder {
    protected double diameter;
    protected double height;

    public Cylinder(double diameter, double height) {
        this.diameter = diameter;
        this.height = height;
    }
    
    public double getdiameter() {
        return diameter;
    }

    public void setdiameter(double diameter) {
        this.diameter = diameter;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    public double getRadius(){
        return diameter/2;
    }
    
    public double getCylinerVolume(){
        return Math.PI*getRadius()*getRadius()*height;
    }
   
    
}
