package org.example.exos;

import org.example.utils.DatabaseManager;

import java.sql.PreparedStatement;
import java.util.Scanner;

public class Exo1 {



     private  static Scanner scanner = new Scanner(System.in);


     public static void menu() {
        int choix;

        do {
            System.out.println("=== Menu principal ===");
            System.out.println();
            System.out.println("1. Ajouter un etudiant");
            System.out.println("2. Afficher la liste des etudiants");
            System.out.println("3. Afficher les etudiants d'une classe");
            System.out.println("4. Supprimer un etudiant");
            System.out.println("0. Quitter");
            System.out.println("Votre choix :");

            choix = scanner.nextInt();
            scanner.nextLine();

            switch (choix) {
                case 1:
                    ajoutEtudiant();
                    break;
                case 2:
                    afficherListEtudiants();
                    break;
                case 3:
                    afficherListEtudiantParClass();
                    break;
                case 4:
                    supprimerEtudiant();
                    break;
                case 0:
                    System.out.println("Au revoir");
                    break;
                default:
                    System.out.println("Choix invalide. Veuillez entrer un choix valide !!!!");

            }


        } while (choix != 0);

        scanner.close();

    }


        public static void ajoutEtudiant(){
            connection = DatabaseManager.getPostgreSQLConnection();
            PreparedStatement preparedStatement=

        }
        public static void afficherListEtudiants(){

        }
        public static void afficherListEtudiantParClass(){

        }
        public static void supprimerEtudiant(){

        }



}
