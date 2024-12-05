package br.univille.microservproreitoriadeensino.solicitacao_professores.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import br.univille.microservproreitoriadeensino.solicitacao_professores.entity.Atribuicoes;

@Repository
public interface AtribuicoesRepository 
    extends CrudRepository<Atribuicoes, String> {
}