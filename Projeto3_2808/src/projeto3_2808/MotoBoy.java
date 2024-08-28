/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projeto3_2808;

/**
 *
 * @author Aluno
 */
public class MotoBoy extends Funcionario{
  private String cnh;

    public MotoBoy(String cnh, String nome, String dataDeNascimento, Sexo sexo, Setor setor, double salarioBase) {
        super(nome, dataDeNascimento, sexo, setor, salarioBase);
        this.cnh = cnh;
    }

    public String getCnh() {
        return cnh;
    }

    public void setCnh(String cnh) {
        this.cnh = cnh;
    }

    @Override
    public String toString() {
        return "\nMoto boy: " + 
               "\nCarteira de Habilidade: " + cnh;
       
    }
    @Override 
    public double getSalarioFinal();
    retur super.toStr
  
}
