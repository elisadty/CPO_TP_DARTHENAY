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
    
    public Convertisseur () {
        nbConversions=0 ;
    }
    
    public void CelciusVersKelvin (double C) {
              double K = C + 273.15 ;                  
}
    
    public void KelvinVersCelcius (double K){
        double C = K - 273.15;     
    }
    
    public void FarenheitversCelsius(double F){
         double C = (F - 32) * 5/9;
    } 
    
    public void CelciusVersFarenheit (double C){
          double F = (C * 9/5) + 32;
    }
    
    public void FarenheitVersKelvin (double F) {
            double K = (F - 32) * 5/9 + 273.15;
    }
    
    public void KelvinVersFarenheit (double K ){
       double F = (K - 273.15) * 9/5 + 32;
    }
}
    

    
    
    
    




