package br.univille.microservproreitoriadeensino.criacao_laboratorios.entity;

import org.springframework.data.annotation.Id;
import com.azure.spring.data.cosmos.core.mapping.Container;
import com.azure.spring.data.cosmos.core.mapping.GeneratedValue;
import com.azure.spring.data.cosmos.core.mapping.PartitionKey;

@Container(containerName = "equipamento", autoCreateContainer = true)
public class Equipamento {
    @Id
    @PartitionKey
    @GeneratedValue
    private String idEquipamento;
    private String nomeEquipamento;

    public Equipamento(String idEquipamento, String nomeEquipamento) {
        this.idEquipamento = idEquipamento;
        this.nomeEquipamento = nomeEquipamento;
    }

    public String getIdEquipamento() {
        return idEquipamento;
    }

    public void setIdEquipamento(String idEquipamento) {
        this.idEquipamento = idEquipamento;
    }

    public String getNomeEquipamento() {
        return nomeEquipamento;
    }

    public void setNomeEquipamento(String nomeEquipamento) {
        this.nomeEquipamento = nomeEquipamento;
    }
}