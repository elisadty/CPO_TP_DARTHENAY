package tp2_relation_darthenay;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Elisa
 */
public class Voiture {
 String Modele;
 String Marque;
 int PuissanceCV;
 
 public Voiture (String unmodele, String unemarque, int unepuissance) {
   Modele= unmodele;
   Marque= unemarque;
   PuissanceCV= unepuissance;
 }
 
 
 @Override
public String toString() { 
    String chaine_a_retourner;
    chaine_a_retourner = Modele + ": Modele" + "" + Marque + ": marque" + PuissanceCV + ": Puissance";
return chaine_a_retourner;  
}
}
