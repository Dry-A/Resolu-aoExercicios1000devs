package string;

import java.util.Scanner;

public class QtddVogal {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int qtdeVogais = 0;
        String palavra;
        int contagem =0;
        int tamanhoPalavra;
        char letra;

        System.out.println("Digite uma palavra: ");
        palavra = teclado.nextLine();
        tamanhoPalavra = palavra.length();

        do {
            letra = palavra.charAt(contagem);
            if (letra == 'a'|| letra=='e'|| letra== 'i' || letra == 'o'|| letra == 'u') {
                qtdeVogais++;
            }
            contagem++;


        }while (contagem< tamanhoPalavra);

        System.out.println(qtdeVogais);
    }
}
