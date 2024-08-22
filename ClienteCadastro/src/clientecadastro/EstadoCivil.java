/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package clientecadastro;

/**
 *
 * @author Aluno
 */
public enum EstadoCivil {
    SOLTEIRTO ("Solteiro"),
    CASADO("Casado"),
    SEPARADO("Separado"),
    DIVORCIADO("Divorciado"),
    VIUVO("Viuvo");
    
    private String nome;

    private EstadoCivil(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
    
    
}
