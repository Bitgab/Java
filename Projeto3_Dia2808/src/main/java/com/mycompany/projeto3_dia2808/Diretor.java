/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projeto3_dia2808;

/**
 *
 * @author facil
 */

// Classe que representa um diretor, um tipo específico de funcionário.
public class Diretor extends Funcionario implements Contratacao{
   final double PREMIO = 0.2;
   
    public Diretor(String nome, String dataDeNascimento, Sexo sexo, Setor setor, double salarioBase) {
        super(nome, dataDeNascimento, sexo, setor, salarioBase);
   }

    @Override
    public double getSalarioFinal() {
        
        // Cálculo do salário final com prêmio.
        double salarioFinal = 0;
        salarioFinal = super.salarioBase * PREMIO;
        salarioFinal += super.salarioBase;
        return  salarioFinal;
    }

    @Override
    public void admitir(Funcionario funcionario) {
        // Imprimir informações ao admitir um funcionário.
        System.out.println("=== Admitindo Funcionário ==="); 
        System.out.println("Dados do funcionário: ");
        System.out.println(funcionario.toString());
    }

    @Override
    public void demitir(Funcionario funcionario) {
        // Imprimir informações ao demitir um funcionário.
        System.out.println("=== Demitindo Funcionario ===");
        System.out.println("Dados do funcionário: ");
        System.out.println(funcionario.toString());
    }
    public  double getPREMIO(){
        return PREMIO;
    }

    @Override
    public String toString() {
        return "Diretor" +
                "\nNome: " + super.getNome() +
               "\nData de nascimento: " + super.getDataDeNascimento() +
               "\nSexo: " + super.getSexo().getNome() +
               "\nSetor: " + super.getSetor().getNome() + 
               "\nSalário base: " + super.getSalarioBase() + 
               "\nSalário final: " + super.getSalarioFinal() +
               "\nPREMIO: " + PREMIO ; 
               
    }
    
}
