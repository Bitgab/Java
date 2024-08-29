/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.projeto1_dia2908;

/**
 *
 * @author Aluno
 */
public class Projeto1_Dia2908 {

    public static void main(String[] args) {
        
        Endereco endereco = new Endereco("Rua A", "123", "Perto", "123.45-000", "Salvador", UnidadeFederativa.BAHIA);
        Gerente gerente = new Gerente(Bonificacao.GERENTE, "Fuboca", "123.456.789-00", "1245", endereco, Setor.OPERACOES, Sexo.MASCULINO, 5000);
        
        Diretor diretor = new Diretor(Bonificacao.DIRETOR, "Gabriel", "123.456.789.", "1234", endereco, Setor.MARKETING, Sexo.MASCULINO, 6000);
        
        
        System.out.println(gerente);
        
        System.out.println(diretor);
        
        diretor.admitir(gerente);
    }
}
