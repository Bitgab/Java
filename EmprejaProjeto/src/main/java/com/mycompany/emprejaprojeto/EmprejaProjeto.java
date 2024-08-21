/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.emprejaprojeto;

/**
 *
 * @author Aluno
 */
public class EmprejaProjeto {

    public static void main(String[] args) {
       Funcionario funcionario = new Funcionario(1212, "Gabreil", "123.456.789-00", "12.345.567-12", "21082024", "21/08/2024", Genero.MASCULINO, Setor.ENGENHARIA, 10000.00, "(71) 91234-5678", "senail@gmail.com", new Endereco("Rua A", "123", "Perto do Senai", "12345-000", "Salvador", UnidadeFederativa.BAHIA));
    
        System.out.println(funcionario.toString());
       
    }
}
