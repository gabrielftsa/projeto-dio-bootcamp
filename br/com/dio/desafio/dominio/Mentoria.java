package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Mentoria extends Conteudo{

    protected LocalDate dataInicial;
    protected LocalDate dataFinal;

    public LocalDate getDataInicial() {
        return dataInicial = LocalDate.now();
    }
    public LocalDate getDataFinal() {
        return dataInicial = LocalDate.now().plusDays(30);
    }

    @Override
    public String toString() {
        return "Mentoria: " + this.titulo  +
                ", Data inicial = " + this.getDataInicial() +
                ", Data final = " + this.getDataFinal();
    }
}
