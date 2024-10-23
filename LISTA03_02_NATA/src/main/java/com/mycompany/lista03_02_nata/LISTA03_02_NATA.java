/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.lista03_02_nata;

import java.util.Scanner;

/**
 *
 * @author ncunha
 */
public class LISTA03_02_NATA {

    public static void main(String[] args) {
        int num = 0;

        Scanner read = new Scanner(System.in);

        System.out.println("Escreva um número que deseja averiguar: ");
        num = read.nextInt();

        if (num % 2 == 1) {
            System.out.println("O número " + num + " é ímpar");
        } 
        else {
            System.out.println("O número "+ num +" é par");
        }
    }
}
