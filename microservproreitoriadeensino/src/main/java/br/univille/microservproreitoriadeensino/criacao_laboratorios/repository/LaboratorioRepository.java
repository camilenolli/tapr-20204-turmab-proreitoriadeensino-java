package br.univille.microservproreitoriadeensino.criacao_laboratorios.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import br.univille.microservproreitoriadeensino.criacao_laboratorios.entity.Laboratorio;

@Repository
public interface LaboratorioRepository 
    extends CrudRepository<Laboratorio, String> {
}