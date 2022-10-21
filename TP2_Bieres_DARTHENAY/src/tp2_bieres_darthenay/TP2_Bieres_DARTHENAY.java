/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_bieres_darthenay;

/**
 *
 * @author Elisa
 */
public class TP2_Bieres_DARTHENAY {
    public static void main(String[] args){
      
        BouteilleBiere uneBiere = new BouteilleBiere("Cuvée des trolls",
7.0 ,"Dubuisson") ;


        uneBiere.Nom = "Cuvee des trolls";
        uneBiere.degreAlcool = 7.0;
        uneBiere.brasserie= "Dubuisson";
        uneBiere.ouverture= false;
   
        uneBiere.lireEtiquette();
        
        uneBiere.Nom = "Lefe";
        uneBiere.degreAlcool = 6.6;
        uneBiere.brasserie = "Abbaye de Lefe";
        uneBiere.ouverture = false;
        
        uneBiere.lireEtiquette();           
    }
    
    BouteilleBiere autreBiere = new BouteilleBiere("Leffe", 6.6,"Abbaye de Leffe") ;
    
   
    
    }
    
    
    
    
    
        // TODO code application logic here

    
   
    
    

