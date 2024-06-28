package br.com.alura.screenmatch.model;

import br.com.alura.screenmatch.calc.Classificacao;

public class Serie extends Titulo implements Classificacao {

    private int temporadas;
    private int epPorTemporada;
    private boolean ativa;
    private int minutosPorEp;

    public Serie(String nome, int anoDeLancamento) {
        super(nome, anoDeLancamento);
    }


    public int getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    public int getEpPorTemporada() {
        return epPorTemporada;
    }

    public void setEpPorTemporada(int epPorTemporada) {
        this.epPorTemporada = epPorTemporada;
    }

    public boolean isAtiva() {
        return ativa;
    }

    public void setAtiva(boolean ativa) {
        this.ativa = ativa;
    }

    public int getMinutosPorEp() {
        return minutosPorEp;
    }

    public void setMinutosPorEp(int minutosPorEp) {
        this.minutosPorEp = minutosPorEp;
    }
    @Override
    public int getDuracaoEmMinutos() {
        return minutosPorEp * epPorTemporada * temporadas;
    }

    @Override
    public int getClassificavel() {
        return 0;
    }
}
