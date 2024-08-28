/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projeto3_2808;

/**
 *
 * @author Aluno
 */
public class Direitor extends Funcionario implements Contratacao{
    final double PREMIO = 0.2;

    public Direitor(String nome, String dataDeNascimento, Sexo sexo, Setor setor, double salarioBase) {
        super(nome, dataDeNascimento, sexo, setor, salarioBase);
    }
    
    @Override
    public double getSalarioFinal() {
        double salarioFinal = 0; 
        salarioFinal = super.salarioBase * PREMIO;
        salarioFinal += super.salarioBase;
        return salarioFinal;
    }

    @Override
    public void admitir(Funcionario funcionario) {
        System.out.println("=== Adimitindo Funcionário ===");
        System.out.println("Dados do funcionário: ");
        System.out.println(funcionario.toString());
    }

    @Override
    public void demitir(Funcionario funcionario) {
        System.out.println("=== Demitindo Funcionário ===");
        System.out.println("Dados do Funcionário: ");
        System.out.println(funcionario.toString());
    }
    
    public  double getPREMIO(){
     return PREMIO;
    }
}
