package br.univille.microservproreitoriadeensino.criacao_atribuicoes.service.impl;

import java.util.List;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.univille.microservproreitoriadeensino.criacao_atribuicoes.entity.Atribuicoes;
import br.univille.microservproreitoriadeensino.criacao_atribuicoes.repository.AtribuicoesRepository;
import br.univille.microservproreitoriadeensino.criacao_atribuicoes.service.AtribuicoesService;

@Service
public class AtribuicoesServiceImpl implements AtribuicoesService {

    @Autowired
    private AtribuicoesRepository repository;

    @Override
    public List<Atribuicoes> getAll() {
        var retorno = repository.findAll();
        List<Atribuicoes> listaAtribuicoes = new ArrayList<>();
        retorno.forEach(listaAtribuicoes::add);

        return listaAtribuicoes;
    }

    @Override
    public Atribuicoes save(Atribuicoes atribuicoes) {
        return repository.save(atribuicoes);
    }

    @Override
    public Atribuicoes update(String id, Atribuicoes atribuicoes) {
        var buscaAtribuicaoAntiga = repository.findById(id);
        if (buscaAtribuicaoAntiga.isPresent()) {
            var atribuicaoAntiga = buscaAtribuicaoAntiga.get();
            atribuicaoAntiga.setDescricao(atribuicoes.getDescricao()); // Substitua pelo método correto
            repository.save(atribuicaoAntiga);
            return atribuicaoAntiga;
        }
        return null;
    }

    @Override
    public Atribuicoes delete(String id) {
        var buscaAtribuicaoAntiga = repository.findById(id);
        if (buscaAtribuicaoAntiga.isPresent()) {
            var atribuicaoAntiga = buscaAtribuicaoAntiga.get();
            repository.delete(atribuicaoAntiga);
            return atribuicaoAntiga;
        }
        return null;
    }
}
