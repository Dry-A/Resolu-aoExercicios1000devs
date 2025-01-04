package dataEHora;

import java.time.LocalTime;
import java.time.format.DateTimeParseException;
import java.time.format.DateTimeFormatter;

public class Hora {

        public static void main(String[] args) {
            String horaString = "14h30m"; // Exemplo de string no formato "HH:mm"

            try {
                LocalTime hora = LocalTime.parse(horaString);
                System.out.println("Hora: " + hora);
            } catch (DateTimeParseException e) {
                System.out.println("Erro ao fazer o parsing da hora: " + e.getMessage());
            }

            //ou quando a hora estiver no formato am/pm
            // Exemplo de string no formato "hh:mm a". O a representa o formato am/pm

            String horaString2 = "02:30 PM";

            // Definir o formato do padrão AM/PM
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("hh:mm a");

            try {
                // Fazer o parsing da string para LocalTime
                LocalTime hora = LocalTime.parse(horaString2, formatter);
                System.out.println("Hora: " + hora);
            } catch (DateTimeParseException e) {
                System.out.println("Erro ao fazer o parsing da hora: " + e.getMessage());
            }
        }
}
