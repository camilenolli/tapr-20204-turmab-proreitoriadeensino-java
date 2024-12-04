package br.univille.microservproreitoriadeensino.criacao_cursos.repository;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import br.univille.microservproreitoriadeensino.criacao_cursos.entity.Disciplina;


@Repository
public interface DisciplinaRepository 
    extends CrudRepository<Disciplina,String>{
    
}