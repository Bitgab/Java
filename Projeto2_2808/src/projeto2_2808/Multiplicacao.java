/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projeto2_2808;

/**
 *
 * @author Aluno
 */
public class Multiplicacao implements OperacaoMatematica{

    @Override
    public String calcular() {
      return "Multiplicação:" ;
    }

    @Override
    public double calcular(double a, double b) {
       return a * b;
    }

  
}
