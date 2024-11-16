package string;
import java.util.Arrays;

//O código abaixo recebe um nome completo de uma pessoa e interage com cada palavra deste nome. Você deve fazer com que o nome e os sobrenomes sejam convertidos para a primeira letra em maiúsculo. Ou seja, se o nome fornecido for:
//rogerio de freitas ribeiro
//, o resultado deverá ser
//Rogério de Freitas Ribeiro
//Note que os conectores do, da e outros não devem ser convertidos para maíusculos.
//do - utilizado para indicar posse ou origem, como em "João do Brasil".
//da - similar ao "do", mas usado com nomes femininos, como em "Maria da Silva".
//de - usado para indicar origem ou pertencimento, como em "Carlos de Souza".
//e - usado para ligar dois nomes, como em "Ana e Costa e Silva".
//dos - forma plural de "do", como em "André dos Santos".
//das - forma plural de "da", como em "Lúcia das Dores".

public class Desafio2510 {
    public static void main(String[] args) {

        String[] conectores = {"de", "do", "da", "dos", "das", "e"};
        String nomecompleto = "heitor de albuquerque helfstein";
        String[] nomeCortado = nomecompleto.split(" ");
        String nomeFormatado = "";


        for(int i = 0; i < nomeCortado.length; i++){

            String palavra = nomeCortado[i];

            if (Arrays.asList(conectores).contains(palavra.toLowerCase())) {
                nomeFormatado += palavra + " ";
            }else{
                String nomeComLetraMaiuscula = nomeCortado[i].substring(0, 1).toUpperCase() + nomeCortado[i].substring(1);
                nomeFormatado +=  nomeComLetraMaiuscula + " ";
            }

            System.out.println(nomeCortado[i]);

        }
        nomeFormatado = nomeFormatado.trim();
        System.out.println("Nome Formatado " + nomeFormatado);


        String listaCPF = "21989989;912982981921;12iu2iui21u;12u2uiu12iu21;12uiu2i109;817282781989;1292988928912;12892189932";
        String[] cpfIndividualizado = listaCPF.split(";");

        for (int i = 0; i < cpfIndividualizado.length; i++){
            System.out.println(cpfIndividualizado[i]);
            String novoCPF = cpfIndividualizado[i].substring(0, cpfIndividualizado[i].length() - 2);

            novoCPF = novoCPF + "-00";

            System.out.println(novoCPF);
        }


    }
}
