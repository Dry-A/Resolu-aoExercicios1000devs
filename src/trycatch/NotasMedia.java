package trycatch;

import java.util.Scanner;

public class NotasMedia {

    public static void main(String[] args) {
    Scanner leia = new Scanner(System.in);

    float contador= 0f;
    int qtdade = 1; //porque estou usando o do while

        System.out.println("Quantas provas foram aplicadas? ");
        int qtdadeNotas = leia.nextInt();

        do {
            System.out.println("Digite a nota: ");
            contador += leia.nextFloat();

            qtdade++;

        }while (qtdade<=qtdadeNotas);

        System.out.println("A média das notas é: "+ contador/qtdadeNotas);

        leia.close();
    }

}
