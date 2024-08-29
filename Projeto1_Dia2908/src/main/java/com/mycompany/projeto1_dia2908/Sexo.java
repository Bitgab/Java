/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package com.mycompany.projeto1_dia2908;

/**
 *
 * @author Aluno
 */
public enum Sexo {
    
    MASCULINO ('M' , "Masculino" ),
    FEMININO  ('F' , "Feminino");
    
    private char inicial;
    private String nome;

    private Sexo(char inicial, String nome) {
        this.inicial = inicial;
        this.nome = nome;
    }

    public char getInicial() {
        return inicial;
    }

    public String getNome() {
        return nome;
    }
    
    
}
