package dataEHora.aPartirDeUmaString;

import java.time.LocalDate;
import java.time.format.DateTimeParseException;

public class Data {

        public static void main(String[] args) {
            String dataString = "2024-12-11"; // String no formato yyyy-MM-dd

            try {
                LocalDate localDate = LocalDate.parse(dataString);

                System.out.println(localDate); // Exemplo: 2024-12-11
            } catch (DateTimeParseException e) {
                System.out.println("Erro ao converter a string para data: " + e.getMessage());
            }
        }
}
