package dataEHora;
import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.time.format.DateTimeFormatter;


public class Data {

        public static void main(String[] args) {
            String dataString = "2024-12-11"; // String no formato yyyy-MM-dd

            try {
                LocalDate localDate = LocalDate.parse(dataString);

                System.out.println(localDate); // Exemplo: 2024-12-11
            } catch (DateTimeParseException e) {
                System.out.println("Erro ao converter a string para data: " + e.getMessage());
            }


            // ou quando a data não está no formato americano yyyy-mm-dd é necessário utilizar a classe DateTimeFormatter.

            // String no formato dd/MM/yyyy
            String dataString2 = "11/12/2024";

            try {
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
                LocalDate localDate = LocalDate.parse(dataString2, formatter);
                System.out.println(localDate); // Exemplo: 2024-12-11
            } catch (DateTimeParseException e) {
                System.out.println("Erro ao converter a string para data: " + e.getMessage());
            }
        }

}
