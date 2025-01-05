package orientacaoAObjeto.contribuinte.contribuinteSemClasse;

import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        //declarando e inicializando a variavel
        String[] nomes = new String[400];
        int[] numeroDependentes = new int[400];
        float[] salario = new float[400];
        char resposta;


        for (int i = 0; i < 400; i++) {
            System.out.println("Digite o nome do contribuinte: ");
            nomes[i]= teclado.nextLine();
            System.out.println("Digite a quantidade de dependentes do contribuinte: ");
            numeroDependentes[i]= teclado.nextInt();
            System.out.println("Digite o salário do contribuinte: ");
            salario[i]= teclado.nextFloat();
            //limpa o buffer
            teclado.nextLine();

            //mostrando na tela
            System.out.println("Nome:    dependentes:   Salário:");
            for(int posicao = 0; posicao <= i; posicao++) {
                System.out.println(nomes[posicao] + "           " + numeroDependentes[posicao]+ "        R$ "+salario[posicao]);
            }

            System.out.println("Deseja digitar dados do proximo contribuinte? ");
            resposta = teclado.nextLine().toLowerCase().charAt(0);

            if (resposta == 'n') {
                break;
            }
        }

        teclado.close();
        System.out.println("sai do laço");
    }
}
