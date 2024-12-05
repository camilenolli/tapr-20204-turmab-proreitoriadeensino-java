package br.univille.microservproreitoriadeensino.solicitacao_professores.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import br.univille.microservproreitoriadeensino.solicitacao_professores.entity.Solicitacao;

@Repository
public interface SolicitacaoRepository 
    extends CrudRepository<Solicitacao, String> {
}