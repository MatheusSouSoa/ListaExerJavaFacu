package Numero1;

//NUMERO 1
/*
 * construir um programa em Java que leia
um número inteiro e calcule e escreva o seu dobro.
 */


import java.util.Scanner;


public class Numero1{


    public static void main(String[] args){
        System.out.println("Informe um numero inteiro:");
        Scanner ler = new Scanner(System.in);


        int num = ler.nextInt();
        num = num * 2;


        System.out.printf("O dobro do numero digitado é: %d\n",num);
        ler.close();
    }
 }
