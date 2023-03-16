package Numero6;

/*
 * construir um programa em Java que leia
uma distância em quilômetros e calcule, armazene e
imprima essa distância em metros.
 */

import java.util.Scanner;

public class Numero6 {

    public static void main(String [] args){

        Scanner ler = new Scanner(System.in);

        System.out.println("Informe a distancia em km: ");

        float km = ler.nextFloat();

        float metros = km * 1000;

        System.out.printf("%.2f km's em metros é: %.0f metros\n",km,metros);

        ler.close();
    }
    
}
