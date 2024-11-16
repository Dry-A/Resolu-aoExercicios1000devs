package Refatorando;

import java.util.Scanner;

//Faça um algoritmo que leia dois valores inteiros A e B se os
//valores forem iguais deverá se somar os dois, caso contrário
//multiplique A por B. Ao final de qualquer um dos cálculos
//deve-se atribuir o resultado para uma variável C e mostrar
//seu conteúdo na tela.

public class Exercicio6 {
    public static void main(String[] args) throws Exception {
        Scanner teclado;
        int a=0, b=0, c;

        teclado = new Scanner(System.in);

        try {
            System.out.print("Digite o valor de A: ");
            a = teclado.nextInt();

            System.out.print("Digite o valor de B: ");
            b = teclado.nextInt();

        }catch (Exception e){}


        c = (a == b) ? (a + b) : (a * b);

        System.out.println("O valor de C é: " + c);
    }
}
