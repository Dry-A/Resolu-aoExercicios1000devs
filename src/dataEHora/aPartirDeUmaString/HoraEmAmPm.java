package dataEHora.aPartirDeUmaString;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class HoraEmAmPm {

    public static void main(String[] args) {
        // Exemplo de string no formato "hh:mm a". O a representa o formato am/pm
        String horaString = "02:30 PM";

        // Definir o formato do padrão AM/PM
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("hh:mm a");

        try {
            // Fazer o parsing da string para LocalTime
            LocalTime hora = LocalTime.parse(horaString, formatter);
            System.out.println("Hora: " + hora);
        } catch (DateTimeParseException e) {
            System.out.println("Erro ao fazer o parsing da hora: " + e.getMessage());
        }
    }
}
