/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_convertisseurobjet_darthenay;

/**
 *
 * @author Elisa
 */
import java.util.Scanner;
public class TP2_convertisseurObjet_DARTHENAY {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Convertisseur Convertisseur1 = new Convertisseur();
    Convertisseur1.CelciusVersFarenheit(600);
    Convertisseur1.CelciusVersKelvin(29);
    System.out.println(Convertisseur1);
    
    Convertisseur Convertisseur2=new Convertisseur();
    Convertisseur2.FarenheitVersKelvin(25);
    Convertisseur2.KelvinVersFarenheit(87);
    Convertisseur2.FarenheitVersCelcius(46);
     System.out.println(Convertisseur2);
    
        // création du menu

        Scanner sc = new Scanner(System.in); //creation scanner pour que l'utilisateur puisse saisir les données

        Convertisseur Convertisseur3 = new Convertisseur(); //creation convertisseur 3 pour le menu

              System.out.println("Saisir une valeur : "); //utilisateur saisit une vlr

              double valeur = sc.nextDouble();
                  // Affichage de chaque cas pour les convertions à choisir        
              System.out.println("Saisir la convertion à effectuer :");

              System.out.println("1) Celcius vers Kelvin");

              System.out.println("2) Kelvin vers Celcius");

              System.out.println("3) Farenheit vers Celcius");

              System.out.println("4) Celcius vers Farenheit");

              System.out.println("5) Kelvin vers Farenheit");

              System.out.println("6) Farenheit vers Kelvin");

              int convUtilisateur = sc.nextInt();

              double answer;      

              if (convUtilisateur == 1) { //en fonction réponse de conversion

                  answer = Convertisseur3.CelciusVersKelvin(valeur); //converti vlr entrée

                  System.out.println(valeur + " degres Celcius = "+answer+" degres Kelvin"); //renvoi vlr converti à utilisateur

              }

                    

              if (convUtilisateur == 2) { 

                  answer = Convertisseur3.KelvinVersCelcius(valeur);

                  System.out.println(valeur + " degres Kelvin = "+answer+" degres Celcius");

              }

                     

              if (convUtilisateur == 3) {

                  answer = Convertisseur3.FarenheitVersCelcius(valeur);

                  System.out.println(valeur + " degres Farenheit = "+answer+" degres Celcius");

              }

              if (convUtilisateur == 4) {

                  answer = Convertisseur3.CelciusVersFarenheit(valeur);

                  System.out.println(valeur + " degres Celcius = "+answer+" degres Farenheit");

              }
                     
              if (convUtilisateur == 5) {

                  answer = Convertisseur3.KelvinVersFarenheit(valeur);

                  System.out.println(valeur + " degres Kelvin = "+answer+" degres Farenheit");

              }
                 
              if (convUtilisateur == 6) {

                  answer = Convertisseur3.FarenheitVersKelvin(valeur);

                  System.out.println(valeur + " degres Farenheit = "+answer+" degres Kelvin");
                  
              }
    }
} 