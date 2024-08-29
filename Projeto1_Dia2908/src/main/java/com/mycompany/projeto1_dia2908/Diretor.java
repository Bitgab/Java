/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projeto1_dia2908;

/**
 *
 * @author Aluno
 */
public class Diretor extends CargoDeConfianca implements Contratacao{
    final double PREMIO = 0.5;
    final double  valorBonificacao = (getSalarioBase() * bonificacao.getValor());
    final double valorPremio = (getSalarioBase() * PREMIO);

    public Diretor(Bonificacao bonificacao, String nome, String cpf, String rg, Endereco endereco, Setor setor, Sexo sexo, double salarioBase) {
        super(bonificacao, nome, cpf, rg, endereco, setor, sexo, salarioBase);
    }
    
    @Override
    public double salarioFinal() {
       return (getSalarioBase() + valorBonificacao + valorPremio);
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
        // Imprimir informações ao admitir um funcionário.
        System.out.println("=== Admitindo Funcionário ==="); 
        System.out.println("Dados do funcionário: ");
        System.out.println(funcionario.toString());
    }

    @Override
    public String toString() {
        return "\nDados Diretor: " +
                super.toString() +
                "\nValor da Bonificação: " + valorBonificacao +
                "\nValor do Premio: " + valorPremio + 
                "Salário Final: " + salarioFinal();
    }
    

   
}
