/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */

/**
 *
 * @author Aluno
 */
public enum Genero  {
  MASCULINO ("Masculino"),
  FEMININO  ("Feminino");
 
 private String nome;

    private Genero(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
 
}
