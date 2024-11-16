package estruturaDecisao;

/*
Exercício 04:

Um empresa resolveu dar um aumento de salário aos seus colaboradores e lhe contraram para desenvolver o
programa que calcularáos reajustes. Faça um programa que recebe o salário de um colaborador e
faça o reajuste segundo o seguinte critério, baseado no salário atual:

- salários até R$ 280,00 (incluindo) : aumento de 20%

- salários entre R$ 280,00 e R$ 700,00: aumento de 15%

- salários entre R$ 700,00 e R$ 1500,00: aumento de 10%

- salários de R$ 1500,00 em diante: aumento de 5%

Após o aumento ser realizado, informe na tela:

- o salário antes do reajuste;

- o percentual de aumento aplicado;

- o valor do aumento;

- o novo salário, após o aumento.*/

import java.util.Scanner;

public class Exercicio4 {

    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        float salario, reajustePorcentagem=0, reajusteValor=0, salarioReajustado=0;

        System.out.println("Digite o valor do salário atual");
            salario = leia.nextFloat();

            if (salario <= 280){

                reajustePorcentagem = 0.20F;

            } else if (salario > 280 && salario <= 700)   {

               reajustePorcentagem = 0.15F;

            } else if (salario > 700 && salario <=1500) {
                reajustePorcentagem = 0.10F;

            }else {
                 reajustePorcentagem = 0.05F;
            }

    salarioReajustado=salario + (salario * reajustePorcentagem);
    reajusteValor = salarioReajustado - salario;

    imprimirResultados(salario, reajustePorcentagem, salarioReajustado, reajusteValor);

    Exercicio4 minhaInstanciaDoEx = new Exercicio4();

    minhaInstanciaDoEx.imprimirSalario(salario);

}
    public static void imprimirResultados(float salario, float reajustePorcentagem, float salarioReajustado, float reajusteValor) {
        System.out.printf("Salário antes do reajuste: R$ %.2f\n", salario);
        System.out.printf("Porcentagem de reajuste aplicada: %.0f%% \n", reajustePorcentagem * 100);
        System.out.printf("Novo valor do salário: R$ %.2f\n", salarioReajustado);
        System.out.printf("Valor do reajuste: R$ %.2f\n", reajusteValor);
}

    public void imprimirSalario(float salario) {
        System.out.println("        ");
        System.out.println(" Chamando minha funçao que nao é static. \n Nao consigo acessa-la diretamente. \n Precisei criar um objeto \n O salario é "+ salario);
    }

}
