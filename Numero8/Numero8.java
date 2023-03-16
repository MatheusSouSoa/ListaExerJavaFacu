package Numero8;

/*
 * construir um programa em Java que leia
a quantidade de alunos do sexo masculino, do sexo
feminino e a quantidade de alunos aprovados de uma
turma e calcule, armazene e imprima o total de alunos
e a porcentagem de alunos do sexo masculino, do sexo
feminino e a porcentagem de alunos aprovados.
 */

import java.util.Scanner;

public class Numero8 {
     
    public static void main(String [] args){

        Scanner ler = new Scanner(System.in);

        System.out.println("Informe a quantidade de alunos do sexo masculino: ");

        int sexoM = ler.nextInt();

        System.out.println("Informe a quantidade de alunos do sexo feminino: ");

        int sexoF = ler.nextInt();

        System.out.println("Informe a quantidade de alunos aprovados: ");

        int aprovados = ler.nextInt();

        int total = sexoF + sexoM;

        float porcenM = (float)(sexoM * 100) / (float) total;

        float porcenF = (float)(sexoF * 100) / (float) total;

        float porcenA = (float)(aprovados * 100) / (float) total;



        System.out.printf("O total de alunos é: %d\n",total);
        System.out.printf("A porcentagem de alunos do sexo masculinos é: %.2f%%\n",porcenM);
        System.out.printf("A porcentagem de alunas do sexo feminino é: %.2f%%\n",porcenF);
        System.out.printf("A porcentagem de alunos aprovados é: %.2f%%\n",porcenA);

        ler.close();
    }
}
