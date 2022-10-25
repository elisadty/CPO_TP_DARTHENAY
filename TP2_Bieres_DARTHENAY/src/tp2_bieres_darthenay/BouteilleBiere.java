/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_bieres_darthenay;

/**
 *
 * @author Elisa
 */
public class BouteilleBiere {  // crétion classe biere 
        String Nom;
        Double degreAlcool;
        String brasserie;
        Boolean ouverture;

 public void lireEtiquette() { // création d'une méthode pour lire les infos de la bouteille de bière
    System.out.println("Bouteille de " + Nom +" (" + degreAlcool + " degres) \nBrasserie : " + brasserie ) ;
}
 
public BouteilleBiere(String unNom, Double unDegre, String uneBrasserie) { //associe la classe à  la méthode
    Nom = unNom;
    degreAlcool = unDegre;
    brasserie = uneBrasserie;
    ouverture = false;
}  


public void Decapsuler() { //méthode determine si bouteille est ouverte ou non
    if (ouverture==false){
        ouverture=true;
        System.out.println(ouverture);
    }else {
        System.out.println("erreur bière déjà ouverte");
    }
}
@Override
public String toString() { 
    String chaine_a_retourner;
    chaine_a_retourner = Nom + " (" + degreAlcool + " degres)" + ouverture + "?";
    if (ouverture == true ) chaine_a_retourner += "oui" ;
    else chaine_a_retourner += "non" ;
    return chaine_a_retourner ;
}
}


