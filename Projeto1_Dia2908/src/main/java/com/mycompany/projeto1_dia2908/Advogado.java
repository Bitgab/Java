/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projeto1_dia2908;

/**
 *
 * @author Aluno
 */
public class Advogado extends Funcionario{
    private String oab;

    public Advogado(String nome, String cpf, String rg, Endereco endereco, Setor setor, Sexo sexo, double salarioBase) {
        super(nome, cpf, rg, endereco, setor, sexo, salarioBase);
    }

    @Override
    public double salarioFinal() {
        return getSalarioBase();
    }

    public String getOab() {
        return oab;
    }

    public void setOab(String oab) {
        this.oab = oab;
    }

    @Override
    public String toString() {
        return "Advogado{" + "oab=" + oab + 
                super.toString();
    }

   
    
}
