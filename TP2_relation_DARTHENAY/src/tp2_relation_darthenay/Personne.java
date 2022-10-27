package tp2_relation_darthenay;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Elisa
 */
public class Personne {
  String Nom;
String Prenom;

public Personne( String unnom, String unprenom){
    Nom=unnom;
    Prenom=unprenom;
}
 @Override
public String toString() { 
    String chaine_a_retourner;
    chaine_a_retourner = Nom + ": nom. " + " " + Prenom + ": prenom.";
return chaine_a_retourner;

}
}