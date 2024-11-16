package estruturasRepeticao;

import java.util.Scanner;

public class Exercicio9 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int numero;
        String resposta = "s";

        do {
            System.out.println("Digite um numero: ");
            numero = entrada.nextInt();

            entrada.nextLine();
            
            if(numero>=0 && numero<=25 ){
                System.out.println("estou no grupo 1 de numeros");
            } else if (numero>25 && numero<=50) {
                System.out.println("estou no grupo 2 de numeros");
            } else if (numero>50 && numero<=75) {
                System.out.println("estou no grupo 3 de numeros");
            } else if (numero>75 && numero<=100) {
                System.out.println("estou no grupo 4 de numeros");

            }

        }while(numero>=0);

        System.out.println("Obrigada, saí do laço");

    }
}
