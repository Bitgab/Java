/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projetopessoa;

/**
 *
 * @author Aluno
 */
public class Fisica extends Pessoas{
   private String cpf;
   private String rg;
   private String dataDeNascimento;

    public Fisica(String cpf, String rg, String dataDeNascimento, String nome, String telefone) {
        super(nome, telefone);
        this.cpf = cpf;
        this.rg = rg;
        this.dataDeNascimento = dataDeNascimento;
    }

    public String getDataDeNascimento() {
        return dataDeNascimento;
    }

    public void setDataDeNascimento(String dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    @Override
    public String toString() {
        return "Dados da pessoa física: " +
                super.toString() +
                "CPF: " + cpf +
                "\nRG: " + rg + 
                "\nData de Nascimento: " + dataDeNascimento;
    }
   
}
