package br.univille.microservproreitoriadeensino.solicitacao_professores.entity;

import org.springframework.data.annotation.Id;
import com.azure.spring.data.cosmos.core.mapping.Container;
import com.azure.spring.data.cosmos.core.mapping.GeneratedValue;
import com.azure.spring.data.cosmos.core.mapping.PartitionKey;

@Container(containerName = "solicitacao", autoCreateContainer = true)
public class Solicitacao {
    @Id
    @PartitionKey
    @GeneratedValue
    private String idSolicitacao;
    private Atribuicoes atribuicoes;

    public Solicitacao(String idSolicitacao, Atribuicoes atribuicoes) {
        this.idSolicitacao = idSolicitacao;
        this.atribuicoes = atribuicoes;
    }

    public String getIdSolicitacao() {
        return idSolicitacao;
    }

    public void setIdSolicitacao(String idSolicitacao) {
        this.idSolicitacao = idSolicitacao;
    }

    public Atribuicoes getAtribuicoes() {
        return atribuicoes;
    }

    public void setAtribuicoes(Atribuicoes atribuicoes) {
        this.atribuicoes = atribuicoes;
    }
}