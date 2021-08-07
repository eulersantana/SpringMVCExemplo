package com.bepupa.springmvcexemplo.model;

import java.util.ArrayList;
import java.util.List;

public class Sala {
    private String nome;
    private List<Estudante> estudantes;

    public Sala(String nome){
        this.nome = nome;
        this.estudantes = new ArrayList<>();
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Estudante> getEstudantes() {
        return estudantes;
    }

    public void setEstudantes(List<Estudante> estudantes) {
        this.estudantes = estudantes;
    }
}
