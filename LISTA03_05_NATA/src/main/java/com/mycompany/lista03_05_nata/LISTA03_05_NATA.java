/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.lista03_05_nata;

import java.util.Scanner;

/**
 *
 * @author ncunha
 */
public class LISTA03_05_NATA {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int num;
        System.out.println("Digite o valor para a contagem regressiva:");
        num =read.nextInt();
        
        System.out.println("Contagem regressiva...");
        for (int i = num; i > 0; i--) {
            System.out.println(i + "...");
        }
    }
}
