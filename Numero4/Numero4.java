package Numero4;
/*
 * construir um programa em Java que leia
o salário bruto de um funcionário e calcule, armazene
e imprima o salário bruto, um desconto de 8% e o
salário líquido.
 */

import java.util.Scanner;

public class Numero4 {
    
    public static void main (String [] args){

        Scanner ler = new Scanner(System.in);
        System.out.println("Informe seu salario: ");

        float salario = ler.nextFloat();
        float desconto  = (float) (salario * 0.08);
        float salarioLiquido = salario - desconto;

        System.out.printf("O salario liquido é: R$%.2f\nO desconto é: R$%.2f\nO salario bruto é: R$%.2f\n",salarioLiquido,desconto,salario);
        ler.close();
    }
}
