package estruturasRepeticao;

//05: Faça um algoritmo utilizando a estrutura "do while" que fique perguntando
// para o usuário se ele deseja
//continuar o laço respondendo s ou n. Laço deve continuar quando o usuário responde s

import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        String resposta;

        do {
            System.out.println("Voce quer continuar no laço? 's ou n'");
            resposta = teclado.nextLine().toLowerCase();
        }while (resposta.equals("s"));

        teclado.close();

        System.out.println("Saí do laço");

    }

}
