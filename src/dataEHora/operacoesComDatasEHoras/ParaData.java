package dataEHora.operacoesComDatasEHoras;

import java.time.LocalDate;

public class ParaData {

    public static void main(String[] args) {
        // Obtém a data atual, ou você poderia criar a data a partir de uma string ou pelo construtor padrão
        LocalDate dataAtual = LocalDate.now();

        // LocalDate dataAtual = LocalDate.of(2024, 12, 23);

        // Adiciona 10 dias
        dataAtual = dataAtual.plusDays(10);
        System.out.println(dataAtual);

        // Adiciona 3 meses
        dataAtual = dataAtual.plusMonths(3);
        System.out.println(dataAtual);

        // Adiciona 2 anos
        dataAtual = dataAtual.plusYears(2);
        System.out.println(dataAtual);
    }

    //Para a subtração basta utilizar os seguintes métodos:
    //minusDays(dias): Subtrai o número especificado de dias.
    //minusMonths(meses): Subtrai o número especificado de meses.
    //minusYears(anos): Subtrai o número especificado de anos.
}
