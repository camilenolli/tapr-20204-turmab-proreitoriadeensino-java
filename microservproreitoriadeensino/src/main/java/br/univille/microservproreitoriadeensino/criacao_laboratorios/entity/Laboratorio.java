package br.univille.microservproreitoriadeensino.criacao_laboratorios.entity;

import java.util.UUID;

public class Laboratorio {
    private UUID idLaboratorio;
    private int numeroLaboratorio;
    private Equipamento equipamento;

    public Laboratorio(UUID idLaboratorio, int numeroLaboratorio, Equipamento equipamento) {
        this.idLaboratorio = idLaboratorio;
        this.numeroLaboratorio = numeroLaboratorio;
        this.equipamento = equipamento;
    }

    public UUID getIdLaboratorio() {
        return idLaboratorio;
    }

    public void setIdLaboratorio(UUID idLaboratorio) {
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
