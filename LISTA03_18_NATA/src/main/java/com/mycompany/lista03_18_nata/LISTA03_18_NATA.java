/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.lista03_18_nata;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Nata e Julia
 */
public class LISTA03_18_NATA {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Cálculo de Férias");
        System.out.println("Insira o número de funcionários:");
        int numFunc = read.nextInt();
        read.nextLine();
        String[] nomes = new String[numFunc];
        float[] salarios = new float[numFunc];
        float[] ferias = new float[numFunc];

        for (int i = 0; i < numFunc; i++) {
            System.out.println("Informe o nome do funcionário " + (i + 1) + ": ");
            nomes[i] = read.nextLine();
            System.out.println("Informe o salário do funcionário " + (i + 1) + ":");
            salarios[i] = read.nextFloat();
            read.nextLine();
            ferias[i] = salarios[i] + (salarios[i] / 3);
        }

        String resultado = "Cálculo das Férias:\n";
        for (int i = 0; i < numFunc; i++) {
            resultado += "Funcionário: " + nomes[i] + ", Salário: " + salarios[i] + ", Valor das Férias: " + ferias[i] + "\n";
        }

        JOptionPane.showMessageDialog(null, resultado, "Resultados das Férias", JOptionPane.INFORMATION_MESSAGE);

        String caminho = "C:\\Users\\Nata e Julia\\Desktop\\";
        try (FileWriter arquivo = new FileWriter(caminho + "ferias.txt"); PrintWriter gravar = new PrintWriter(arquivo)) {
            for (int i = 0; i < numFunc; i++) {
                gravar.println("Funcionário: " + nomes[i] + ", Valor das Férias: " + ferias[i]);
            }
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Erro ao salvar os dados: " + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }

    }
}
