/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.cadastro2;

/**
 *
 * @author Aluno
 */
public class Cadastro2 {

    public static void main(String[] args) {
        Processador processador = new Processador("6 Ghz", "Intel", "BX8071");
        PlacaMamae placamae = new PlacaMamae("LGA1700", "Gigabyte", "Z790 AORUS");
        Memoria memoria = new Memoria("16 Gb", "3200Mhz", "Kingston", "Impact KF");
        DispositivoDeArmazenamento armazenamento = new DispositivoDeArmazenamento("1TB", "USB 3.2 Gen 2", "Kingston", "SXS1000");
        
          System.out.println("\nInformação Técnica Processador: ");  
          System.out.println("Frenquência: " + processador.getFrequencia());
          System.out.println("Marca: " + processador.getMarca());
          System.out.println("Modelo: " + processador.getModelo());
          
          System.out.println("\nInformação Técnica Placa Mãe:");
          System.out.println("Soquete: " + placamae.getSoquete());
          System.out.println("Marca: " + placamae.getMarca());
          System.out.println("modelo: " + placamae.getSoquete());
          
          System.out.println("\nInformação Técnica Memória:");
          System.out.println("Capacidade de Armazenamento: " + memoria.getCapacidadeArmazenamento());
          System.out.println("Frequência: " + memoria.getFrequencia());
          System.out.println("Marca: " + memoria.getMarca());
          System.out.println("Modelo: " + memoria.getModelo());
          
          System.out.println("\nInformação Técnica Dispositivo de Armazenamento: ");
          System.out.println("Capacidade de Armazenamento: " + armazenamento.getCapacidadeArmazenamento());
          System.out.println("Tipo de conexão: " + armazenamento.getTipoDeConexao());
          System.out.println("Marca: " + armazenamento.getMarca());
          System.out.println("Modelo; " + armazenamento.getModelo());
    }
}
