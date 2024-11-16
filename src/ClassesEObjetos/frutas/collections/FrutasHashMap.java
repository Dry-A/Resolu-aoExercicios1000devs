package ClassesEObjetos.frutas.collections;

import ClassesEObjetos.frutas.Fruta;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FrutasHashMap {

    static Scanner entrada = new Scanner(System.in);

    public static Fruta criarFruta(){

        System.out.println("Digite o nome do fruta: ");
        String nome = entrada.nextLine();

        System.out.println("Digite o código da fruta: ");
        Integer idFruta = entrada.nextInt();

        System.out.println("Digite a quantidade da fruta no estoque: ");
        int quantidade = entrada.nextInt();

        System.out.println("Digite o preco da fruta: ");
        float preco = entrada.nextFloat();

        entrada.nextLine();

        return new Fruta(nome, idFruta, quantidade, preco);
    }

    public static void mostrarEstoque(Map<Integer, Fruta> frutas){

        System.out.println("Fruta\tCodido\tQuantidade\tPreco");

        for(Map.Entry<Integer, Fruta> entry : frutas.entrySet()){

            Fruta frutaCriada = entry.getValue();
            System.out.println(frutaCriada.idFruta+ "\t" + frutaCriada.nome + "\t" + frutaCriada.quantidade + "\t R$ "+ frutaCriada.preco);
        }

    }

    public static boolean continuarCadastro(){
        System.out.println("Deseja continuar o cadastro? (s/n): ");
        char resposta = entrada.nextLine().toLowerCase().charAt(0);

        return resposta == 's';
    }


    public static void main(String[] args) {

        //coloquei a chave Integer pois quero que seja o codigo da fruta
        Map<Integer, Fruta> frutas = new HashMap<>();

        while(true){

            Fruta frutaCriada = criarFruta();
            frutas.put(frutaCriada.idFruta, frutaCriada);
            mostrarEstoque(frutas);

            if(!continuarCadastro()){
                break;
            }
        }

        entrada.close();
        System.out.println("Saindo do programa! Obrigada Deus pr tudo");

    }


}
