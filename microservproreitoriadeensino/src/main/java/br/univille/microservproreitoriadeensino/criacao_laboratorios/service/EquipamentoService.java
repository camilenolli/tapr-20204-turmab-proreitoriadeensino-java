package br.univille.microservproreitoriadeensino.criacao_laboratorios.service;

import java.util.List;
import br.univille.microservproreitoriadeensino.criacao_laboratorios.entity.Equipamento;

public interface EquipamentoService {

    List<Equipamento> getAll();
    Equipamento save(Equipamento equipamento);
    Equipamento update(String id, Equipamento equipamento);
    Equipamento delete(String id);
}