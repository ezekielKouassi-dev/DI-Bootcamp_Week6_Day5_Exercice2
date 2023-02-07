/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package di.atos.exercice2;

/**
 *
 * @author ezekielkouassi
 */
public abstract class Animal extends clsTest {
    public abstract void parler();
    
    public void deplacement() {
        System.out.println("marcher....");
        System.out.println(getNom());
    }
}
