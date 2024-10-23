/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.lista03_08_nata;

import java.util.Scanner;

/**
 *
 * @author ncunha
 */
public class LISTA03_08_NATA {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.print("Digite a primeira nota: ");
        float n1 = ler.nextFloat();
        System.out.print("Digite a segunda nota: ");
        float n2 = ler.nextFloat();
        System.out.print("Digite a terceira nota: ");
        float n3 = ler.nextFloat();
        float media = (n1 + n2 + n3) / 3;

        System.out.println("Sua nota é: " + media);
        if (media >= 6) {
            System.out.println("Aluno aprovado.");
        } 
        else {
            System.out.println("Aluno reprovado.");
        }
    }
}
