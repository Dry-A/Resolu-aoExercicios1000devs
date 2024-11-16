package Refatorando;

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int a = 0, b = 0, c = 0;


        try {
            System.out.println("Digite o primeiro valor: ");
            a = entrada.nextInt();

            System.out.println("Digite o segundo valor: ");
            b = entrada.nextInt();

            System.out.println("Digite o terceiro valor: ");
            c = entrada.nextInt();
        } catch (Exception e) {
        }


        String resultado = (a + b < c) ? "A soma de A + B é menor que C" : "A soma de A + B não é menor que C";

        System.out.println(resultado);
    }

}

