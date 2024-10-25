/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.lista03_12_nata;

import java.util.Scanner;

/**
 *
 * @author Nata e Julia
 */
public class LISTA03_12_NATA {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        int num;

        System.out.println("Sistema de conferência de números primos");
        System.out.println("Digite um número inteiro: ");
        num = read.nextInt();

        if (num <= 1) {
            System.out.println("O número " + num + " não é primo.");
        } 
        else {
            boolean primo = true;  
        
        for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    primo = false;
                    break;
                }
            }

            if (primo) {
                System.out.println("O número " + num + " é primo.");
            } 
            else {
                System.out.println("O número " + num + " não é primo.");
            }
        }
    }
}
