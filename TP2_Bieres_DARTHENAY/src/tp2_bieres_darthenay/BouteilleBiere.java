/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_bieres_darthenay;

/**
 *
 * @author Elisa
 */
public class BouteilleBiere {
        String Nom;
        double degreAlcool;
        String brasserie;
        Boolean ouverture;

 public void lireEtiquette() {
    System.out.println("Bouteille de " + Nom +" (" + degreAlcool + " degres) \nBrasserie : " + brasserie ) ;

}
}
