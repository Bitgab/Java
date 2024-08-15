/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.projeto;

/**
 *
 * @author Aluno
 */
public class Cadastro1 {

    public static void main(String[] args) {
        Cliente clientes = new Cliente("15/08/2024", "Pix", "Fuboca", 22, "Rua A", 123, "Salvador", "(71) 91234-5678");
        
        Funcionario funcionarios =  new Funcionario("ADM", 3500.0, 4000.0, "Jose", 23, "Rua B", 456, "Vera Cruz", "(71) 876-4321");
        
        System.out.println("\nDados do Cliente:");
        System.out.println("Nome: " + clientes.getNome());
        System.err.println("Idade: " + clientes.getIdade() + " anos");
        System.out.println("Endereço: " + clientes.getLogradouro());
        System.out.println("Telefone: " + clientes.getTelefone());
        System.out.println("Data de pagamento: " + clientes.getDataDePagamento());
        System.out.println("Tipo de pagamento: " + clientes.getTipoDePagamento());
        
        System.out.println("\nDados do Funcionario:");
        System.out.println("Nome: " + funcionarios.getNome());
        System.out.println("Idada: " + funcionarios.getIdade() + " anos");
        System.out.println("Endereço: " + funcionarios.getLogradouro());
        System.out.println("Telefone: " + funcionarios.getTelefone());
        System.out.println("Cargo: " + funcionarios.getCargo());
        System.out.println("Salário: R$" + funcionarios.getSalario());
        System.out.println("Saldo em conta: R$" + funcionarios.getSaldoEmConta());
    }
}
