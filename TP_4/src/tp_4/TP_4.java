/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp_4;


/**
 *
 * @author Elisa
 */
import Armes.Arme;
import Armes.baton;
import Armes.Epee;
import Armes.guerrier;
import Armes.magicien;
import Armes.personnage;
import java.util.ArrayList;
public class TP_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Epee exca = new Epee("Excalibur",7,5);
        Epee durandal= new Epee("Durandal",4,7); 
        System.out.println(exca);
        System.out.println(durandal);
          
        baton chen = new baton ("Chene",4,5);
        baton chrm = new baton ("Charme",5,6);
        System.out.println(chen);
        System.out.println(chrm);
        
        
        ArrayList<Arme> tabdyn = new ArrayList<Arme>();
        tabdyn.add(chen);
        tabdyn.add(chrm); 
        tabdyn.add(exca);
        tabdyn.add(durandal);
        System.out.println(tabdyn);
        
        magicien gandalf= new magicien("Gandalf",65,true); 
        magicien garcimore= new magicien("garcimore",44,false);
        System.out.println(gandalf); 
        System.out.println(garcimore);
        
        guerrier conan = new guerrier ("conan", 78, false);
        guerrier lannister = new guerrier ("lanister", 45, true);
        System.out.println(conan);
        System.out.println(lannister);
        
        ArrayList<personnage> tabpers=new ArrayList<personnage>();
        tabpers.add(conan);
        tabpers.add(lannister);
        tabpers.add(gandalf);
        tabpers.add(garcimore);
        System.out.println(tabpers);
        
        
    }
      
}
