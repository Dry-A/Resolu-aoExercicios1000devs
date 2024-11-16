package trycatch;

import java.util.Scanner;

public class TryCatchDoWile {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int x;
        boolean ocorreuErro;

        do {
            try {
                System.out.println("Diigite um número: ");
                x = entrada.nextInt();
                ocorreuErro = false;

                System.out.println("o valor digitado é "+ x);
            } catch (Exception e) {
                ocorreuErro = true;
                System.out.println("Valor digitado não é um número. ");
                entrada.nextLine(); //limpeza do buiffer
            }

        }while(ocorreuErro);


    }
}
