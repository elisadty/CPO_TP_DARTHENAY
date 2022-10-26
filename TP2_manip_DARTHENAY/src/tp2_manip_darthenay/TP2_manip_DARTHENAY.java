/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_manip_darthenay;

/**
 *
 * @author Elisa
 */
public class TP2_manip_DARTHENAY {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Tartiflette assiette1 = new Tartiflette(800) ;
    Tartiflette assiette2 = new Tartiflette(100) ;    
    Tartiflette assiette3 = assiette2 ; 
    assiette2=assiette1;
    assiette1=assiette3;
    
    System.out.println("nb de calories de Assiette 2 : " +
    assiette2.nbCalories) ;
    System.out.println("nb de calories de Assiette 1 : " +
    assiette1.nbCalories) ;
    
     //Moussaka assiette666 = assiette1 ; Tarttiflette ne peut pas être convertie en moussaka
    //Moussaka assiette667 = new Tartiflette() ; le constructeur tartiflette en classe tartiflette ne peut pas donner de types
    // les deux sont fausses
    //une référence objet qui annonce référencer un type d’objet peut-elle en référencer un autre qui n’a aucun rapport ? : NON
    
    Moussaka tabCal[]= new Moussaka[10]; // cretaion tableau tabCal pr moussaka avec 10 indices (de 0à9)
     for (int i=0; i<10; i++){ 
          tabCal[i]= new Moussaka(i)  ;
        }
    
}
}