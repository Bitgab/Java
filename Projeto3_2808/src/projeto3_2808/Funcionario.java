/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projeto3_2808;

/**
 *
 * @author Aluno
 */
public abstract class Funcionario {
   protected String nome;
   protected String dataDeNascimento;
   protected Sexo sexo;
   protected Setor setor;
   protected double salarioBase;

    public Funcionario(String nome, String dataDeNascimento, Sexo sexo, Setor setor, double salarioBase) {
        this.nome = nome;
        this.dataDeNascimento = dataDeNascimento;
        this.sexo = sexo;
        this.setor = setor;
        this.salarioBase = salarioBase;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDataDeNascimento() {
        return dataDeNascimento;
    }

    public void setDataDeNascimento(String dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }

    public Sexo getSexo() {
        return sexo;
    }

    public void setSexo(Sexo sexo) {
        this.sexo = sexo;
    }

    public Setor getSetor() {
        return setor;
    }

    public void setSetor(Setor setor) {
        this.setor = setor;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }
    
    
    // A implementação não é obrigatória.
    public  abstract  double getSalarioFinal();
    
    
    @Override
    public String toString() {
        return  
               "\nNome: " + nome + 
               "\nData de Nascimento: " + dataDeNascimento + 
               "\nSexo: " + sexo.getNome() + 
               "\nSetor: " + setor.getNome() + 
               "\nSalarioBase: " + salarioBase +
               "\nSalário final: " + getSalarioFinal();
    }
    
    
    
}
