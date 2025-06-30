
package com.mycompany.lalitidlisanchamacker;

public class TrayRack extends Tray {
    
    private Rack rack;
    

 public TrayRack( double deepradius ,int numberofdeeps ,double TrayDiameter, double RackDiameter , double RackHeight,int NumberOfTray) {
       super(deepradius ,numberofdeeps,TrayDiameter, NumberOfTray);
      this.rack = new Rack(RackDiameter ,RackHeight);
      
    }
 public Rack getRack()
{
    
  return rack;
}
   public double getRackVolume(){
       return rack.getCylinerVolume();
   }
    public double getDeepMasalaDensity(){
      return  getDeepVolume()*Values.IdlimasalaDensity;
  }
  public double getMasalaInTray(){
      return getTreyVolume()*Values.IdlimasalaDensity;
  }
  public double getMasalaInRack(){
      return getNumberOftray()* getMasalaInTray();
  }
} 