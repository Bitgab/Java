/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Aluno
 */
public class PrestacaoServico {
    private String contratoInico;
    private String contratoFim;

    public PrestacaoServico(String contratoInico, String contratoFim) {
        this.contratoInico = contratoInico;
        this.contratoFim = contratoFim;
    }

    public String getContratoFim() {
        return contratoFim;
    }

    public void setContratoFim(String contratoFim) {
        this.contratoFim = contratoFim;
    }

    public String getContratoInico() {
        return contratoInico;
    }

    public void setContratoInico(String contratoInico) {
        this.contratoInico = contratoInico;
    }

    @Override
    public String toString() {
        return "\nPrestacaoServico: " + 
               "\nInício do contrato: " + contratoInico + 
               "\nFim do contrato: " + contratoFim + 
                super.toString();
    }
    
    
}
