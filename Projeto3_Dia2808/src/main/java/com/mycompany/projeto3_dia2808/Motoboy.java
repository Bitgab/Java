/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projeto3_dia2808;

/**
 *
 * @author facil
 */
public class Motoboy extends Funcionario{
   private String carteiraDeHabilitacao;

    public Motoboy(String cateiraDeHabilitacao, String nome, String dataDeNascimento, Sexo sexo, Setor setor, double salarioBase) {
        super(nome, dataDeNascimento, sexo, setor, salarioBase);
        this.carteiraDeHabilitacao = cateiraDeHabilitacao;
    }

    public String getCateiraDeHabilitacao() {
        return carteiraDeHabilitacao;
    }

    public void setCateiraDeHabilitacao(String cateiraDeHabilitacao) {
        this.carteiraDeHabilitacao = cateiraDeHabilitacao;
    }

    @Override
    public double getSalarioFinal() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String toString() {
        return "Moto boy " +
               "\nNome: " + super.getNome() +
               "\nData de nascimento: " + super.getDataDeNascimento() +
               "\nSexo: " + super.getSexo().getNome() +
               "\nSetor: " + super.getSetor().getNome() + 
               "\nSalário base: " + super.getSalarioBase() + 
               "\nSalário final: " + super.getSalarioFinal() +
               "\nCarteira de Habilitação: " + carteiraDeHabilitacao;
               
    }
   
   
}
