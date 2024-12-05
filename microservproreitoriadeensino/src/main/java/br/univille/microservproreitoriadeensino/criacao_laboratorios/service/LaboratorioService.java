package br.univille.microservproreitoriadeensino.criacao_laboratorios.service;

import java.util.List;
import br.univille.microservproreitoriadeensino.criacao_laboratorios.entity.Laboratorio;

public interface LaboratorioService {

    List<Laboratorio> getAll();
    Laboratorio save(Laboratorio laboratorio);
    Laboratorio update(String id, Laboratorio laboratorio);
    Laboratorio delete(String id);
}