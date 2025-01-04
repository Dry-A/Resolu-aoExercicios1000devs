package dataEHora;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DataEHoraRogerio {
    
        public static void main(String[] args) {
            // Criando datas e horas
            LocalDate hoje = LocalDate.now(); // Data atual
            LocalTime agora = LocalTime.now(); // Hora atual
            LocalDateTime dataHoraAtual = LocalDateTime.now(); // Data e hora atuais

            // Exibindo as datas e horas
            System.out.println("Data de hoje: " + hoje);
            // O resultado será algo do tipo 2024-12-11
            // O formato yyyy-mm-dd, onde yyyy ano com 4 dígitos, mm o mês e dd o dia

            System.out.println("Hora atual: " + agora);
            // O resultado será algo do tipo 15:18:35.990285900
            // O formato HH:mm:ss.SSSSSSSSS, onde: HH representa as horas, mm representa os minutos,
            // ss representa os segundos, SSSSSSSSS representa os nanosegundos.

            System.out.println("Data e hora atuais: " + dataHoraAtual);
            // O resultado será algo do tipo 2024-12-11T15:18:35.990285900

            // Formatando data
            DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            // Apenas à título de informação, no comando acima não foi necessário utilizar o
            // new DateTimeFormatter pois o método ofPattern é um método estático que utiliza
            // o padrão de projeto factory "fábrica". Mas não se preocupe com isso.

            System.out.println("\nData formatada: " + hoje.format(formato));

            formato = DateTimeFormatter.ofPattern("HH:mm:ss");
            System.out.println("Hora formatada 24horas: " + agora.format(formato));

            formato = DateTimeFormatter.ofPattern("hh:mm:ss a");
            System.out.println("Hora formatada 12horas am/pm: " + agora.format(formato));

            formato = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
            System.out.println("Data/Hora formatada: " + dataHoraAtual.format(formato));

            formato = DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm:ss a");
            System.out.println("Data/Hora formatada: " + dataHoraAtual.format(formato));
        }
}
