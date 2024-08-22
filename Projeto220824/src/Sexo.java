/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */

/**
 *
 * @author Aluno
 */
public enum Sexo {
  MASCULINO ("Masculino" , 'M'),
  FEMENINO ("Femenino" , 'F');
  
  private String nome;
  private char sigla;

    private Sexo(String nome, char sigla) {
        this.nome = nome;
        this.sigla = sigla;
    }

    public String getNome() {
        return nome;
    }

    public char getSigla() {
        return sigla;
    }
  
  
}
