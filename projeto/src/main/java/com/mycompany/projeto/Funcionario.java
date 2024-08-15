/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projeto;

/**
 *
 * @author Aluno
 */
public class Funcionario extends Pessoa{
    
    private String cargo;
    private double salario;
    private double saldoEmConta;

    public Funcionario(String cargo, double salario, double saldoEmConta, String nome, int idade, String logradouro, int numero, String cidade, String telefone) {
        super(nome, idade, logradouro, numero, cidade, telefone);
        this.cargo = cargo;
        this.salario = salario;
        this.saldoEmConta = saldoEmConta;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double getSaldoEmConta() {
        return saldoEmConta;
    }

    public void setSaldoEmConta(double saldoEmConta) {
        this.saldoEmConta = saldoEmConta;
    }

   
    
    
}
