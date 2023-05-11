/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exemplooverloaad;

/**
 *
 * @author aluno
 */
public class Pessoa {
    public int anoNascimento;
    public int idade;
    
    public void calcularIdade(int anoNascimentoInf){
      anoNascimento = 2023- anoNascimentoInf;
         System.out.println("Idade: "+anoNascimento);
    }
}
