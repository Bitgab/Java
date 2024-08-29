/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projeto1_dia2908;

/**
 *
 * @author Aluno
 */
public class Gerente extends CargoDeConfianca {
    final double  valorBonificacao = (getSalarioBase() * bonificacao.getValor());

    public Gerente(Bonificacao bonificacao, String nome, String cpf, String rg, Endereco endereco, Setor setor, Sexo sexo, double salarioBase) {
        super(bonificacao, nome, cpf, rg, endereco, setor, sexo, salarioBase);
    }

    
    
    @Override
    public double salarioFinal() {
        return (getSalarioBase() + valorBonificacao);
    }

    @Override
    public String toString() {
        return "Gerente{" +
                super.toString() + 
                "valorBonificacao=" + valorBonificacao ;
    }
    


}
