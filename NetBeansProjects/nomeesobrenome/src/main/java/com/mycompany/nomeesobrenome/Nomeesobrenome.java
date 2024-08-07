/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.nomeesobrenome;

/**
 *
 * @author Aluno
 */
public class Nomeesobrenome {

    public static void main(String[] args) {
        // Declarando as variáveis.
        String nome = "Rafael";
        String sobrenome = "Fuboca";
        
        // Exibindo a quatidade de caracteres.
        System.out.println("Tamanho do nome:" + nome.length());
        System.out.println("Tamanho do sobrenome:" + sobrenome.length());
        
        // Concatenando nome + sobrenome
        String nomeCompleto = nome.concat(" ").concat(sobrenome);
        
        // Exibindo nome completo usando metodos Strings - Maiúsculo.
        System.out.println("Concatenação Maiúcula: " + nomeCompleto.toUpperCase());
        
        // Wxibindo nome completo usando metodos Strings - Minúsculo
        System.out.println("Concatenção Minúscula: " + nomeCompleto.toLowerCase());
    }
}
