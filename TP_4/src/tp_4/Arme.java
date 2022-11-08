/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp_4;

/**
 *
 * @author Elisa
 */
public class Arme{
  String Nom;
  int Niveau_attaque;
  
public Arme (String unNom, int attaque){
    Nom=unNom;
    Niveau_attaque=attaque;
    if (attaque>100 && attaque<0){
        attaque=0;
    }   
}  
   

 
 @Override
public String toString() { 
    String chaine_a_retourner;
    chaine_a_retourner = "Arme : " + Nom + ", Niveau d'attaque : " + Niveau_attaque ;
    return chaine_a_retourner ;
}
}
