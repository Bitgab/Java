/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package projeto3_2808;

/**
 *
 * @author Aluno
 */
public enum Sexo {
  MASCULINO ('M', "Masculino"),
  FEMENINO  ('F', "Femenino");
  
  private char sigla;
  private String nome;

    private Sexo(char sigla, String nome) {
        this.sigla = sigla;
        this.nome = nome;
    }

    public char getSigla() {
        return sigla;
    }

    public String getNome() {
        return nome;
    }
  
  
}
