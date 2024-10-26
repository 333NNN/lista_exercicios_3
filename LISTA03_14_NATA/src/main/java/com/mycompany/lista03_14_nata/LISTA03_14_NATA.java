/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.lista03_14_nata;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Nata e Julia
 */
public class LISTA03_14_NATA {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Sistema de Cadastro de Funcionários\nQuantos funcionários deseja cadastrar?");
        int tamVet = read.nextInt();
        read.nextLine();
        String[] nomes = new String[tamVet];
        String[] salarios = new String[tamVet];
        String[] nomeSalario = new String[tamVet];

        for (int i = 0; i < tamVet; i++) {
            System.out.println("Funcionário nº" + (i + 1));
            nomes[i] = read.nextLine();

        }
        for (int j = 0; j < tamVet; j++) {
            System.out.print("Salário do funcionário nº" + (j + 1) + ": R$ ");
            salarios[j] = read.nextLine();
        }
        
        System.out.println("Deseja atualizar o salário de algum funcionário?\nDigite S ou N:");
        String opc = read.nextLine();
        read.nextLine();
        
        if (opc.equalsIgnoreCase("S")) {
            System.out.println("Digite o número do funcionário que deseja alterar o salário:");
            int esc = read.nextInt()-1;
            read.nextLine();
            if (esc >= 0 && esc < nomes.length) {
                System.out.println("Funcionário: " + nomes[esc] + "\nDigite o novo salário: R$");
                salarios[esc] = read.nextLine();
                System.out.println("Salário atualizado com sucesso para: R$" + salarios[esc]);
            } 
            else {
                System.out.println("Número de funcionário inválido.");
            }
        } 
        else {
            System.out.println("Nenhuma atualização realizada.");
        }
        for (int i = 0; i < tamVet; i++) {
            nomeSalario[i] = nomes[i] + " -  R$ " + salarios[i];
        }
        JOptionPane.showMessageDialog(null, nomeSalario, "Funcionários e salários", JOptionPane.INFORMATION_MESSAGE);
        
        String caminho = "C:\\Users\\Nata e Julia\\Desktop\\";
        try (FileWriter arquivo = new FileWriter(caminho + "Funcionários e salários.txt"); PrintWriter gravar = new PrintWriter(arquivo)) {
            for (int i = 0; i < tamVet; i++) {
                gravar.printf("Nome: " + nomes[i] + "\n");
                gravar.printf("Salário: " + salarios[i] + "\n");
            }
            gravar.printf("---------------\n");
            System.out.println("Arquivo gerado com sucesso em " + caminho);

        } catch (IOException e) {
            System.out.println("Erro ao gerar o arquivo: " + e.getMessage());

        }
    }
}
