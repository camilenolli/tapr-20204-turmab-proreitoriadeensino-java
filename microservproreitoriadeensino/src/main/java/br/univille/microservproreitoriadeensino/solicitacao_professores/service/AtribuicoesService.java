package br.univille.microservproreitoriadeensino.criacao_atribuicoes.service;

import java.util.List;
import br.univille.microservproreitoriadeensino.criacao_atribuicoes.entity.Atribuicoes;

public interface AtribuicoesService {

    List<Atribuicoes> getAll();
    Atribuicoes save(Atribuicoes atribuicoes);
    Atribuicoes update(String id, Atribuicoes atribuicoes);
    Atribuicoes delete(String id);
}
