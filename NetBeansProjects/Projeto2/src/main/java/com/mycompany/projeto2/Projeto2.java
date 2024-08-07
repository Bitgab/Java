/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.projeto2;/**
 *
 * @author Aluno
 */
public class Projeto2 {

    public static void main(String[] args) {
        // Instanciando um objeto.
        Funcionarios funcionario = new Funcionarios("Rafael", 23, 1.29);
        
        // Declarando as variáveis.
        /*funcionario.setNome("Rafael");
        funcionario.setIdade(23);
        funcionario.setSalario(10);*/
       
       // Exibindo resultado.
        System.out.println("Nome do funcionário: " + funcionario.getNome());
        System.out.println("Idade: " + funcionario.getIdade() + " anos");
        System.out.println("Salário: R$" + funcionario.getSalario() + " reais");
    }
}
