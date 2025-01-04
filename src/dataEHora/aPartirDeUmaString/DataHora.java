package dataEHora.aPartirDeUmaString;

import java.time.LocalDateTime;
import java.time.format.DateTimeParseException;

public class DataHora {

    public static void main(String[] args) {
        // Exemplo de string no formato padrão do java "yyyy-MM-dd'T'HH:mm:ss"
        String dataHoraString = "2024-12-11T14:30:00";

        try {
            LocalDateTime dataHora = LocalDateTime.parse(dataHoraString);
            System.out.println("Data e Hora: " + dataHora);
        } catch (DateTimeParseException e) {
            System.out.println("Erro ao fazer o parsing da data e hora: " + e.getMessage());
        }
    }
}
