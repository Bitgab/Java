/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clientecadastro;

/**
 *
 * @author Aluno
 */
public class ClienteCadastro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Cliente cliente = new Cliente("435365645", Sexo.MASCULINO, EstadoCivil.CASADO, "22/08/2024", "Samir", "(71) 91234-5678", "senai@gmail.com", new Endereco("Rua A", "123", "Em frente", "123.45-000", "Salvador", UnidadeFederativa.BAHIA));
        PrestacaoServico servico = new PrestacaoServico("21/08/2024", "22/08/2024", "123.456/0001-67", "2345576", "Fuboca", "(71)98765-4321", "fubocarafael.gmai.com", new Endereco("Rua B", "456", "Perto da quadra", "987.54-000", "Rio de janeiro", UnidadeFederativa.RIO_JANEIRO));
        
        System.out.println(cliente.toString());
        System.out.println(servico.toString());
        
        
    }
    
}
