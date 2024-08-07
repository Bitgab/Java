/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.class1;

/**
 *
 * @author Aluno
 */
public class Principal {

    public static void main(String[] args) {
      // Class guardas as caracristicas do projeto  
      // No java precisa primeiro dizer o tipo para depois a variavel.
      // Quando tem public Sing. que esse arquivo pode ser visto por qualquer outro projeto. Public ou priveite é posivel carregar outros arquivos. 
     // set para colocar e Get para exibir.
      Clientes cliente = new Clientes();
      
      
      
      cliente.setNome("Samir");
      cliente.setIdade(20);
      
      //Exibindo rersultado.
      System.out.println("Nome: " + cliente.getNome());
      System.out.println("Idade: " + cliente.getIdade() + " anos");
    }
}
