/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projeto3;

/**
 *
 * @author Aluno
 */
public class Livros {
    
     private String Titulo;
     private String Autor;
     private int paginas;
     private int preco;

    public Livros(String Titulo, String Autor, int paginas, int preco) {
        this.Titulo = Titulo;
        this.Autor = Autor;
        this.paginas = paginas;
        this.preco = preco;
    }
     
     

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }

    public String getAutor() {
        return Autor;
    }

    public void setAutor(String Autor) {
        this.Autor = Autor;
    }

    public int getPaginas() {
        return paginas;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

    public int getPreco() {
        return preco;
    }

    public void setPreco(int preco) {
        this.preco = preco;
    }
    
}
