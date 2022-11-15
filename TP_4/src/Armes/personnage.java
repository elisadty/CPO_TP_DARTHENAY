package Armes;

import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Elisa
 */
public class personnage {
    String nom; 
    int vie;
    ArrayList inventaire;
    Arme arm ;

    public personnage(String nom, int vie) {
        this.nom = nom;
        this.vie = vie;
        
    ArrayList<Arme> inventaire = new ArrayList<Arme> ();
     
    if (inventaire.size()<5){
         inventaire.add(arm);
    }
    
   
}
    
    
    

}
