/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_convertisseurobjet_darthenay;

/**
 *
 * @author Elisa
 */
public class Convertisseur {
    int nbConversions ;
    
    public Convertisseur () { //initialisation dans concepteur
        nbConversions=0 ;
    }
    //creation des methode pour convertion
    public double CelciusVersKelvin (double C) {
    double K = C + 273.15 ; 
    nbConversions +=1 ;
    return K;
    
}
    
    public double KelvinVersCelcius (double K){
        double C = K - 273.15;
        nbConversions +=1 ;
        return C;
    }
    
    public double FarenheitVersCelcius(double F){
         double C = (F - 32) * 5/9;
         nbConversions +=1 ;
         return C;
    } 
    
    public double CelciusVersFarenheit (double C){
          double F = (C * 9/5) + 32;
          nbConversions +=1 ;
          return F;
    }
    
    public double FarenheitVersKelvin (double F) {
        double K = (F - 32) * 5/9 + 273.15;
        nbConversions +=1 ;
        return K;
    }
    
    public double KelvinVersFarenheit (double K ){
        double F = (K - 273.15) * 9/5 + 32;
        nbConversions +=1 ;
        return F;
    }
    
    @Override
    public String toString() { 
    return "nb de conversions : " + nbConversions;
    
}
    
}
    
    
    