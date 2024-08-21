/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.funcionario;

/**
 *
 * @author Aluno
 */
public class Funcionario {

    public static void main(String[] args) {
        Engenheiro engenheiro = new Engenheiro("123", "Rafael", "12233445", "11223344", 10);
        Medico medico = new Medico("123", "Samir", "678875", "76542", 10.000);
        Motoboy motoboy = new Motoboy("1239786", "Gabriel", "979768686", "467776575656", 1000.00);
        
        System.out.println(engenheiro.toString());
        System.out.println(medico.toString());
        System.out.println(motoboy.toString());
    }
}
