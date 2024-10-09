package br.univille.microservproreitoriadeensino.solicitacao_professores.entity;

public class Atribuicoes {
    private String experiencia;
    private String graduacao;

    public Atribuicoes(String experiencia, String graduacao) {
        this.experiencia = experiencia;
        this.graduacao = graduacao;
    }

    public String getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(String experiencia) {
        this.experiencia = experiencia;
    }

    public String getGraduacao() {
        return graduacao;
    }

    public void setGraduacao(String graduacao) {
        this.graduacao = graduacao;
    }
    
}