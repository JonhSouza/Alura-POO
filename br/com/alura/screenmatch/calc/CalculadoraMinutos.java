package br.com.alura.screenmatch.calc;

import br.com.alura.screenmatch.model.Titulo;

public class CalculadoraMinutos {
    private int tempoTotal;

    public int getTempoTotal() {

        return tempoTotal;
    }

    public void inclui(Titulo titulo){

        tempoTotal += titulo.getDuracaoEmMinutos();

    }


}
