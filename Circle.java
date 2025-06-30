
package com.mycompany.lalitidlisanchamacker;


public class Circle {
    protected double circleDiameter;

    public Circle(double diameter) {
        this.circleDiameter = diameter;
    }

    public double getCircleRadius() {
        return circleDiameter/2;
    }

    public void setCircleDiameter(double diameter) {
        this.circleDiameter = diameter;
    }
    
    public double  getCircleDiameter(){
        return circleDiameter;
    }
    
    public double getCircleArea(){
        return Math.PI*circleDiameter*circleDiameter;
    }
}
