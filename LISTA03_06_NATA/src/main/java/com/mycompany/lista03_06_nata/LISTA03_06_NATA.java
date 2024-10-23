/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lista03_06_nata;

import java.util.Scanner;

/**
 *
 * @author ncunha
 */
public class LISTA03_06_NATA {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        
        System.out.print("Digite a primeira nota: ");
        float n1 = read.nextFloat();
        System.out.print("Digite a segunda nota: ");
        float n2 = read.nextFloat();
        System.out.print("Digite a terceira nota: ");
        float n3 = read.nextFloat();
        float media = (n1 + n2 + n3)/3;
        
        System.out.println("Sua média é: " + media);        
    }
}
