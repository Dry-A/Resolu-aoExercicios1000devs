package dataEHora.aPartirDeUmaString;


import java.time.LocalTime;
import java.time.format.DateTimeParseException;

public class Hora {

        public static void main(String[] args) {
            String horaString = "14h30m"; // Exemplo de string no formato "HH:mm"

            try {
                LocalTime hora = LocalTime.parse(horaString);
                System.out.println("Hora: " + hora);
            } catch (DateTimeParseException e) {
                System.out.println("Erro ao fazer o parsing da hora: " + e.getMessage());
            }
        }
}
