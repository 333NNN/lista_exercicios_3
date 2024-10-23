/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lista03_01_nata;

import java.util.Scanner;

/**
 *
 * @author ncunha
 */
public class LISTA03_01_NATA {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Insira um número: ");
        int n1 = read.nextInt();
        System.out.println("Insira outro número: ");
        int n2 = read.nextInt();

        int n3 = n1 + n2;
        System.out.println("A soma de " + n1 + " com " + n2 + " = " + n3);
    }
}
