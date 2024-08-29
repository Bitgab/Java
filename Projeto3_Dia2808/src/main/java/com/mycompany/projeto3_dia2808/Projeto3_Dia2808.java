/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.projeto3_dia2808;

/**
 *
 * @author facil
 */
public class Projeto3_Dia2808 {

    public static void main(String[] args) {
       Motoboy boy = new Motoboy("211322", "Gabriel", "28/08/2024", Sexo.MASCULINO, Setor.OPERACOES, 1500);
       
       Diretor diretor = new Diretor("Anananis", "27/08/2024", Sexo.MASCULINO, Setor.OPERACOES, 5000);
 
       
        System.out.println(boy.toString());
        
        System.out.println(diretor.toString());
        
        diretor.admitir(boy);
    }
    
}
