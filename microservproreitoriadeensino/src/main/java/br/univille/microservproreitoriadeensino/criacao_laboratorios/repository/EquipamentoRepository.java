package br.univille.microservproreitoriadeensino.criacao_laboratorios.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import br.univille.microservproreitoriadeensino.criacao_laboratorios.entity.Equipamento;

@Repository
public interface EquipamentoRepository 
    extends CrudRepository<Equipamento, String> {
}