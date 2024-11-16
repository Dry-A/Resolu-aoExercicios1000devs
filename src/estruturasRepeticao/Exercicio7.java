package estruturasRepeticao;

//07: Faça um algoritmo que lê vários valores inteiros.
// Após a leitura de um valor o usuário responde se deseja
//digitar um novo valor. Após a leitura dos valores apresente
// a média dos valores pares e a média dos valores
//ímpares.

import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        char resposta;

        int numero;

        int contadorNumerosPares = 0;
        int contadorNumerosImpares = 0;

        int somaNumerosPares = 0;
        int somaNumerosImpares = 0;

        do {
            System.out.println("Digite um numero: ");
            numero = entrada.nextInt();

            entrada.nextLine();//limpa o buffer

            if (numero % 2 == 0) {
                contadorNumerosPares++;
                somaNumerosPares+=numero;
                System.out.println("Quantidade de numeros pares : " + contadorNumerosPares);
                System.out.println("Soma dos numeros pares : " + somaNumerosPares);
            }else{
                contadorNumerosImpares++;
                somaNumerosImpares+=numero;
                System.out.println("Quantidade de numeros ímpares : " + contadorNumerosImpares);
                System.out.println("Soma dos numeros ímpares : " + somaNumerosImpares);
            }

            System.out.println("Deseja digitar mais algum numero?");
            resposta = entrada.next().charAt(0);

        }while (resposta == 's');

        double mediaPares = somaNumerosPares/contadorNumerosPares;
        double mediaImpares = somaNumerosImpares/contadorNumerosImpares;

        System.out.println("Media pares - "+ mediaPares);
        System.out.println("Média Impares - "+ mediaImpares);
        System.out.println("Saí do laço");

    }
}
