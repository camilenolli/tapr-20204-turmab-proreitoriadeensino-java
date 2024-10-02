package br.univille.microservproreitoriadeensino.criacao_cursos.entity;

public class Disciplina {
    private int idDisciplina;
    private int cargaHoraria;
    private String disciplina;
    private int frequencia;

    public Disciplina(int idDisciplina, int cargaHoraria, String disciplina, int frequencia) {
        this.idDisciplina = idDisciplina;
        this.cargaHoraria = cargaHoraria;
        this.disciplina = disciplina;
        this.frequencia = frequencia;
    }

    public int getIdDisciplina() {
        return idDisciplina;
    }

    public void setIdDisciplina(int idDisciplina) {
        this.idDisciplina = idDisciplina;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    public int getFrequencia() {
        return frequencia;
    }

    public void setFrequencia(int frequencia) {
        this.frequencia = frequencia;
    }
    
}
