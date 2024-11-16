package Refatorando;

import java.util.Scanner;

//Elabore um algoritmo que leia o peso e a altura de um adulto e mostre sua condição de acordo
//com a tabela abaixo.
//IMC em adultos Condição
//Abaixo de 18,5 Abaixo do peso
//Entre 18,5 e 25 Peso normal
//Entre 25 e 30 Acima do peso
//Acima de 30 obeso
public class Exercicio7 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        float peso=0, altura=0;
        float imc;

        try {
            System.out.print("Digite a altura em metros: ");
            altura = teclado.nextFloat();

            System.out.print("Digite o peso em kgs: ");
            peso = teclado.nextFloat();

        } catch (Exception e) {}


        imc = peso / (altura * altura);

        // Acima de 30 obeso
        if (imc >= 30) {
            System.out.printf("Seu IMC %.2f lhe classifica como obeso.", imc);
            // Entre 25 e 30 Acima do peso
        } else if (imc >= 25) {
            System.out.printf("Seu IMC %.2f lhe classifica como acima do peso.", imc);
            // Entre 18,5 e 25 Peso normal
        } else if (imc >= 18.5f) {
            System.out.printf("Seu IMC %.2f lhe classifica como peso normal.", imc);
            // Abaixo de 18,5 Abaixo do peso
        } else {
            System.out.printf("Seu IMC %.2f lhe classifica abaixo do peso normal.", imc);
        }

        teclado.close();
    }

}
