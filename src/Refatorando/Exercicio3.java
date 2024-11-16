package Refatorando;

import java.util.Scanner;

//Faça um algoritmo para receber um número qualquer e
//informar na tela se é par ou ímpar.
public class Exercicio3 {
    public static void main(String[] args) throws Exception {
        Scanner teclado;
        int valor=0;
        boolean ehImpar=false;

        teclado = new Scanner(System.in);

        try {
            System.out.print("Digite um valor qualquer: ");
            valor = teclado.nextInt();

        }catch (Exception e) {
            System.out.println("Valor inválido");
        }

        ehImpar = (valor % 2 != 0);

        System.out.println(ehImpar? "O número é ímpar." : "O número " + valor + " é par.");

    }
}
