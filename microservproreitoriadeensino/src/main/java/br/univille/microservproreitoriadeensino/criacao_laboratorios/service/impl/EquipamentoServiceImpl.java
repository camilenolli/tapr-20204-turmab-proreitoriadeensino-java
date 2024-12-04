package br.univille.microservproreitoriadeensino.criacao_equipamentos.service.impl;

import java.util.List;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.univille.microservproreitoriadeensino.criacao_equipamentos.entity.Equipamento;
import br.univille.microservproreitoriadeensino.criacao_equipamentos.repository.EquipamentoRepository;
import br.univille.microservproreitoriadeensino.criacao_equipamentos.service.EquipamentoService;

@Service
public class EquipamentoServiceImpl implements EquipamentoService {

    @Autowired
    private EquipamentoRepository repository;

    @Override
    public List<Equipamento> getAll() {
        var retorno = repository.findAll();
        List<Equipamento> listaEquipamentos = new ArrayList<>();
        retorno.forEach(listaEquipamentos::add);

        return listaEquipamentos;
    }

    @Override
    public Equipamento save(Equipamento equipamento) {
        return repository.save(equipamento);
    }

    @Override
    public Equipamento update(String id, Equipamento equipamento) {
        var buscaEquipamentoAntigo = repository.findById(id);
        if (buscaEquipamentoAntigo.isPresent()) {
            var equipamentoAntigo = buscaEquipamentoAntigo.get();
            equipamentoAntigo.setNome(equipamento.getNome()); // Substitua "setNome" pelo método correto
            repository.save(equipamentoAntigo);
            return equipamentoAntigo;
        }
        return null;
    }

    @Override
    public Equipamento delete(String id) {
        var buscaEquipamentoAntigo = repository.findById(id);
        if (buscaEquipamentoAntigo.isPresent()) {
            var equipamentoAntigo = buscaEquipamentoAntigo.get();
            repository.delete(equipamentoAntigo);
            return equipamentoAntigo;
        }
        return null;
    }
}
