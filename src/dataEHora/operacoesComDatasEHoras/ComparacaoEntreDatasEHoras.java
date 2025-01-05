package dataEHora.operacoesComDatasEHoras;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class ComparacaoEntreDatasEHoras {

    public static void main(String[] args) {
        LocalDate data1 = LocalDate.now();
        LocalDate data2 = LocalDate.of(2023, 12, 11);

        LocalDateTime dataHora1 = LocalDateTime.now();
        LocalDateTime dataHora2 = LocalDateTime.of(2023, 12, 11, 15, 30);

        // Verificando se data1 é antes de data2
        if (data1.isBefore(data2)) {
            System.out.println("data1 é antes de data2");
        }

        // Verificando se data1 é depois de data2
        if (data1.isAfter(data2)) {
            System.out.println("data1 é depois de data2");
        }

        // Verificando se as datas são iguais
        if (data1.isEqual(data2)) {
            System.out.println("data1 é igual a data2");
        }

        // Verificando se dataHora1 é antes de dataHora2
        if (dataHora1.isBefore(dataHora2)) {
            System.out.println("dataHora1 é antes de dataHora2");
        }

        // Verificando se dataHora1 é depois de dataHora2
        if (dataHora1.isAfter(dataHora2)) {
            System.out.println("dataHora1 é depois de dataHora2");
        }

        // Verificando se as data e hora são iguais
        if (dataHora1.isEqual(dataHora2)) {
            System.out.println("dataHora1 é igual a dataHora2");
        }
    }
}
