/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lista03_17_nata;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author Nata e Julia
 */
public class LISTA03_17_NATA {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        
        System.out.println("Sistema de cadastro\nInsira a quantidade de usuários a serem cadastrados:");
        int n = read.nextInt();
        read.nextLine();
        String[][] cadastro = new String[n][3];
        
        for (int i = 0; i < n; i++) {
            System.out.println("Insira o nome do usuário:");
            cadastro[i][0] = read.nextLine();
            
            System.out.println("Insira a idade do usuário:");
            cadastro[i][1] = read.nextLine();
            
            System.out.println("Insira o e-mail do usuário:");
            cadastro[i][2] = read.nextLine();
        }
        
        System.out.println("\nUsuários cadastrados:");
        for (int i = 0; i < n; i++) {
            System.out.println("Nome: " + cadastro[i][0] + ", Idade: " + cadastro[i][1] + ", E-mail: " + cadastro[i][2]);
        }
        String caminho = "C:\\Users\\Nata e Julia\\Desktop\\";
        try (FileWriter arquivo = new FileWriter(caminho+ "usuarios_cadastrados.txt"); 
            PrintWriter gravar = new PrintWriter(arquivo)) {
            for (int i = 0; i < n; i++) {
                gravar.printf("Nome: %s, Idade: %s, E-mail: %s%n", cadastro[i][0], cadastro[i][1], cadastro[i][2]);
            }
            System.out.println("Dados exportados com sucesso para " + caminho);
        } catch (IOException e) {
            System.out.println("Erro ao gerar o arquivo: " + e.getMessage());
        }
    }
}
