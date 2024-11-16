package estruturasRepeticao;

import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int numero;
        int maiorValor = Integer.MIN_VALUE;
        int menorValor = Integer.MAX_VALUE;


        for(int i=1; i<=6; i++){

            System.out.println("Digite um numero: ");
            numero = entrada.nextInt();

            if(numero > maiorValor){
                maiorValor = numero;
            }
            if(numero < menorValor){
                menorValor = numero;
            }

        }
        System.out.println("Menor valor: "+menorValor);
        System.out.println("maior valor: "+maiorValor);

        entrada.close();

    }
    
}
