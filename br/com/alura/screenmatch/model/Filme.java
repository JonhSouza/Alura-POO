package br.com.alura.screenmatch.model;

import br.com.alura.screenmatch.calc.Classificacao;

public class Filme extends Titulo implements Classificacao {

    private String diretor;

    public Filme(String nome, int anoDeLancamento) {
        super(nome, anoDeLancamento);
    }

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    @Override
    public int getClassificavel() {
        return 0;
    }
}
