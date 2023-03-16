package Numero3;


/*
 * construir um programa em Java que leia
as 3 notas de um aluno e calcule, armazene e imprima
a média final.
 */


 import java.util.Scanner;


public class Numero3 {
   
    public static void main (String [] args){


        Scanner ler = new Scanner(System.in);


        float total = 0;


        for(int i = 0; i < 3; i++){
            System.out.printf("Informe a %d° nota do aluno:\n",i+1);
            float nota = ler.nextFloat();
            total += nota;
        }


        float mediaFinal  = total / 3;


        System.out.printf("A media final do aluno é: %.2f\n",mediaFinal);

        ler.close();
       
    }
}
