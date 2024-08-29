/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package com.mycompany.projeto1_dia2908;

/**
 *
 * @author Aluno
 */
public enum UnidadeFederativa {
    
    BAHIA ("BA" , "Bahia"),
    SAO_PAULO ("SP" , "São Paulo"),
    RIO_DE_JANEIRO ("RJ" , "Rio de Janeiro");
    
    private String sigla;
    private String nome;

    private UnidadeFederativa(String sigla, String nome) {
        this.sigla = sigla;
        this.nome = nome;
    }

    public String getSigla() {
        return sigla;
    }

    public String getNome() {
        return nome;
    }
    
    
}
