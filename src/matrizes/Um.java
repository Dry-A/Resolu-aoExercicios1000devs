package matrizes;

import java.util.Scanner;

//criar um vetor de nome e uma matriz de notas paraa cada nome
public class Um {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int quantidadeAlunos = 100;

        String nomes[][];
        nomes = new String[quantidadeAlunos][2];
        //ou desse jeito
        Double notas[][] = new Double[quantidadeAlunos][4];

        nomes[0][0] = "Audrey";
        nomes[1][0] = "Caio";
        nomes[2][0] = "Washington";
        nomes[3][0] = "Tania";

        nomes[0][1] = "Dry";
        nomes[1][1] = "Cacá";
        nomes[2][1] = "Ton";
        nomes[3][1] = "Tan";

        System.out.println("-- -- -- -- -- -- -- -- --");
        for(int i =0; i<4; i++){
            System.out.print(nomes[i][0]);
            System.out.println(" - apelido:  "+ nomes[i][1]);
        }

    }
}
