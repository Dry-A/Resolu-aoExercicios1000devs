package estruturasRepeticao;

import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        String continuar = "s";


        while (continuar == "s") {

            System.out.println("Você deseja continuar dentro do while? Responda 's ou n'");
            continuar = teclado.nextLine().toLowerCase();

            if (continuar.equals("s")) {
                System.out.println("Oba");
                continuar = "s";
            } else {

                System.out.println("Voce saiu do laço");
                continuar = "n";

            }

            System.out.println("Venho pra ca depois de responder sim   ");
        }
    }

}
