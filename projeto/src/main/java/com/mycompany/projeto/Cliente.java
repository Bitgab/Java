/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projeto;

/**
 *
 * @author Aluno
 */
public class Cliente extends Pessoa{
    private String dataDePagamento;
    private String tipoDePagamento;

    public Cliente(String dataDePagamento, String tipoDePagamento, String nome, int idade, String logradouro, int numero, String cidade, String telefone) {
        super(nome, idade, logradouro, numero, cidade, telefone);
        this.dataDePagamento = dataDePagamento;
        this.tipoDePagamento = tipoDePagamento;
    }

    public String getDataDePagamento() {
        return dataDePagamento;
    }

    public void setDataDePagamento(String dataDePagamento) {
        this.dataDePagamento = dataDePagamento;
    }

    public String getTipoDePagamento() {
        return tipoDePagamento;
    }

    public void setTipoDePagamento(String tipoDePagamento) {
        this.tipoDePagamento = tipoDePagamento;
    }

   
    
    
}
