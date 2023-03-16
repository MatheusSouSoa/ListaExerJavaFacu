package Numero5;
/*
 * construir um programa em Java que leia
os valores de A, B e C e calcule, armazene e imprima
o valor do delta. D = B2
- 4*A*C.
 */

 import java.util.Scanner;

public class Numero5 {
 
    public static void main (String [] Args){

        Scanner ler = new Scanner(System.in);

        System.out.println("Informe o valor de A:");
        int valorA = ler.nextInt();

        System.out.println("Informe o valor de B:");
        int valorB = ler.nextInt();

        System.out.println("Informe o valor de C:");
        int valorC = ler.nextInt();

        int Delta = (valorB * valorB) - (4* valorA * valorC);

        System.out.printf("O delta é: %d\n",Delta);
        ler.close();
    }
}
