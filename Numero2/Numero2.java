package Numero2;




/* construir um programa em Java que leia
2 números inteiros e calcule, armazene e imprima a
média aritmética e a metade da diferença entre eles.
 */


import java.util.Scanner;


public class Numero2{


    public static void main(String [] args){


        Scanner ler = new Scanner(System.in);


        System.out.println("Informe o primeiro numero: ");
        int num1 = ler.nextInt();


        System.out.println("Informe o segundo numero: ");
        int num2 = ler.nextInt();


        ler.close();


        float media =  (((float)num1 + (float)num2) / 2);
        float metadeDif;


        if(num1 > num2){
            metadeDif = (((float)num1 - (float)num2) / 2);
        }
        else{
            metadeDif =  (((float)num2 - (float)num1) / 2);
        }


        System.out.printf("A media aritimetica entre os numeros %d e %d é: %.2f\n",num1, num2, media);
        System.out.printf("A metade da diferença entre ele é: %.2f\n",metadeDif);
       
       
    }
}
