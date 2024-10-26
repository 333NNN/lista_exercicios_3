/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lista03_19_nata;

import java.util.Scanner;

/**
 *
 * @author Nata e Julia
 */
public class LISTA03_19_NATA {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        System.out.println("Cálculo salarial\nInsira o valor de sua hora trabalhada: ");
        float valorHora = read.nextFloat();

        System.out.println("Insira o total de horas trabalhadas no mês: ");
        int horaTrab = read.nextInt();

        float salarioBruto = horaTrab * valorHora;
        float impostoRenda = salarioBruto * 0.11f;
        float inss = salarioBruto * 0.08f;
        float sindicato = salarioBruto * 0.05f;
        float salarioLiq = salarioBruto - impostoRenda - inss - sindicato;

        System.out.println("+ Salário Bruto: R$ " + salarioBruto + "\n"
                + "- Imposto de Renda (11%): R$ " + impostoRenda + "\n"
                + "- INSS (8%): R$" + inss + "\n"
                + "- Sindicato (5%): R$ " + sindicato + "\n"
                + "= Salário Líquido: R$ " +  salarioLiq);
    }
}
