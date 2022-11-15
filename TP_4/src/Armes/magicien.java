/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Armes;

/**
 *
 * @author Elisa
 */
public class magicien extends personnage {
    boolean confirme;
    
    public magicien(String nom, int vie, boolean confirme) {
        super(nom, vie);
        this.confirme = confirme;
    }

    @Override
    public String toString() {
        if (confirme ==true) {
            return "le magicien est confirme";    
        }else{ 
            return "le magicien est novice";
        }
    
}

    public void setConfirme(boolean confirme) {
        this.confirme = confirme;
    }
    
    
    
    
}
    
    
    

