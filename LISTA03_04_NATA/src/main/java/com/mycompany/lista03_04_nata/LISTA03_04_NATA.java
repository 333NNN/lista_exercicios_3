/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.lista03_04_nata;

import java.util.Scanner;

/**
 *
 * @author ncunha
 */
public class LISTA03_04_NATA {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int num;

        System.out.println("Insira o número que deseja visualizar a tabuada:");
        num = read.nextInt();
        System.out.println("--* Tabudada do " + num +" *--");
        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " x " + i + " = " + num * i);
        }
    }
}
