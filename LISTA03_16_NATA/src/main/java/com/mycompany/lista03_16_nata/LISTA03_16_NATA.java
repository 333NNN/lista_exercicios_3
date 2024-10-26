/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.lista03_16_nata;

import java.util.Scanner;

/**
 *
 * @author Nata e Julia
 */
public class LISTA03_16_NATA {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        System.out.println("Sistema de pontuações de jogadores\nInsira a quantidade de jogadores:");
        int jogadores = read.nextInt();
        int pontos[] = new int[jogadores];
        int indices[] = new int[jogadores];
        boolean trocou;

        for (int i = 0; i < jogadores; i++) {
            System.out.println("Insira a pontuação do(a) jogador(a) " + (i + 1) + ":");
            pontos[i] = read.nextInt();
            indices[i] = i + 1;
        }

        for (int i = 0; i < jogadores - 1; i++) {
            trocou = false;
            for (int j = 0; j < jogadores - i - 1; j++) {
                if (pontos[j] < pontos[j + 1]) {

                    int temp = pontos[j];
                    pontos[j] = pontos[j + 1];
                    pontos[j + 1] = temp;

                    int tempIndice = indices[j];
                    indices[j] = indices[j + 1];
                    indices[j + 1] = tempIndice;

                    trocou = true;
                }
            }
            if (!trocou) {
                break;
            }
        }

        for (int i = 0; i < jogadores; i++) {
            if (i == 0) {
                System.out.println("1º Lugar - Jogador " + indices[i] + ": " + pontos[i] + " pontos");
            } 
            else {
                System.out.println((i + 1) + "º Lugar - Jogador " + indices[i] + ": " + pontos[i] + " pontos");
            }
        }
    }
}
