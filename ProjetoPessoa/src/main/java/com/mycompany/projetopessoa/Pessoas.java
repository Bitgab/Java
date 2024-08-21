/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projetopessoa;

/**
 *
 * @author Aluno
 */
public abstract class Pessoas {
    
    protected String nome;
    protected String telefone;

    public Pessoas(String nome, String telefone) {
        this.nome = nome;
        this.telefone = telefone;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "\nNome: " + nome +
              "\nTelefone: " + telefone ;
    }
    
}
