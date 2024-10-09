package br.univille.microservproreitoriadeensino.solicitacao_professores.entity;

import java.util.UUID;

public class Solicitacao {
    private UUID idSolicitacao;
    private Atribuicoes atribuicoes;

    public Solicitacao(UUID idSolicitacao, Atribuicoes atribuicoes) {
        this.idSolicitacao = idSolicitacao;
        this.atribuicoes = atribuicoes;
    }

    public UUID getIdSolicitacao() {
        return idSolicitacao;
    }

    public void setIdSolicitacao(UUID idSolicitacao) {
        this.idSolicitacao = idSolicitacao;
    }

    public Atribuicoes getAtribuicoes() {
        return atribuicoes;
    }

    public void setAtribuicoes(Atribuicoes atribuicoes) {
        this.atribuicoes = atribuicoes;
    }
}