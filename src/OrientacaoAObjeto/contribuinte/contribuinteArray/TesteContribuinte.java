package OrientacaoAObjeto.contribuinte.contribuinteArray;

import OrientacaoAObjeto.contribuinte.Contribuinte;

import java.util.Scanner;

public class TesteContribuinte {

    static Scanner entrada = new Scanner(System.in);

    //o programa começa por aqui, antes do main
    public static Contribuinte lerContribuinte() {

        System.out.println("Digite o nome do contribuinte: ");
        String nome = entrada.nextLine();

        System.out.println("Digite o numero de dependentes do contribuinte: ");
        int dependentes = entrada.nextInt();

        System.out.println("Digite o salario do contribuinte: ");
        float salario = entrada.nextFloat();

        entrada.nextLine();  // Limpa o buffer

        return new Contribuinte(nome, dependentes, salario);

    }

    public static void exibirContribuinte(Contribuinte[] contribuintes, int contador) {

        System.out.println("Nome\tDependentes\tSalário");

        for (int i = 0; i < contador; i++) {
            System.out.println(contribuintes[i].nome + "\t" + contribuintes[i].dependentes + "\t\tR$ " + contribuintes[i].salario);
        }
    }

    public static boolean continuarCadastro() {

        System.out.println("Deseja digitar dados do próximo contribuinte? (s/n): ");
        char resposta = entrada.nextLine().toLowerCase().charAt(0);

        return resposta == 's';
    }

    public static void main(String[] args) {
        //instanciando uma variavel do tipo Contribuinte)array) chamada contribuintes
        Contribuinte[] contribuintes = new Contribuinte[400];
        int contador = 0;


        for (int i = 0; i < contribuintes.length; i++) {

            contribuintes[i] = lerContribuinte();
            contador++;

            exibirContribuinte(contribuintes, contador);  // Exibe a lista de contribuintes

            if (!continuarCadastro()) {  // Verifica se o usuário quer continuar
                break;
            }
        }

        entrada.close();
        System.out.println("Saindo do programa.");
    }

}

