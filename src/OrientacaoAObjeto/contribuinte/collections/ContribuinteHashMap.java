package OrientacaoAObjeto.contribuinte.collections;

import OrientacaoAObjeto.contribuinte.Contribuinte;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ContribuinteHashMap {

    static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {

        Map<String, Contribuinte> contribuintes = new HashMap<>();

        while(true){

            Contribuinte contribuinteBananinha = lerContribuinte();
            contribuintes.put(contribuinteBananinha.nome, contribuinteBananinha);

            exibirContribuinte(contribuintes);

            if (!continuarCadastro()) {
                break;
            }

        }

        entrada.close();
        System.out.println("Saindo do programa!");


    }

    public static Contribuinte lerContribuinte() {

        System.out.println("Digite o nome do Contribuinte: ");
        String nome = entrada.nextLine();

        System.out.println("Digite o numero de dependentes do Contribuinte: ");
        int dependentes = entrada.nextInt();

        System.out.println("Digite o salario do Contribuinte: ");
        float salario = entrada.nextFloat();

        entrada.nextLine();

        return new Contribuinte(nome, dependentes, salario);
    }

    public static void exibirContribuinte(Map<String, Contribuinte> contribuintes) {

        System.out.println("Nome\tDependentes\tSalario");

        for (Map.Entry<String, Contribuinte> entry : contribuintes.entrySet()){

            Contribuinte contribuinte = entry.getValue();
            System.out.println(contribuinte.nome + "\t" + contribuinte.dependentes + "\t\tR$ " + contribuinte.salario);

        }

    }

    public static boolean continuarCadastro(){
        System.out.println("Deseja continuar o cadastro? (s/n): ");
        char resposta = entrada.nextLine().toLowerCase().charAt(0);

        return resposta == 's';
    }

}
