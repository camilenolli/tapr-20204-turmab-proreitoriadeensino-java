package br.univille.microservproreitoriadeensino.criacao_laboratorios.entity;

public class Equipamento {
    private int idEquipamento;
    private String nomeEquipamento;

    public Equipamento(int idEquipamento, String nomeEquipamento) {
        this.idEquipamento = idEquipamento;
        this.nomeEquipamento = nomeEquipamento;
    }

    public int getIdEquipamento() {
        return idEquipamento;
    }

    public void setIdEquipamento(int idEquipamento) {
        this.idEquipamento = idEquipamento;
    }

    public String getNomeEquipamento() {
        return nomeEquipamento;
    }

    public void setNomeEquipamento(String nomeEquipamento) {
        this.nomeEquipamento = nomeEquipamento;
    }
    
}
