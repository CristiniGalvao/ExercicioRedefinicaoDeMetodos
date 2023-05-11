/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.calculadora;

/**
 *
 * @author aluno
 */
public class Calculadora {

    public static void main(String[] args) {
       CalculadoraOverloadd calc = new CalculadoraOverloadd();
       int resultado1 = calc.somar(2, 3);
       double resultado2  =calc.somar(2.5, 3.5);
       int resultado3 = calc.somar(2, 3, 4);
       System.out.println("Resultado 1: "+resultado1+"\nResultado 2: "+resultado2+"\nResultado 3: "+resultado3);
    }
}
