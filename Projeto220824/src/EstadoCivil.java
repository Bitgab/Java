/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */

/**
 *
 * @author Aluno
 */
public enum EstadoCivil {
    SOLTEIRO ("Solteiro"),
    CASADO ("Casado"),
    SEPARADO ("Separado"),
    DIVOCIADO ("Divociado"),
    VIUVO ("Viuvo");
    
    private String nome;

    private EstadoCivil(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
    
    
}
