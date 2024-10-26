/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lista03_13_nata;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Nata e Julia
 */
public class LISTA03_13_NATA {

    public static void main(String[] args) throws IOException {
        Scanner read = new Scanner(System.in);
        System.out.println("Sistema de Cadastro de Produtos\nQuantos produtos deseja cadastrar?");
        int tamVet = read.nextInt();
        read.nextLine();
        String[] produtos = new String[tamVet];
        String[] precos = new String[tamVet];
        String[] prodsPrecos = new String[tamVet];

        for (int i = 0; i < tamVet; i++) {
            System.out.println("Produto nº" + (i + 1));
            produtos[i] = read.nextLine();

        }
        for (int j = 0; j < tamVet; j++) {
            System.out.print("Preço do produto nº" + (j + 1) + ": R$ ");
            precos[j] = read.nextLine();
        }

        for (int i = 0; i < tamVet; i++) {
            prodsPrecos[i] = produtos[i] + "  R$ " + precos[i];
        }
        JOptionPane.showMessageDialog(null, prodsPrecos, "Produtos e preços", JOptionPane.INFORMATION_MESSAGE);

        String caminho = "C:\\Users\\ncunha\\Desktop\\TESTE_NOVA_PASTA\\";
        try (FileWriter arquivo = new FileWriter(caminho + "Preços e produtos.txt"); PrintWriter gravar = new PrintWriter(arquivo)) {
            for (int i = 0; i < tamVet; i++) {
                gravar.printf("Produtos: " + produtos[i]+"\n");
                gravar.printf("Preços: " + precos[i]);
            }
            gravar.printf("---------------\n");
            System.out.println("Arquivo gerado com sucesso em " + caminho);

        } catch (IOException e) {
            System.out.println("Erro ao gerar o arquivo: " + e.getMessage());

        }
    }
}
