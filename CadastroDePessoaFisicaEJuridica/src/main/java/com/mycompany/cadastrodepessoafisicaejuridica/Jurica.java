/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cadastrodepessoafisicaejuridica;

/**
 *
 * @author Aluno
 */
public class  Jurica extends Pessoa{
    private String cnpj;
    private String inscricaoEstadual;

    public Jurica(String cnpj, String inscricaoEstadual, String nome, String telefone, String email, Endereco endereco) {
        super(nome, telefone, email, endereco);
        this.cnpj = cnpj;
        this.inscricaoEstadual = inscricaoEstadual;
    }

    @Override
    public String toString() {
        return "Pessoa Jurica: " + 
                super.toString() +
               "\nCNPJ: " + cnpj + 
                "\nInscrição Estadual: " + inscricaoEstadual;
    }

   
   
    
}
