package Refatorando;

//Encontrar o dobro de um número caso ele seja positivo
//e o seu triplo caso seja negativo, imprimindo o resultado.
import java.util.Scanner;
import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) throws Exception {
        Scanner teclado;

        int valor=0, resultado = 0;

        teclado = new Scanner(System.in);

        try {
            System.out.print("Digite um valor qualquer: ");
            valor = teclado.nextInt();

        }catch(Exception e) {}

        // negativo
        if (valor < 0) {
            resultado = valor * 3;
            // positivo
        } else if (valor > 0) {
            resultado = valor * 2;
        }

        if (resultado != 0) {
            System.out.println("Resultado: " + resultado);
        }

    }
}
