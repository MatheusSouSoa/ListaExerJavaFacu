package Numero7;

/*
 * construir um programa em Java que leia
a quilometragem inicial e final de um veículo em uma
viagem e ao final informe a quilometragem percorrida.
 */

 import java.util.Scanner;

public class Numero7 {
    
    public static void main(String [] args){

        Scanner ler = new Scanner(System.in);

        System.out.println("Informe a quilometragem inicial: ");

        int kmInicial = ler.nextInt();

        System.out.println("Informe a quilometragem final: ");

        int kmFinal = ler.nextInt();

        System.out.printf("A distancia percorrida foi: %d km",kmFinal - kmInicial);

        ler.close();
    }
}
