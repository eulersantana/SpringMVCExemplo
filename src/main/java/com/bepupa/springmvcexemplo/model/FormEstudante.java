package com.bepupa.springmvcexemplo.model;

public class FormEstudante {
    private String salaNome;
    private String nomeEstudante;
    private Integer notaEstudante;

    public FormEstudante(){}
    public FormEstudante(String salaNome, String nomeEstudante, Integer notaEstudante) {
        this.salaNome = salaNome;
        this.nomeEstudante = nomeEstudante;
        this.notaEstudante = notaEstudante;
    }

    public String getSalaNome() {
        return salaNome;
    }

    public void setSalaNome(String salaNome) {
        this.salaNome = salaNome;
    }

    public String getNomeEstudante() {
        return nomeEstudante;
    }

    public void setNomeEstudante(String nomeEstudante) {
        this.nomeEstudante = nomeEstudante;
    }

    public Integer getNotaEstudante() {
        return notaEstudante;
    }

    public void setNotaEstudante(Integer notaEstudante) {
        this.notaEstudante = notaEstudante;
    }
}
