package br.com.dio.exercicios.loops;

/*
Faça um programa que calcule o fatorial de número inteiro fornecido pelo usúario.
Ex.: 5!=120 (5 x 4 x 3 x 2 x 1)
 */

import java.util.Scanner;

public class ex6_Fatorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Fatorial: ");
        int fatorial = scan.nextInt();

        int multiplicação = 1;

        System.out.println(fatorial + "! = u");
        for(int i = fatorial ;i >=1;i = i - 1){

            multiplicação = multiplicação * i;
        }
        System.out.println(multiplicação);
    }
}
