

package com.mycompany.lalitidlisanchamacker;


public class LalitIdliSanchaMacker {

    public static void main(String[] args) {
        double DeepRadius = 4;
        int DeepCount = 4;
        int TrayCount = 5;
        double TrayDiameter = 18;
        double RackHeight =  55;
        double RackDiameter = 24; 
        
        double TrayRadius =  TrayDiameter /2;
        double RackRadius = RackDiameter/2;
        
        
        boolean ValidateDeepCount = Validations.ValidateDeepCount(DeepCount, TrayDiameter);
        boolean ValidateTrayCount = Validations.ValidateTrayCount( TrayCount );
        boolean ValidateTrayRackHeight = Validations.ValidateTrayRackHeight( DeepRadius,TrayCount,RackHeight);
        boolean ValidateTrayRackRadius = Validations.ValidateTrayRackRadius( TrayRadius , RackRadius);
        boolean  ValidateDeepTrayRadius = Validations.ValidateDeepTrayRadius(DeepRadius, DeepCount, TrayRadius);
        
        
        
        
        if(ValidateDeepCount==true &&  ValidateTrayCount == true  &&  ValidateTrayRackHeight== true  && ValidateTrayRackRadius==true  &&  ValidateDeepTrayRadius==true){
            TrayRack tr = new TrayRack( DeepRadius, DeepCount ,TrayDiameter,RackDiameter , RackHeight,TrayCount);
            Estimations.print(tr);
       }
        else{
            System.out.println("Invalid Dimension: ");
    }
    }
    
}
