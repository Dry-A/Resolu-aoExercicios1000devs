package dataEHora.operacoesComDatasEHoras;

import java.time.LocalTime;

public class ParaHora {

    public static void main(String[] args) {
        LocalTime horaAtual = LocalTime.now();

        // Adiciona 5 horas
        horaAtual = horaAtual.plusHours(5);
        System.out.println("Hora após adicionar 5 horas: " + horaAtual);
    }


    //plusHours(horas): Adiciona o número especificado de horas à hora atual.
    //plusMinutes(minutos): Adiciona o número especificado de minutos à hora atual.
    //plusSeconds(segundos): Adiciona o número especificado de segundos à hora atual.
    //minusHours(horas): Subtrai o número especificado de horas da hora atual.
    //minusMinutes(minutos): Subtrai o número especificado de minutos da hora atual.
    //minusSeconds(segundos): Subtrai o número especificado de segundos da hora atual.
}
