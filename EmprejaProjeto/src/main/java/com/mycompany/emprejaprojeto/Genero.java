/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package com.mycompany.emprejaprojeto;

/**
 *
 * @author Aluno
 */
public enum Genero {
    MASCULINO ("Masculino", 'M'),
    FEMININO ("Feminino", 'F');
 
    private String nome;
    private char sigla;

    private Genero(String nome, char sigla) {
        this.nome = nome;
        this.sigla = sigla;
    }

    public String getNome() {
        return nome;
    }

    public char getSigla() {
        return sigla;
    }
    
   
    }
   
    
    
    
}
