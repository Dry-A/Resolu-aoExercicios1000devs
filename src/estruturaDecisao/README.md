Lista Exercícios Estrutura de Decisão


Exercício 01: Faça um programa para a leitura de duas notas parciais de um aluno. O programa deve calcular a média alcançada por aluno e apresentar:



A mensagem "Aprovado", se a média alcançada for maior ou igual a sete;

A mensagem "Reprovado", se a média for menor do que sete;

A mensagem "Aprovado com Distinção", se a média for igual a dez.



Exercício 02: Um posto está vendendo combustíveis com a seguinte tabela de descontos:

Álcool:

- até 20 litros, desconto de 3% por litro

- acima de 20 litros, desconto de 5% por litro

Gasolina:

- até 20 litros, desconto de 4% por litro

- acima de 20 litros, desconto de 6% por litro


Escreva um algoritmo que leia o número de litros vendidos, o tipo de combustível como um número inteiro (codificado da seguinte forma: 1 - álcool, 2 - gasolina), calcule e imprima o valor a ser pago pelo cliente sabendo-se que o preço do litro da gasolina é R$ 5,50 e o preço do litro do álcool é R$ 3,90.


Exercício 03: Uma loja de venda de frutas está vendendo frutas com a seguinte tabela de preços:

- Até 5 Kg: Morango R$ 2,50 por Kg e Maçã R$ 1,80 por Kg

- Acima de 5 Kg: Morango R$ 2,20 por Kg e Maçã R$ 1,50 por Kg



Se o cliente comprar mais de 8 Kg em frutas ou o valor total da compra ultrapassar R$ 25,00, receberá ainda um desconto de 10% sobre este total. Escreva um algoritmo para ler a quantidade (em Kg) de morangos e a quantidade (em Kg) de maças adquiridas e escreva o valor a ser pago pelo cliente.



Exercício 04: Um empresa resolveu dar um aumento de salário aos seus colaboradores e lhe contraram para desenvolver o programa que calcularáos reajustes. Faça um programa que recebe o salário de um colaborador e faça o reajuste segundo o seguinte critério, baseado no salário atual:



- salários até R$ 280,00 (incluindo) : aumento de 20%

- salários entre R$ 280,00 e R$ 700,00: aumento de 15%

- salários entre R$ 700,00 e R$ 1500,00: aumento de 10%

- salários de R$ 1500,00 em diante: aumento de 5%



Após o aumento ser realizado, informe na tela:



- o salário antes do reajuste;

- o percentual de aumento aplicado;

- o valor do aumento;

- o novo salário, após o aumento.



Exercício 05: Faça um programa para o cálculo de uma folha de pagamento, sabendo que os descontos são do Imposto de Renda, que depende dosalário bruto (conforme tabela abaixo) e 3% para o Sindicato e que o FGTS corresponde a 11% do Salário Bruto, mas não é descontado (é a empresa que deposita). O Salário Líquidocorresponde ao Salário Bruto menos os descontos. O programa deverá pedir ao usuário o valor da sua hora e a quantidade de horas trabalhadas no mês.



Desconto do IR:

Salário Bruto até 900 (inclusive) - isento

Salário Bruto até 1500 (inclusive) - desconto de 5%

Salário Bruto até 2500 (inclusive) - desconto de 10%

Salário Bruto acima de 2500 - desconto de 20%



Imprima na tela as informações, dispostas conforme o exemplo abaixo.



Exemplo:

QTDE de Horas Trabalhadas: 5

Valor da hora trabalhada R$: 220.00

Salário Bruto: (5 * 220)        : R$ 1100,00

(-) IR (5%)                              : R$   55,00

(-) INSS ( 10%)                      : R$  110,00

FGTS (11%)                           : R$  121,00

Total de descontos               : R$  165,00

Salário Liquido                      : R$  935,00



Exercício 06: Faça um Programa que leia um número e exiba o dia correspondente da semana, conforme esta regra: (1 - Domingo, 2 - Segunda, 3 - Terça, 4 - Quarta, 5 - Quinta, 6 -Sexta e 7 - Sábado). Se o usuário digitar outro valor deve aparecer valor inválido.



