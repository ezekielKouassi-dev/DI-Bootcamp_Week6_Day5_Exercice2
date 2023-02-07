/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package di.atos.exercice2;

/**
 *
 * @author ezekielkouassi
 */
public class Oiseau extends Animal{
    
    public Oiseau() {
        super();
    }

    @Override
    public void parler() {
        System.out.println("piouu piouuu");
    }
    
    public void voler() {
        System.out.println("je m'envole piouuuu...");
    }
    
}
