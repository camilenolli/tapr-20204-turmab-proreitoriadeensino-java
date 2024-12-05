package br.univille.microservproreitoriadeensino.solicitacao_professores.service;

import java.util.List;
import br.univille.microservproreitoriadeensino.solicitacao_professores.entity.Atribuicoes;

public interface AtribuicoesService {

    List<Atribuicoes> getAll();
    Atribuicoes save(Atribuicoes atribuicoes);
    Atribuicoes update(String id, Atribuicoes atribuicoes);
    Atribuicoes delete(String id);
}