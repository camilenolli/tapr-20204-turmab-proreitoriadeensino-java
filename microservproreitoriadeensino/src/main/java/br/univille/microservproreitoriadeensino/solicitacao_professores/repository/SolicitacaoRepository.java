package br.univille.microservproreitoriadeensino.criacao_solicitacoes.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import br.univille.microservproreitoriadeensino.criacao_solicitacoes.entity.Solicitacao;

@Repository
public interface SolicitacaoRepository 
    extends CrudRepository<Solicitacao, String> {
}
