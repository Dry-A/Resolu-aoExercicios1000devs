package codigosUteis;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class ComoFazerDataEHora {
    public static void main(String[] args) {

        //criando datas e horas
        LocalDate hoje = LocalDate.now(); //data atual
        LocalTime agora = LocalTime.now(); //hora atual
        LocalDateTime dataHoraAtual = LocalDateTime.now(); // Data e hora atuais

        //Exibindo as dtas e horas
        System.out.println("Data de hoje: " + hoje); //sem formataçao brasileira

        System.out.println("Hora atual: " + agora); // com os nanosegundo SSSSSSS

        //instanciando a classe atraves dessa variavel de insctancia
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        //formatando a data usando o objeto, seguido do ponto e do método format,
        // em seguida a variavel que eu quero formatar, no caso: hoje
        System.out.println("Data formatada 1 "+ formato.format( hoje));

        System.out.println("Data formatada 2 " + hoje.format(formato));

        formato = DateTimeFormatter.ofPattern("HH:mm:ss");
        System.out.println("Hora formato 24h: "+ agora.format(formato));

        formato = DateTimeFormatter.ofPattern("hh:mm:ss a");
        System.out.println("Hora formato am pm: "+ agora.format(formato));

        formato = DateTimeFormatter.ofPattern("dd/MM/yy HH:mm:ss");
        System.out.println("Data/hora formatada 24h: " + dataHoraAtual.format(formato));

        formato = DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm:ss a");
        System.out.println("Data/hora formatada 12h: " + dataHoraAtual.format(formato));

    }
}
