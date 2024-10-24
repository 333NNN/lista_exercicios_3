/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.lista03_09_nata;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author ncunha
 */
public class LISTA03_09_NATA {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        
        System.out.println("Bem-vindo ao Restaurante Senai!\nInforme seu nome: ");
        String nome = read.nextLine();
        
        // Menu do restaurante
        String[] entradas = {"Bruschetta Tradicional", "Bolinho de Bacalhau", "Carpaccio de Carne", "Salada Caprese"};
        float[] precosEntradas = {18.90f, 22.50f, 29.90f, 24.00f};
        
        String[] pratosPrincipais = {
            "Filé Mignon ao Molho Madeira", "Salmão Grelhado com Legumes", "Risoto de Cogumelos", 
            "Lasanha à Bolonhesa", "Frango à Parmegiana com Arroz e Batata Frita", 
            "Bacalhau à Gomes de Sá", "Picanha com Farofa e Vinagrete"
        };
        float[] precosPratosPrincipais = {59.90f, 52.90f, 47.50f, 42.00f, 45.90f, 64.90f, 69.90f};
        
        String[] sobremesas = {"Pudim de Leite Condensado", "Torta de Limão", "Brownie com Sorvete", "Mousse de Chocolate"};
        float[] precosSobremesas = {14.90f, 16.50f, 18.90f, 15.00f};
        
        String[] bebidas = {"Suco Natural de Laranja", "Refrigerante Lata", "Água Mineral (com ou sem gás)", 
                            "Cerveja Long Neck", "Caipirinha Tradicional"};
        float[] precosBebidas = {8.90f, 6.00f, 4.50f, 9.00f, 16.00f};
        

        System.out.println("Informe a quantidade de itens que você irá pedir: ");
        int totalPedido = read.nextInt();
        read.nextLine();
        
        String[] itemPedido = new String[totalPedido];
        int[] qntdPedido = new int[totalPedido];
        float[] precoPedido = new float[totalPedido];
        float valorTotal = 0;

        for (int i = 0; i < totalPedido; i++) {
            System.out.println("Escolha a categoria (1 - Entradas, 2 - Pratos Principais, 3 - Sobremesas, 4 - Bebidas): ");
            int categoria = read.nextInt();
            
            switch (categoria) {
                case 1:
                    itemPedido[i] = selecionarItem(entradas, precosEntradas, read);
                    precoPedido[i] = obterPrecoItem(itemPedido[i], entradas, precosEntradas);
                    break;
                    
                case 2:
                    itemPedido[i] = selecionarItem(pratosPrincipais, precosPratosPrincipais, read);
                    precoPedido[i] = obterPrecoItem(itemPedido[i], pratosPrincipais, precosPratosPrincipais);
                    break;
                    
                case 3:
                    itemPedido[i] = selecionarItem(sobremesas, precosSobremesas, read);
                    precoPedido[i] = obterPrecoItem(itemPedido[i], sobremesas, precosSobremesas);
                    break;
                    
                case 4:
                    itemPedido[i] = selecionarItem(bebidas, precosBebidas, read);
                    precoPedido[i] = obterPrecoItem(itemPedido[i], bebidas, precosBebidas);
                    break;
                    
                default:
                    System.out.println("Categoria inválida. Tente novamente.");
                    i--;
                    continue;
            }
            
            System.out.println("Informe a quantidade de " + itemPedido[i] + ": ");
            qntdPedido[i] = read.nextInt();
            read.nextLine();
            valorTotal += qntdPedido[i] * precoPedido[i];
        }

        String resumo = "Resumo do Pedido de " + nome + ":\n";
        for (int i = 0; i < totalPedido; i++) {
            resumo += qntdPedido[i] + "x " + itemPedido[i] + " - R$" + precoPedido[i] + "\n";
        }
        resumo += "\nValor Total: R$" + valorTotal;

        JOptionPane.showMessageDialog(null, resumo, "Resumo do Pedido", JOptionPane.INFORMATION_MESSAGE);

        try {
            FileWriter writer = new FileWriter("pedido_" + nome + ".txt");
            writer.write(resumo);
            writer.close();
            System.out.println("Pedido salvo com sucesso!");
        } catch (IOException e) {
            System.out.println("Erro ao salvar o arquivo!");
            e.printStackTrace();
        }
        
        read.close();
    }

    public static String selecionarItem(String[] itens, float[] precos, Scanner read) {
        System.out.println("Escolha um item:");
        for (int i = 0; i < itens.length; i++) {
            System.out.println((i + 1) + ". " + itens[i] + " - R$" + precos[i]);
        }
        
        int escolha = read.nextInt();
        read.nextLine();
        return itens[escolha - 1];
    }

    public static float obterPrecoItem(String item, String[] itens, float[] precos) {
        for (int i = 0; i < itens.length; i++) {
            if (itens[i].equals(item)) {
                return precos[i];
            }
        }
        return 0;
    }
}
