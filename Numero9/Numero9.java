package Numero9;

/*
 * construir um programa em Java que leia
a quantidade de mini-games, calculadoras e canetas
vendidas por um camelô ao fim de um dia e calcule,
armazene e imprima o faturamento de cada produto e
o faturamento total. Mini-games: R$ 6.95,
calculadoras: R$ 3.50 e canetas: R$ 1.20.
 */

import java.util.Scanner;

public class Numero9 {
    
    public static void main(String [] args){

        Scanner ler = new Scanner(System.in);

        float fatCanetas = (float) 1.20;
        float fatMinigames = (float) 6.95;
        float fatCalc = (float) 3.50;
        float fatTotal = 0;

        System.out.println("Informe a quantidade de mini-games vendidos: ");

        int miniGames = ler.nextInt();
        
        System.out.println("Informe a quantidade de calculadoras vendidas: ");

        int calculadoras = ler.nextInt();

        System.out.println("Informe a quantidade de calculadoras vendidas: ");

        int canetas = ler.nextInt();

        fatCanetas *= (float) canetas;
        fatCalc *= (float) calculadoras;
        fatMinigames *= (float) miniGames;
        fatTotal += fatCalc + fatMinigames + fatCanetas;

        System.out.printf("O vendedor faturou R$%.2f vendendo canetas\n",fatCanetas);
        System.out.printf("O vendedor faturou R$%.2f vendendo calculadoras\n",fatCalc);
        System.out.printf("O vendedor faturou R$%.2f vendendo mini-games\n",fatMinigames);
        System.out.printf("O vendedor faturou R$%.2f ao total\n",fatTotal);


        ler.close();
    }
}