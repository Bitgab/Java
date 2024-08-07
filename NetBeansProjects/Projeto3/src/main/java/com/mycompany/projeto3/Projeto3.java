/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.projeto3;

/**
 *
 * @author Aluno
 */
public class Projeto3 {

    public static void main(String[] args) {
       Livros livro = new Livros("Senai", "Fuboca", 12, 351);
       
        System.out.println("Título: " + livro.getTitulo());
        System.out.println("Autor: " + livro.getAutor());
        System.out.println("Páginas: " + livro.getPaginas());
        System.out.println("Preço: R$" + livro.getPreco() + " reais");
    }
}
