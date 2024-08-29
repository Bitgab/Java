/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package com.mycompany.projeto3_dia2808;

/**
 *
 * @author facil
 */
public enum Setor {
   RECURSOS_HUMANOS ("Recursos Humanos"),
   FINANCEIRO       ("Financeiro"),
   OPERACOES        ("Operações");
   
   private String nome;

    private Setor(String nome) {
        this.nome = nome;
    }
   // Método para acessar o nome do setor.
    public String getNome() {
        return nome;
    }
   
   
    
}
