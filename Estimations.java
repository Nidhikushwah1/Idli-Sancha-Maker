
package com.mycompany.lalitidlisanchamacker;


public class Estimations {
    public static void print(TrayRack tr){
        if(tr.getTrayDiamter() == Limitations.SmallTreyDiameter){
            System.out.println("Small Trey: ");
        }
        else if(tr.getTrayDiamter() == Limitations.MediumTreyDiameter){
            System.out.println("Medium Tray: ");
        }
        else if(tr.getTrayDiamter() == Limitations.largerTreyDiameter){ 
            System.out.println("Large Tray: ");
        }
        
        System.out.println("Number Of Deeps: " + tr.getDeepCount());
        System.out.println("Deep Volume: " +tr.getDeepVolume());
        System.out.println("Tray Volume: " +tr.getTreyVolume());
        System.out.println("Rack Volume: "+ tr.getRackVolume());
        System.out.println("Idli masala density: " + Values.IdlimasalaDensity);
        System.out.println("Idli masala in One deep: " + tr.getDeepMasalaDensity());
        System.out.println("Idli masala in tray: " +tr.getMasalaInRack());
        System.out.println("Idli masala in rack: " +tr.getMasalaInRack());
    }
    
    
}
