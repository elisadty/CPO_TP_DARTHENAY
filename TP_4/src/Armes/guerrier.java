/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Armes;

/**
 *
 * @author Elisa
 */
public class guerrier extends personnage {
    boolean cheval ;
    public guerrier(String nom, int vie, boolean cheval) {
        super(nom, vie);
        this.cheval = cheval ;
        
    }

    @Override
    public String toString() {
          if (cheval ==true) {
    return "le geurrier est a cheval";    
        }else{ 
        return "le guerrier est a pied";
        
    }
    
}

    public void setCheval(boolean cheval) {
        this.cheval = cheval;
    }
}