/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.lista03_11_nata;

import java.util.Scanner;

/**
 *
 * @author Nata e Julia
 */
public class LISTA03_11_NATA {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int[] vetor = new int[10];

        System.out.println("Preencha o vetor com números inteiros: ");
        vetor[0] = read.nextInt();
        int maior = vetor[0];
        int menor = vetor[0];

        for (int i = 1; i < vetor.length; i++) {
            System.out.println("Preencha o vetor com números inteiros: ");
            vetor[i] = read.nextInt();

            if (vetor[i] > maior) {
                maior = vetor[i];
            }
            if (vetor[i] < menor) {
                menor = vetor[i];
            }
        }

        System.out.println("O maior valor encontrado no vetor é: " + maior + "\nE o menor valor encontrado é: " + menor);
    }
}
