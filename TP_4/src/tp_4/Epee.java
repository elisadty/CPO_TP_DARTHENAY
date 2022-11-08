/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp_4;

/**
 *
 * @author Elisa
 */
public class Epee extends Arme{
     int finesse;
     public Epee (String unNom, int attaque, int fines){
         super(unNom, attaque);
         finesse=fines;
         if (fines>=100){
             fines=0;
         }
     }
}