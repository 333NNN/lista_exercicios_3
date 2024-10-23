/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.lista03_03_nata;

import java.util.Scanner;

/**
 *
 * @author ncunha
 */
public class LISTA03_03_NATA {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int n1, n2;
        System.out.println("Insira a pontuação do jogador 1:");
        n1 = read.nextInt();
        System.out.println("Insira a pontuação do jogador 2:");
        n2 = read.nextInt();

        if (n1 > n2) {
            System.out.println("Jogador 1 venceu!");
        } 
        else if (n2 > n1) {
            System.out.println("Jogador 2 venceu!");
        } 
        else {
            System.out.println("Empate.");
        }
    }
}
