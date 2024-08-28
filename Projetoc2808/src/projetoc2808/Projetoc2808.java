/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package projetoc2808;

/**
 *
 * @author Aluno
 */
public class Projetoc2808 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Cachorro toto = new Cachorro();
       Gato bola = new Gato();
       Galo carijo = new Galo();
       Pato feio = new Pato();
       
        System.out.println("Cachorro: " + toto.emitirSom());
        System.out.println("Tipo de comida: " + toto.comer());
        System.out.println("Gato: " + bola.emitirSom());
        System.out.println("Tipo de comida: " + bola.comer());
        System.out.println("Galo: " + carijo.emitirSom());
        System.out.println("Tipo de comida: " + carijo.comer());
        System.out.println("Pato: " + feio.emitirSom());
        System.out.println("Tipo de comida: " + feio.comer());
    
    }
    
}
