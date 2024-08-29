/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package com.mycompany.projeto1_dia2908;

/**
 *
 * @author Aluno
 */
public enum Setor {
    ENGENHARIA ("Engenharia"),
    JURIDICO ("Jurídico"),
    RECURSOS_HUMANOS ("Recursos Humanos"),
    MARKETING ("Marketing"),
    OPERACOES ("Operações");
    
    private String nome;

    private Setor(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
    
    
}
