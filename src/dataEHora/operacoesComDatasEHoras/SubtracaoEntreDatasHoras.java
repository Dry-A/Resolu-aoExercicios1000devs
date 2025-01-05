package dataEHora.operacoesComDatasEHoras;

import java.time.LocalDate;
import java.time.Period;

import java.time.Duration;
import java.time.LocalDateTime;

import java.time.LocalTime;

public class SubtracaoEntreDatasHoras {

    public static void main(String[] args) {
        // Definir duas datas usando LocalDate
        LocalDate data1 = LocalDate.of(2024, 1, 1); // 1º de janeiro de 2024
        LocalDate data2 = LocalDate.of(2024, 12, 11); // 11 de dezembro de 2024

        // Calcular a diferença entre as duas datas
        Period periodo = Period.between(data1, data2);

        // Exibir a diferença em anos, meses e dias
        System.out.println("Diferença: " + periodo.getYears() + " anos, " +
                periodo.getMonths() + " meses e " +
                periodo.getDays() + " dias.");

        //Diferença entre duas datas com horas
        // Definir duas datas/hora usando LocalDateTime
        LocalDateTime data3 = LocalDateTime.of(2024, 12, 10, 10, 30); // 10 de Dezembro de 2024, 10:30
        LocalDateTime data4 = LocalDateTime.of(2024, 12, 11, 15, 45); // 11 de Dezembro de 2024, 15:45

        // Calcular a diferença entre as duas datas
        Duration duration = Duration.between(data3, data4);

        // Obter a diferença em horas
        long horas = duration.toHours();

        // Exibir a diferença
        System.out.println("Diferença em horas: " + horas);





        //Diferença entre duas horas

        // Definir duas horas usando LocalTime
        LocalTime hora1 = LocalTime.of(10, 30); // 10:30
        LocalTime hora2 = LocalTime.of(15, 45); // 15:45

        // Calcular a diferença entre as duas horas
        Duration duration2 = Duration.between(hora1, hora2);

        // Obter a diferença em horas
        long horas2 = duration2.toHours();

        // Obter a diferença em minutos
        long minutos = duration2.toMinutes() % 60;

        // Exibir a diferença
        System.out.println("Diferença em horas 2: " + horas2);
        System.out.println("Diferença em minutos: " + minutos);


    }
}
