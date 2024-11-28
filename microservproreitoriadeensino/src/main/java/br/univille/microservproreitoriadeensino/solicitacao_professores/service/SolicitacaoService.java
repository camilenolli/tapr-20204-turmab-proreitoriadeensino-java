package br.univille.microservproreitoriadeensino.criacao_solicitacoes.service;

import java.util.List;
import br.univille.microservproreitoriadeensino.criacao_solicitacoes.entity.Solicitacao;

public interface SolicitacaoService {

    List<Solicitacao> getAll();
    Solicitacao save(Solicitacao solicitacao);
    Solicitacao update(String id, Solicitacao solicitacao);
    Solicitacao delete(String id);
}