Exercício 07: Faça um programa que lê as duas notas parciais obtidas por um aluno numa disciplina ao longo de um semestre, e calcule a suamédia apresentando na tela qual o conceito obtido. A atribuição de conceitos obedece à tabela abaixo:



Média de Aproveitamento

Intervalo dos Valores      Conceito

Entre 9 e 10                      A

Entre 7.5 e 9                     B

Entre 6 e 7.5                     C

Entre 4 e 6                        D

Entre 0 e 4                        E



Exercício 08: Faça um Programa que peça os 3 lados de um triângulo. O programa deverá informar se os valores podem ser um triângulo. Caso seja um triângulo indique o tipo do triângulo: equilátero, isósceles ou escaleno. Dicas:



- Para saber se é um triângulo: Cada lado individual deve ser menor que a soma dos outros dois lados que restaram. Você deve validar se cada ladosatisfaça este creitério.

- Triângulo Equilátero: três lados iguais;

- Triângulo Isósceles: quaisquer dois lados iguais;

- Triângulo Escaleno: três lados diferentes;



Exercício 09: Faça um programa que faça 5 perguntas para uma pessoa sobre um crime. As perguntas são:



"Telefonou para a vítima?"

"Esteve no local do crime?"

"Mora perto da vítima?"

"Devia para a vítima?"

"Já trabalhou com a vítima?"



O usuário deve responder em cada pergunta: 1 para sim ou 0 para não. O programa deve no final emitir uma classificação sobre a participação da pessoa no crime. Se a pessoa responder sim em 2 questões ela deve ser classificada como "Suspeita", entre 3 e 4 como "Cúmplice" e 5 como "Assassino". Caso contrário, ele será classificado como "Inocente".



Exercício 10: Leia um valor e apresente uma frase que diga se o número é: par ou ímpar e positivo ou negativo. Caso o valor seja 0, mostre a mensagem: Onúmero digitado é neutro.



Exemplo 01:

Digite o número: 5

O número 5 é impar e positivo.



Exemplo 02:

Digite o número: -6

O número -6 é par e negativo.



Exemplo 03:

Digite o número: 0

O número digitado é neutro.



Exercício 11: Faça um Programa para um caixa eletrônico. O programa deverá perguntar ao usuário a valor do saque e depois informar quantas notas de cadavalor serão fornecidas. As notas disponíveis serão as de 1, 5, 10, 50 e 100 reais. O valor mínimo é de 10 reais e o máximo de 600 reais. O programa não deve se preocupar com aquantidade de notas existentes na máquina.



Exemplo 1: Para sacar a quantia de 256 reais, o programa fornece duas notas de 100, uma nota de 50, uma nota de 5 e uma nota de 1;

Exemplo 2: Para sacar a quantia de 399 reais, o programa fornece três notas de 100, uma nota de 50, quatro notas de 10, uma nota de 5 e quatro notas de 1.



Exercício 12: Faça um Programa que leia um número inteiro menor que 1000 e imprima a quantidade de centenas, dezenas e unidades do mesmo. Observando os termos no plural a colocação do "e", da vírgula entre outros. Exemplo:



326 = 3 centenas, 2 dezenas e 6 unidades

12 = 1 dezena e 2 unidades



Testar com: 326, 300, 100, 320, 310, 305, 301, 101, 311, 111, 25, 20, 10, 21, 11, 1, 7 e 16



Exercício 13: Faça um Programa que solicite um dia, um mês e um ano e determine se estes números forma uma data válida. Não utilize nenhuma biblioteca adicional do Java para isto.Faça apenas utilizando estrutruas de decisão. Pesquise como identificar se um ano é um número bisexto.



Exemplo 01:

Digite o dia: 29

Digite o mês: 02

Digite o ano: 2016

A data 29/02/2016 é válida



Exemplo 02:

Digite o dia: 29

Digite o mês: 02

Digite o ano: 2017

A data 29/02/2017 é inválida



Exemplo 03:

Digite o dia: 31

Digite o mês: 04

Digite o ano: 2017

A data 31/04/2017 é inválida



Exemplo 04:

Digite o dia: 30

Digite o mês: 04

Digite o ano: 2017

A data 30/04/2017 é válida



Exercício 14:  Faça um Programa que leia três números e mostre o maior e o menor deles.

