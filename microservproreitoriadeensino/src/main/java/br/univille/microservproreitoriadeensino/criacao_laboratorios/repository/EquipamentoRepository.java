package br.univille.microservproreitoriadeensino.criacao_equipamentos.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import br.univille.microservproreitoriadeensino.criacao_equipamentos.entity.Equipamento;

@Repository
public interface EquipamentoRepository 
    extends CrudRepository<Equipamento, String> {
}
