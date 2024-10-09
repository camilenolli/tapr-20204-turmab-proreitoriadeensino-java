package br.univille.microservproreitoriadeensino.criacao_cursos.entity;

import java.util.UUID;

public class Curso {
    private UUID idCurso;
    private String nomeCurso;
    private String periodo;
    private Disciplina disciplina;

    public Curso(UUID idCurso, String nomeCurso, String periodo, Disciplina disciplina) {
        this.idCurso = idCurso;
        this.nomeCurso = nomeCurso;
        this.periodo = periodo;
        this.disciplina = disciplina;
    }

    public UUID getIdCurso() {
        return idCurso;
    }

    public void setIdCurso(UUID idCurso) {
        this.idCurso = idCurso;
    }

    public String getNomeCurso() {
        return nomeCurso;
    }

    public void setNomeCurso(String nomeCurso) {
        this.nomeCurso = nomeCurso;
    }

    public String getPeriodo() {
        return periodo;
    }

    public void setPeriodo(String periodo) {
        this.periodo = periodo;
    }

    public Disciplina getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(Disciplina disciplina) {
        this.disciplina = disciplina;
    }
    
}