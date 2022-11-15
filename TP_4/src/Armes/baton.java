package Armes;


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Elisa
 */

public class baton extends Arme {
     int age;
     
     public baton (String unNom, int attaque, int ag){
      super(unNom, attaque);
      age=ag;
      if (ag>=100){
          ag=0;
      }  
}
} 
