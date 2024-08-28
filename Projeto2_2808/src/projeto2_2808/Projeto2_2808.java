/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package projeto2_2808;

/**
 *
 * @author Aluno
 */
public class Projeto2_2808 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Soma soma = new Soma();
        Subtracao sub = new Subtracao();
        Multiplicacao mult = new Multiplicacao();
        Divisao divi = new Divisao();
        
        System.out.println(soma.calcular() + soma.calcular(2, 4));
        System.out.println(sub.calcular() + sub.calcular(2, 4));
        System.out.println("Multiplicação: " + mult.calcular(2, 4));
        System.out.println("Divisão: " + divi.calcular(2, 4));
    }
    
}
