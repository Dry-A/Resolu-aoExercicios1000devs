package dataEHora.aPartirDeUmaString;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class DataHoraCustomizado {

    public static void main(String[] args) {
        // Exemplo de string no formato customizado "yyyy-MM-dd hh:mm a"
        String dataHoraString = "2024-12-11 02:30 PM";

        //String dataHoraString = "2024-12-11 02:30";

        // Definir o formato de data e hora com AM/PM
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd hh:mm a");

        // Formato de 24 horas
        //DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd hh:mm");

        try {
            // Fazer o parsing da string para LocalDateTime
            LocalDateTime dataHora = LocalDateTime.parse(dataHoraString, formatter);
            System.out.println("Data e Hora: " + dataHora);
        } catch (DateTimeParseException e) {
            System.out.println("Erro ao fazer o parsing da data e hora: " + e.getMessage());
        }
    }
}
