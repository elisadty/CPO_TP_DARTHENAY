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
      
           
        
        BouteilleBiere uneBiere = new BouteilleBiere("Cuvée des trolls",7.0 ,"Dubuisson") ;
        uneBiere.lireEtiquette();
        uneBiere.Decapsuler();
        System.out.println(uneBiere) ;
        
        
        BouteilleBiere uneBiere2 = new BouteilleBiere("Lefe",6.6 ,"Abbaye de Lefe");
        uneBiere2.lireEtiquette(); 
        uneBiere2.Decapsuler();
        System.out.println(uneBiere2) ;
        
        
        BouteilleBiere uneBiere3 = new BouteilleBiere("Kro",10.2 ,"Le fournil");
        uneBiere3.lireEtiquette();
        uneBiere3.Decapsuler();
        System.out.println(uneBiere3);
        
        BouteilleBiere uneBiere4 = new BouteilleBiere("azo",19.2 ,"Le cargot");
        uneBiere4.lireEtiquette();
        uneBiere4.Decapsuler();
        System.out.println(uneBiere4); 
    }
}