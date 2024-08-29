/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package com.mycompany.projeto3_dia2808;

/**
 *
 * @author facil
 */
public enum Sexo {
    MASCULINO ("Masculino"),
    FEMININO  ("Feminino");
    
    private String nome;

    private Sexo() {
    }

    private Sexo(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
    
    
}
