/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.loginsenha;

/**
 *
 * @author Aluno
 */
public class LoginSenha {

    public static void main(String[] args) {
      // Declaração de variáveis.
        String nomeUsuario = "Samir";
        int senha = 123;
        
        // Comparação de Strings e inteiros 
        boolean resultadoNome = nomeUsuario.equals("Samir");
        boolean resultadoSenha = (senha == 456);
        
        // Exibindo resultados.
        System.out.println("O nome do usuário está correto? " + resultadoNome);
        System.out.println("A senha está correta? " + resultadoSenha);
    }
}
