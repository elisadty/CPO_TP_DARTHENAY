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
    
    System.out.println("nb de calories de Assiette 2 : " +
    assiette2.nbCalories) ;
    System.out.println("nb de calories de Assiette 3 : " +
    assiette3.nbCalories) ;
    
}
}