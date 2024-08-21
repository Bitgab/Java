/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.projetopessoa;

/**
 *
 * @author Aluno
 */
public class ProjetoPessoa {

    public static void main(String[] args) {
        Juridica juridica = new Juridica("123444", "21/12//2024", "Gabriel", telefone"(71) 91234-6789");
         Fisica fisica = new Fisica("1233.43435", "3213455", "21/08/2023", "Fuboca", "(71) 09876-5432");
        
        System.out.println(juridica.toString());
        System.out.println(fisica.toString());
    }
}
