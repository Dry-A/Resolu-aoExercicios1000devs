package estruturaDeDados.collections;


import java.util.List;
import java.util.ArrayList;

public class Arraylist0 {

    static void imprimirElemento(List<String> lista) {
        //iterar sobre a lista
        System.out.println("                   ");
        System.out.println("--**--**--**--**--**--**--**--**--**--");

        System.out.println("Iterando sobre os elementos: ");

        for (int i = 0; i < lista.size(); i++) {

            System.out.println("Elemento indice: " + i + " " + lista.get(i));

        }

        System.out.println(" ");

        //ou esse for

        System.out.println("Com foreach:  ");

       //nao precisando do indice dos elemntos, se nao deve-se implementar um contador
        for( String elemento : lista) {

            System.out.println("Elemento: " + elemento);

        }
    }

    //ArrayList é um implementaçao da interface List
    //add - adiciona um novo elemento no fim do arryList
    //get - obtenho um elemento em uma determinada posicao
    //set - adiciono um elemento em uma posicao que ja existe
    //size - retorna o tamanho do array
    //remove - remove um elemento de uma determinada posiçao, por indice ou pelo nome do objeto

    public static void main(String[] args) {

        //definindo vetor de 5 posicoes:
        String[] palavras = new String[5];

        List<String> listaMaterial = new ArrayList<>();

        //adicionar elementos
        listaMaterial.add("Caderno");
        listaMaterial.add("Lápis");
        listaMaterial.add(0,"Borracha");
        imprimirElemento(listaMaterial);

        listaMaterial.add("Caneta");
        listaMaterial.remove(1);
        listaMaterial.add("Grampeador");
        imprimirElemento(listaMaterial);

        System.out.println("Tamanho do Array aqui: " + listaMaterial.size() + " elementos.");

        System.out.println("Adicionando mais itens --> ");
        listaMaterial.add("Fichário");
        listaMaterial.add(3,"Cola branca");
        //empurra o elemento para o próximo indice:
        listaMaterial.add(3,"Cola quente");
        listaMaterial.set(4,"Giz de cera");

        System.out.println("Tamanho do Array aqui: " + listaMaterial.size() + " elementos.");

        imprimirElemento(listaMaterial);

   }
}