package estruturaDecisao;

/*
Exercício 02: Um posto está vendendo combustíveis com a seguinte tabela de descontos:

Álcool:

- até 20 litros, desconto de 3% por litro

- acima de 20 litros, desconto de 5% por litro

Gasolina:

- até 20 litros, desconto de 4% por litro

- acima de 20 litros, desconto de 6% por litro

Escreva um algoritmo que leia o número de litros vendidos, o tipo de combustível como
 um número inteiro (codificado da seguinte forma: 1 - álcool, 2 - gasolina), calcule
 e imprima o valor a ser pago pelo cliente sabendo-se que o
 preço do litro da gasolina é R$ 5,50 e o preço do litro do álcool é R$ 3,90.

*/

import java.util.Scanner;
import minhasFuncoes.leitura;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        int tipoCombustivel;
        float valorLitroGasolina = 5.50F, valorLitroAlcool = 3.90F, totalLitrosVendidos, valorTotal;

        tipoCombustivel = leitura.lerInteiro(leia,"Digite o tipo de combustível");
        totalLitrosVendidos = leia.nextFloat();

        if(tipoCombustivel == 1){
            valorTotal = valorLitroGasolina * totalLitrosVendidos;
            System.out.println("Gasolina. Total a pagar R$ "+ valorTotal);

        } else if (tipoCombustivel == 2) {
            valorTotal = valorLitroAlcool * totalLitrosVendidos;
            System.out.println("Alcool. Total a pagar R$ "+ valorTotal);

        }else {
            System.out.println("Tipo Combustivel Inválido");
        }

    }
}
