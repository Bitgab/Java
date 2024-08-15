/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cadastro2;

/**
 *
 * @author Aluno
 */
public class Memoria extends MarcaEModelo{
    
   private String capacidadeArmazenamento;
   private String frequencia;

    public Memoria(String capacidadeArmazenamento, String frequencia, String marca, String modelo) {
        super(marca, modelo);
        this.capacidadeArmazenamento = capacidadeArmazenamento;
        this.frequencia = frequencia;
    }

    public String getCapacidadeArmazenamento() {
        return capacidadeArmazenamento;
    }

    public void setCapacidadeArmazenamento(String capacidadeArmazenamento) {
        this.capacidadeArmazenamento = capacidadeArmazenamento;
    }

    public String getFrequencia() {
        return frequencia;
    }

    public void setFrequencia(String frequencia) {
        this.frequencia = frequencia;
    }
   
    
}
