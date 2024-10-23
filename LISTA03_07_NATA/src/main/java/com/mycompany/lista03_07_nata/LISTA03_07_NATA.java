/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.lista03_07_nata;

import java.util.Scanner;

/**
 *
 * @author ncunha
 */
public class LISTA03_07_NATA {

    public static void main(String[] args) {
        int[] vet = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int num;
        boolean check = false;
        Scanner read = new Scanner(System.in);
        System.out.println("Digite o código do produto que deseja encontrar: ");
        num = read.nextInt();

        for (int i = 0; i < vet.length; i++) {
            if (num == i) {
                System.out.println("Produto "+ num +" encontrado na "+ i+"ª posição.");
                check = true;
                break;
            }
        }    
        if(!check) {
            System.out.println("Produto não encontrado");
        }
    }
}
