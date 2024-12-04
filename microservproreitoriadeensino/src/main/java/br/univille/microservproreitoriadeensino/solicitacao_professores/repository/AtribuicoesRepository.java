package br.univille.microservproreitoriadeensino.criacao_atribuicoes.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import br.univille.microservproreitoriadeensino.criacao_atribuicoes.entity.Atribuicoes;

@Repository
public interface AtribuicoesRepository 
    extends CrudRepository<Atribuicoes, String> {
}
