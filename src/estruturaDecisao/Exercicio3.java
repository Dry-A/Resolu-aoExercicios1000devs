package estruturaDecisao;


import java.util.Scanner;
import minhasFuncoes.leitura;

/*
Exercício 03: Uma loja de venda de frutas está vendendo frutas com a seguinte tabela de preços:

- Até 5 Kg: Morango R$ 2,50 por Kg e Maçã R$ 1,80 por Kg

- Acima de 5 Kg: Morango R$ 2,20 por Kg e Maçã R$ 1,50 por Kg

Se o cliente comprar mais de 8 Kg em frutas ou o valor total da compra ultrapassar
R$ 25,00, receberá ainda um desconto de 10% sobre este total.
Escreva um algoritmo para ler a quantidade (em Kg) de morangos e a quantidade (em Kg) de
maças adquiridas e escreva o valor a ser pago pelo cliente.

*/
public class Exercicio3 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        float qtddCompradaMorango, precoMorango, preco1morango = 2.50F, preco2morango= 2.20F;
        float qtddCompradaMaca, precoMaca, preco1maca= 1.80F, preco2maca = 1.50F;

        qtddCompradaMorango = leitura.lerFloat(leia, "qtdd kilos de morango comprada: ");

        if (qtddCompradaMorango <=5 ){
            precoMorango = preco1morango;
        } else  {
            precoMorango = preco2morango;
        }
        float valortotalMorango = precoMorango * qtddCompradaMorango;
        System.out.println("Valor total gasto com Morango: " + valortotalMorango);

        qtddCompradaMaca = leitura.lerFloat(leia, "qtdd kilos de maçãs comprada: ");
        if (qtddCompradaMaca <=5 ){
            precoMaca = preco1maca;
        } else  {
            precoMaca = preco2maca;
        }
        float valortotalMaca = precoMaca * qtddCompradaMaca;
        System.out.println("Valor total gasto com Maça: " + valortotalMaca);

        float qtddTotalFrutas = qtddCompradaMorango  + qtddCompradaMaca;
        System.out.println("Peso total de frutas em kg "+ qtddTotalFrutas+ "kg de frutas" );

        float valorTotalFrutas  = valortotalMaca + valortotalMorango;
        System.out.println("valor total a Pagar R$ "+ valorTotalFrutas);

        if(valorTotalFrutas >=25 || qtddTotalFrutas >=8) {
            float valorComDesconto = valorTotalFrutas * 0.90F;
            System.out.println("Valor com desconto "+valorComDesconto);
        }
    }
}
