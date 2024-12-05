package br.univille.microservproreitoriadeensino.criacao_laboratorios.service.impl;

import java.util.List;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.univille.microservproreitoriadeensino.criacao_laboratorios.entity.Laboratorio;
import br.univille.microservproreitoriadeensino.criacao_laboratorios.repository.LaboratorioRepository;
import br.univille.microservproreitoriadeensino.criacao_laboratorios.service.LaboratorioService;

@Service
public class LaboratorioServiceImpl implements LaboratorioService {

    @Autowired
    private LaboratorioRepository repository;

    @Override
    public List<Laboratorio> getAll() {
        var retorno = repository.findAll();
        List<Laboratorio> listaLaboratorios = new ArrayList<>();
        retorno.forEach(listaLaboratorios::add);

        return listaLaboratorios;
    }

    @Override
    public Laboratorio save(Laboratorio laboratorio) {
        return repository.save(laboratorio);
    }

    @Override
    public Laboratorio update(String id, Laboratorio laboratorio) {
        var buscaLaboratorioAntigo = repository.findById(id);
        if (buscaLaboratorioAntigo.isPresent()) {
            var laboratorioAntigo = buscaLaboratorioAntigo.get();
            laboratorioAntigo.setNumeroLaboratorio(laboratorio.getNumeroLaboratorio()); // Substitua "setNome" pelo método correto
            repository.save(laboratorioAntigo);
            return laboratorioAntigo;
        }
        return null;
    }

    @Override
    public Laboratorio delete(String id) {
        var buscaLaboratorioAntigo = repository.findById(id);
        if (buscaLaboratorioAntigo.isPresent()) {
            var laboratorioAntigo = buscaLaboratorioAntigo.get();
            repository.delete(laboratorioAntigo);
            return laboratorioAntigo;
        }
        return null;
    }
}