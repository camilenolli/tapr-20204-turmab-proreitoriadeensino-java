package br.univille.microservproreitoriadeensino.solicitacao_professores.service;

import java.util.List;
import br.univille.microservproreitoriadeensino.solicitacao_professores.entity.Solicitacao;

public interface SolicitacaoService {

    List<Solicitacao> getAll();
    Solicitacao save(Solicitacao solicitacao);
    Solicitacao update(String id, Solicitacao solicitacao);
    Solicitacao delete(String id);
}