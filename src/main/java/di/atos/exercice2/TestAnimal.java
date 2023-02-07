/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package di.atos.exercice2;

/**
 *
 * @author ezekielkouassi
 */
public class TestAnimal {

    public static void main(String[] args) {
        
        
        // Création d'un objet chien avec une référence de Animal
        Animal chien = new Chien();
        chien.parler();
        chien.deplacement();
        
        // Création d'un objet chat avec une référence de Animal
        Animal chat = new Chat();
        chat.parler();
        chien.deplacement();
        
        // Création d'un objet oiseau avec une référence de Animal
        Animal oiseau = new Oiseau();
        oiseau.parler();
        oiseau.deplacement();
        
        
        // 5 - appel de la méthode voler en utilisant une reference de oiseau
        Oiseau oiseau2 = new Oiseau();
        oiseau2.voler();
        
        
    }
}
