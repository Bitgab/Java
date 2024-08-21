/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */

/**
 *
 * @author Aluno
 */
public enum UnidadeFederativa {
    
    BAHIA ("Bahia"),
    SAO_PAULO ("São Paulo"),
    RIO_DE_JANEIRO ("Rio de Janeiro");
    
    private String nome;

    private UnidadeFederativa(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
    
    
}
