package Refatorando;

import java.util.Scanner;

public class Exercicio1 {

    public static void main(String[] args) {

        Scanner teclado;
        int valor = 0;
        boolean ehImpar;

        teclado = new Scanner(System.in);

        try {
            System.out.print("Digite um valor qualquer: ");
            valor = teclado.nextInt();

        }catch(Exception e){


        }

        ehImpar = (valor % 2 != 0);
        System.out.println(ehImpar ? "O número é impar " : "O número " + valor + " é par.");

        teclado.close();
    }


}

