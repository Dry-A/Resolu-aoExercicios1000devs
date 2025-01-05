package orientacaoAObjeto.frutas.collections;

import orientacaoAObjeto.frutas.Fruta;

import java.util.ArrayList;
import java.util.Scanner;

public class FrutasArrayList {

    static Scanner entrada = new Scanner(System.in);

    public static Fruta criarFrutas(){
        System.out.println("Digite o nome do fruta: ");
        String nome = entrada.nextLine();

        System.out.println("Digite o código da fruta: ");
        Integer idFruta = entrada.nextInt();

        System.out.println("Digite a quantidade de frutas disponivel: ");
        int quantidade = entrada.nextInt();

        System.out.println("Digite o preco da fruta: ");
        float precoFruta = entrada.nextFloat();

        entrada.nextLine();

        //retorna um novo objeto do tipo Fruta e os parametros de acordo com o construtor
        return new Fruta(nome, idFruta, quantidade, precoFruta);
    }


    public static void mostrarFrutas(ArrayList<Fruta> frutas){

        System.out.println("Fruta\tIdFruta\tQuantidade\tPreco");

        for(Fruta fruta: frutas){

            System.out.println(fruta.nome + "\t" + fruta.idFruta + "\t" + fruta.quantidade + "      \tR$ " + fruta.preco);
        }
    }

    public static boolean continuarCadastro(){

        System.out.println("Deseja digitar dados da próxima fruta? (s/n): ");
        char resposta = entrada.nextLine().charAt(0);
        //retorno é a resposta é igual a s? se nao for é false
        return resposta == 's';
    }

    public static void main(String[] args) {


        ArrayList<Fruta> estoqueFrutas = new ArrayList<>();

        while(true){

            Fruta frutaCriada = criarFrutas();
            estoqueFrutas.add(frutaCriada);
            mostrarFrutas(estoqueFrutas);

            //se a resposta for falso
            if(!continuarCadastro()){
                break;
            }
        }

        entrada.close();

    }
}
