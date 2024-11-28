package br.univille.microservproreitoriadeensino.criacao_solicitacoes.service.impl;

import java.util.List;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.univille.microservproreitoriadeensino.criacao_solicitacoes.entity.Solicitacao;
import br.univille.microservproreitoriadeensino.criacao_solicitacoes.repository.SolicitacaoRepository;
import br.univille.microservproreitoriadeensino.criacao_solicitacoes.service.SolicitacaoService;

@Service
public class SolicitacaoServiceImpl implements SolicitacaoService {

    @Autowired
    private SolicitacaoRepository repository;

    @Override
    public List<Solicitacao> getAll() {
        var retorno = repository.findAll();
        List<Solicitacao> listaSolicitacoes = new ArrayList<>();
        retorno.forEach(listaSolicitacoes::add);

        return listaSolicitacoes;
    }

    @Override
    public Solicitacao save(Solicitacao solicitacao) {
        return repository.save(solicitacao);
    }

    @Override
    public Solicitacao update(String id, Solicitacao solicitacao) {
        var buscaSolicitacaoAntiga = repository.findById(id);
        if (buscaSolicitacaoAntiga.isPresent()) {
            var solicitacaoAntiga = buscaSolicitacaoAntiga.get();
            solicitacaoAntiga.setDetalhes(solicitacao.getDetalhes()); // Substitua pelo método correto
            repository.save(solicitacaoAntiga);
            return solicitacaoAntiga;
        }
        return null;
    }

    @Override
    public Solicitacao delete(String id) {
        var buscaSolicitacaoAntiga = repository.findById(id);
        if (buscaSolicitacaoAntiga.isPresent()) {
            var solicitacaoAntiga = buscaSolicitacaoAntiga.get();
            repository.delete(solicitacaoAntiga);
            return solicitacaoAntiga;
        }
        return null;
    }
}
