package br.univille.microservproreitoriadeensino.criacao_laboratorios.entity;

import org.springframework.data.annotation.Id;
import com.azure.spring.data.cosmos.core.mapping.Container;
import com.azure.spring.data.cosmos.core.mapping.GeneratedValue;
import com.azure.spring.data.cosmos.core.mapping.PartitionKey;

@Container(containerName = "laboratorio", autoCreateContainer = true)
public class Laboratorio {
    @Id
    @PartitionKey
    @GeneratedValue
    private String idLaboratorio;
    private int numeroLaboratorio;
    private Equipamento equipamento;

    public Laboratorio(String idLaboratorio, int numeroLaboratorio, Equipamento equipamento) {
        this.idLaboratorio = idLaboratorio;
        this.numeroLaboratorio = numeroLaboratorio;
        this.equipamento = equipamento;
    }

    public String getIdLaboratorio() {
        return idLaboratorio;
    }

    public void setIdLaboratorio(String idLaboratorio) {
        this.idLaboratorio = idLaboratorio;
    }

    public int getNumeroLaboratorio() {
        return numeroLaboratorio;
    }

    public void setNumeroLaboratorio(int numeroLaboratorio) {
        this.numeroLaboratorio = numeroLaboratorio;
    }

    public Equipamento getEquipamento() {
        return equipamento;
    }

    public void setEquipamento(Equipamento equipamento) {
        this.equipamento = equipamento;
    }
}