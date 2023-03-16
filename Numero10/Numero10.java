package Numero10;

/*
 * construir um programa em Java que
leia a quantidade de vitórias, derrotas e empates de um
time ao final de um campeonato e que calcule,
armazene e imprima a quantidade total de jogos, a
quantidade de pontos disputados, de pontos ganhos e
pontos perdidos. Vitória: 3 pontos, empate: 1 ponto e
derrota: 0 ponto.
 */

import java.util.Scanner;

public class Numero10 {
    
    public static void main(String [] args){

        Scanner ler = new Scanner(System.in);

        System.out.println("Informe a quantidade de vitorias: ");

        int vitorias = ler.nextInt();

        System.out.println("Informe a quantidade de empates: ");

        int empates = ler.nextInt();

        System.out.println("Informe a quantidade de derrotas: ");

        int derrotas = ler.nextInt();

        int totalJogos = 0;

        totalJogos += vitorias + derrotas + empates;

        int pontosV = 3 * vitorias;

        int totalPontosD = totalJogos * 3;

        int pontosPerdidos  = totalPontosD - (empates + pontosV);
        
        System.out.printf("O time jogou um total de %d jogos\n",totalJogos);
        System.out.printf("O time disputou um total de %d pontos\n",totalPontosD);
        System.out.printf("O time ganhou um total de %d pontos\n",pontosV + empates);
        System.out.printf("O time perdeu um total de %d pontos\n",pontosPerdidos);



        ler.close();
    }
}