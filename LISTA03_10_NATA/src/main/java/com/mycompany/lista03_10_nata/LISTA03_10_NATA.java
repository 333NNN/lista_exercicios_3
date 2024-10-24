/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.lista03_10_nata;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Nata e Julia
 */
public class LISTA03_10_NATA {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        
        System.out.println("Pesquisa de gêneros cinematográficos");
        System.out.println("Insira o número de participantes da pesquisa:");
        int numPart = read.nextInt();

        String[] generos = {"Ação", "Animação", "Aventura", "Comédia", "Drama", "Documentário", "Ficção científica", "Guerra", "Policial", "Romance", "Suspense", "Terror"};
        int[] respostas = new int[generos.length];

        for (int i = 0; i < numPart; i++) {
            System.out.println("Resposta nº"+(i+1)+"\nQual seu gênero cinematográfico favorito?\nResponda com números entre: ");
            for (int j = 0; j < generos.length; j++) {
                System.out.println((j + 1) + " - " + generos[j]);
                }
            int escolha = read.nextInt();
            if (escolha > 0 && escolha <= generos.length) {
                respostas[escolha - 1]++;
            } 
            else {
                System.out.println("Escolha inválida. Tente novamente.");
                i--;
            }
        }
        String resultado = "Resultado da Pesquisa de Preferências de Filmes:\n";
        for (int i = 0; i < generos.length; i++) {
            resultado += generos[i] + ": " + respostas[i] + " votos\n";
        }
        

        JOptionPane.showMessageDialog(null, resultado, "Pesquisa de Preferências", JOptionPane.INFORMATION_MESSAGE);
        
        try {
            FileWriter writer = new FileWriter("resultado_pesquisa_filmes.txt");
            writer.write(resultado);
            writer.close();
            System.out.println("Resultado salvo com sucesso!");
        } catch (IOException e) {
            System.out.println("Erro ao salvar o arquivo! Erro:" + e);
        }

    }
}