/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.cadastrodepessoafisicaejuridica;

/**
 *
 * @author Aluno
 */
public class CadastroDePessoaFisicaEJuridica {

    public static void main(String[] args) {
        Endereco endereco1 = new Endereco("Rua A", "007", "Em Frente", "123.45-000", "Salvador", UnidadeFederativa.BAHIA);
        Fisica fisica = new Fisica(Sexo.MASCULINO, "22/08/2024", "Rafael", "(71) 91234-6789", "Dendezeiro@gmail.com", endereco1);
        Jurica juridica = new Jurica("123.456/0001-78", "20240822", "Samir", "(71) 98765-4321", "senac@gmail.br",endereco1);
     
        
        
            System.out.println(fisica.toString());
            System.out.println(juridica.toString());
        }
    }