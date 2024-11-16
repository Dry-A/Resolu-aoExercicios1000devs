package Refatorando;

import java.util.Scanner;

//Faça um algoritmo que leia uma variável e some 5
//caso seja par ou some 8 caso seja ímpar,
//imprimir o resultado desta operação.
public class Exercicio4 {
    public static void main(String[] args) throws Exception {
        Scanner teclado;

        int valor=0, resultado=0;
        boolean ehImpar;

        teclado = new Scanner(System.in);

        try {
            System.out.print("Digite um valor qualquer: ");
            valor = teclado.nextInt();

        }catch (Exception e) {
            System.out.println("Digite um valor válido");
        }

        ehImpar = (valor % 2 != 0);

        System.out.println(ehImpar ? (resultado = valor + 8) : (resultado = valor + 5));

    }
}
