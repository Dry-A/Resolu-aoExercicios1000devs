package estruturasRepeticao;

//06: Faça um algoritmo que lê 5 valores inteiros, um de cada vez,
// e conte quantos destes valores são negativos e
//quantos são positivos, no fim escreva na tela a quantidade de
// números positivos e negativos lidos.

import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int numero;
        int contadorPositivos= 0;
        int contadorNegativos= 0;

        for(int i= 1; i <= 5; i++){

            System.out.println("Digite um numero:");
            numero = teclado.nextInt();

            if( numero > 0) {

                contadorPositivos+=1;

                System.out.println("Adicionei o numero na caixinha de Numeros Positivos ");

            } else if( numero < 0) {
                contadorNegativos+=1;
                System.out.println("Adicionei o numero na caixinha de Numeros Negativos ");
            }else {

                System.out.println("numero 0  número neutro, pois ele não é positivo e nem negativo.");
            }

        }

        System.out.println("Números positivos " + contadorPositivos);
        System.out.println("Números negativos " + contadorNegativos);

    }

}
