/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projeto1_dia2908;

/**
 *
 * @author Aluno
 */
public class Motorista extends Funcionario{
    private String carteiraDeHabilitacao;

    public Motorista(String nome, String cpf, String rg, Endereco endereco, Setor setor, Sexo sexo, double salarioBase) {
        super(nome, cpf, rg, endereco, setor, sexo, salarioBase);
    }

    @Override
    public double salarioFinal() {
        return getSalarioBase();
    }

    public Motorista(String carteiraDeHabilitacao, String nome, String cpf, String rg, Endereco endereco, Setor setor, Sexo sexo, double salarioBase) {
        super(nome, cpf, rg, endereco, setor, sexo, salarioBase);
        this.carteiraDeHabilitacao = carteiraDeHabilitacao;
    }

    public String getCarteiraDeHabilitacao() {
        return carteiraDeHabilitacao;
    }

    public void setCarteiraDeHabilitacao(String carteiraDeHabilitacao) {
        this.carteiraDeHabilitacao = carteiraDeHabilitacao;
    }

    @Override
    public String toString() {
        return "Motorista{" +
                "\nCarteira de Habilitação: " + carteiraDeHabilitacao +
                super.toString();
    }


    
}
