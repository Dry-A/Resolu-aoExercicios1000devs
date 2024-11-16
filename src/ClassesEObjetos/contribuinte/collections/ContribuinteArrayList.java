package ClassesEObjetos.contribuinte.collections;

import ClassesEObjetos.contribuinte.Contribuinte;

import java.util.ArrayList;
import java.util.Scanner;

public class ContribuinteArrayList {

    static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {

        ArrayList<Contribuinte> contribuintes = new ArrayList<>();

        while (true){

            Contribuinte contribuinteBananinha = criarContribuinte();
            contribuintes.add(contribuinteBananinha);
            exibirContribuinte(contribuintes);

            if (!continuarCadastro()){
                break;
            }
        }

        entrada.close();

    }

    //nao tem parametro
    public static Contribuinte criarContribuinte() {
        System.out.println("Digite o nome do Contribuinte: ");
        String nome = entrada.nextLine();

        System.out.println("Digite o numero de dependentes do contribuinte: ");
        int dependentes = entrada.nextInt();

        System.out.println("Digite o salario do Contribuinte: ");
        float salario = entrada.nextFloat();

        entrada.nextLine();

        return new Contribuinte(nome, dependentes, salario);

    }

    //
    public static void exibirContribuinte(ArrayList<Contribuinte> contribuintes) {

        System.out.println("Nome\tDependentes\tSalario");

        for (Contribuinte contribuinte: contribuintes) {

            System.out.println(contribuinte.nome + "\t"+ contribuinte.dependentes + "\t\tR$ " + contribuinte.salario);
        }
    }

    public static boolean continuarCadastro() {
        System.out.println("Deseja digitar dados do próximo contribuinte? (s/n): ");
        char resposta = entrada.nextLine().charAt(0);

        return resposta == 's';
    }
}
