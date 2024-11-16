package estruturaDecisao;
/*
Exercício 01: Faça um programa para a leitura de duas notas parciais de um aluno. O programa deve calcular a média alcançada por aluno e apresentar:
A mensagem "Aprovado", se a média alcançada for maior ou igual a sete;
A mensagem "Reprovado", se a média for menor do que sete;
A mensagem "Aprovado com Distinção", se a média for igual a dez.
*/

import java.util.Scanner;

public class Exercicio1 {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        int nota1 = leia.nextInt();
        int nota2 = leia.nextInt();

        int media = (nota1 + nota2) /2;

        if (media == 10) {
            System.out.println("Aprovado com distinção");
        } else if (media >= 7) {
            System.out.println("Aprovado");

        } else if (media < 7) {
            System.out.println("Reprovado");

        }else {

        }

    }
}
