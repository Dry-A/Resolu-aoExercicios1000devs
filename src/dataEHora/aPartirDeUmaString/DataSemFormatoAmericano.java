package dataEHora.aPartirDeUmaString;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class DataSemFormatoAmericano {

        public static void main(String[] args) {
            // String no formato dd/MM/yyyy
            String dataString = "11/12/2024";

            try {
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
                LocalDate localDate = LocalDate.parse(dataString, formatter);
                System.out.println(localDate); // Exemplo: 2024-12-11
            } catch (DateTimeParseException e) {
                System.out.println("Erro ao converter a string para data: " + e.getMessage());
            }
        }

}
