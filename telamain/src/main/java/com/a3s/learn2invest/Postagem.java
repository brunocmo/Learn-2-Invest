package com.a3s.learn2invest;

public class Postagem {
    private String nome;
    private String investimentoMinimo;
    private String montante;
    private int imagem;
    private String risco;
    private String taxa;
    private String prazo;

    public Postagem() {
    }

    public Postagem(String nome, String investimentoMinimo, String montante, int imagem, String risco, String taxa,String prazo) {
        this.nome = nome;
        this.investimentoMinimo = investimentoMinimo;
        this.montante = montante;
        this.imagem = imagem;
        this.risco = risco;
        this.taxa = taxa;
        this.prazo = prazo;
    }

    public String getPrazo() {
        return prazo;
    }

    public void setPrazo(String prazo) {
        this.prazo = prazo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getInvestimentoMinimo() {
        return investimentoMinimo;
    }

    public void setInvestimentoMinimo(String investimentoMinimo) {
        this.investimentoMinimo = investimentoMinimo;
    }

    public String getMontante() {
        return montante;
    }

    public void setMontante(String montante) {
        this.montante = montante;
    }

    public int getImagem() {
        return imagem;
    }

    public void setImagem(int imagem) {
        this.imagem = imagem;
    }

    public String getRisco() {
        return risco;
    }

    public void setRisco(String risco) {
        this.risco = risco;
    }

    public String getTaxa() {
        return taxa;
    }

    public void setTaxa(String taxa) {
        this.taxa = taxa;
    }
}
