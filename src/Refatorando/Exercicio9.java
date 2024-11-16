package Refatorando;

import java.util.Scanner;

//9-Tendo como dados de entrada a altura e o sexo de uma pessoa, construa um algoritmo que
//calcule seu peso ideal, utilizando as seguintes fórmulas:
// para homens: (72.7 * h) – 58;
// para mulheres: (62.1 * h) – 44.7

public class Exercicio9 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        float altura;
        int sexo;

        System.out.print("Digite a sua altura em mts: ");
        altura = teclado.nextFloat();

        System.out.println("\nDigite 1 para masculino. ");
        System.out.println("Digite 2 para feminino. ");

        System.out.print("\nDigite o seu sexo: ");
        sexo = teclado.nextInt();


        System.out.printf("Seu peso ideal: %.2f kgs%n", (sexo == 1) ? (72.7 * altura) - 58 : (62.1 * altura) - 44.7);

        teclado.close();
    }
}
