package br.univille.microservproreitoriadeensino.solicitacao_professores.entity;

import org.springframework.data.annotation.Id;
import com.azure.spring.data.cosmos.core.mapping.Container;
import com.azure.spring.data.cosmos.core.mapping.GeneratedValue;
import com.azure.spring.data.cosmos.core.mapping.PartitionKey;

@Container(containerName = "atribuicoes", autoCreateContainer = true)
public class Atribuicoes {
    @Id
    @PartitionKey
    @GeneratedValue
    private String idAtribuicao;
    private String experiencia;
    private String graduacao;

    public Atribuicoes(String idAtribuicao, String experiencia, String graduacao) {
        this.idAtribuicao = idAtribuicao;
        this.experiencia = experiencia;
        this.graduacao = graduacao;
    }

    public String getIdAtribuicao() {
        return idAtribuicao;
    }

    public void setIdAtribuicao(String idAtribuicao) {
        this.idAtribuicao = idAtribuicao;
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