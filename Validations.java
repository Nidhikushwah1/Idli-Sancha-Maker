
package com.mycompany.lalitidlisanchamacker;


public class Validations{
     public static boolean ValidateDeepCount( int DeepCount ,double trayDiameter)
     {
         if(trayDiameter == Limitations.SmallTreyDiameter)
         {
              if( DeepCount>=Limitations.MinimumNoOfSmallDeep &&  DeepCount<=Limitations.MaxiMumNoOfSmallDeep){
                     return true;
                 }
              return false;
     }

         
         else if(trayDiameter == Limitations.MediumTreyDiameter)
         {
             if( DeepCount>=Limitations.MinimumNoOfMediumDeep &&  DeepCount<=Limitations.MaxiMumNoOfMediumDeep)
             {
             return true;
           }
}
         
         else if(trayDiameter == Limitations.largerTreyDiameter)
         {
             if( DeepCount==Limitations.NoOfLargeDeep){
                 return true ;
             }
         }
         return false;
}
     
     public static boolean ValidateTrayCount(double TrayCount)
     {
         if(TrayCount>=Limitations.MinimumTreyRack &&TrayCount<=Limitations.MaximumTreyRack)
         {
             return true;
         }
         return false;
         
     }
    
     public static boolean ValidateTrayRackHeight(double deepradius,double traycount,double rackheight){
         double Trayheight =deepradius*2;
         double TotalTrayheight = traycount* Trayheight ;
         double minimumRackHeight = ((70*rackheight)/100);
         double maximumRackHeight = ((85*rackheight)/100);
         if( TotalTrayheight>=minimumRackHeight &&  TotalTrayheight<=maximumRackHeight){
             return true;
         }
         return false;
         
     }
     public static boolean ValidateTrayRackRadius(double TrayRadius ,double RackRadius){
        double MinimumRackRadius =(70*RackRadius)/100;
        double MaximumRackRadius  = (85*RackRadius)/100;   
        if(TrayRadius>=MinimumRackRadius && TrayRadius<=MaximumRackRadius ){
        return true;
     }
     return false;
}
     public static boolean ValidateDeepTrayRadius(double deepradius , int deepcount , double trayradius){
      double TrayArea = 3.14*trayradius*trayradius;
        double TotalDeepArea = 3.14*deepradius * deepradius *deepcount;
        double MinimumTrayArea = (70*TrayArea)/100;
        double MaximumTrayArea = (85*TrayArea)/100;
       if(TotalDeepArea>= MinimumTrayArea && TotalDeepArea<= MaximumTrayArea){
           return true;
       }
      return false;
  }
}
