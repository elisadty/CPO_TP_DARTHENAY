/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_convertisseurobjet_darthenay;

/**
 *
 * @author Elisa
 */
public class TP2_convertisseurObjet_DARTHENAY {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Convertisseur Convertisseur1 = new Convertisseur();
    Convertisseur1.CelciusVersFarenheit(600);
    Convertisseur1.CelciusVersKelvin(29);
    System.out.println(Convertisseur1);
    
    Convertisseur Convertisseur2=new Convertisseur();
    Convertisseur2.FarenheitVersKelvin(25);
    Convertisseur2.KelvinVersFarenheit(87);
    Convertisseur2.FarenheitversCelsius(46);
     System.out.println(Convertisseur2);
    
    }   
}
