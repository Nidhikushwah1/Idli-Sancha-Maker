
package com.mycompany.lalitidlisanchamacker;


public class Hemisphere {
    private double Hemisphereradius;

    public Hemisphere(double radius) {
        this.Hemisphereradius = radius;
    }

    public double getRadius() {
        return Hemisphereradius;
    }

    public void setRadius(double radius) {
        this.Hemisphereradius = radius;
    }
    public double getHemisphereArea(){
        return 3*Math.PI*Hemisphereradius*Hemisphereradius;
    }
    public double getHemisphereVolume(){
        return (2*Math.PI*Hemisphereradius*Hemisphereradius*Hemisphereradius)/3;
    }
}
