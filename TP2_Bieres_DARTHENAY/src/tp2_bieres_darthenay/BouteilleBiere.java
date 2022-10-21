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
        boolean ouverture;

 public void lireEtiquette() {
    System.out.println("Bouteille de " + Nom +" (" + degreAlcool + " degres) \nBrasserie : " + brasserie ) ;
}
 
public BouteilleBiere(String unNom, double unDegre, String uneBrasserie) {
    Nom = unNom;
    degreAlcool = unDegre;
    brasserie = uneBrasserie;
    ouverture = false;
}  

public boolean Decapsuler() {
    if (ouverture==false){
        ouverture=true;
        System.out.println(ouverture);
    }else {
        System.out.println("erreur bière déjà ouverte");
    }
}
}


