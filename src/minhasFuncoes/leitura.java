package minhasFuncoes;

import java.util.Scanner;

public class leitura {

    public static int lerInteiro(Scanner leia, String mensagem) {

        System.out.println(mensagem);
        return leia.nextInt();

    }

    public static float lerFloat(Scanner leia, String mensagem) {
        System.out.println(mensagem);
        return leia.nextFloat();
    }
}
