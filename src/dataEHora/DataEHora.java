package dataEHora;

import java.time.LocalDateTime;
import java.time.format.DateTimeParseException;
import java.time.format.DateTimeFormatter;

public class DataEHora {

        public static void main(String[] args) {
            // Exemplo de string no formato padrão do java "yyyy-MM-dd'T'HH:mm:ss"
            String dataHoraString = "2024-12-11T14:30:00";

            try {
                LocalDateTime dataHora = LocalDateTime.parse(dataHoraString);
                System.out.println("Data e Hora: " + dataHora);
            } catch (DateTimeParseException e) {
                System.out.println("Erro ao fazer o parsing da data e hora: " + e.getMessage());
            }

            // Exemplo de string no formato customizado "yyyy-MM-dd hh:mm a"
            String dataHoraString2 = "2024-12-11 02:30 PM";

            //String dataHoraString = "2024-12-11 02:30";

            // Definir o formato de data e hora com AM/PM
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd hh:mm a");

            // Formato de 24 horas
            //DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd hh:mm");

            try {
                // Fazer o parsing da string para LocalDateTime
                LocalDateTime dataHora = LocalDateTime.parse(dataHoraString2, formatter);
                System.out.println("Data e Hora: " + dataHora);
                
            } catch (DateTimeParseException e) {
                System.out.println("Erro ao fazer o parsing da data e hora: " + e.getMessage());
            }
        }
}
