/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cadastro2;

/**
 *
 * @author Aluno
 */
public class DispositivoDeArmazenamento  extends MarcaEModelo{
    
    private String capacidadeArmazenamento;
    private String tipoDeConexao;

    public DispositivoDeArmazenamento(String capacidadeArmazenamento, String tipoDeConexao, String marca, String modelo) {
        super(marca, modelo);
        this.capacidadeArmazenamento = capacidadeArmazenamento;
        this.tipoDeConexao = tipoDeConexao;
    }

    public String getTipoDeConexao() {
        return tipoDeConexao;
    }

    public void setTipoDeConexao(String tipoDeConexao) {
        this.tipoDeConexao = tipoDeConexao;
    }

    public String getCapacidadeArmazenamento() {
        return capacidadeArmazenamento;
    }

    public void setCapacidadeArmazenamento(String capacidadeArmazenamento) {
        this.capacidadeArmazenamento = capacidadeArmazenamento;
    }
    
}
