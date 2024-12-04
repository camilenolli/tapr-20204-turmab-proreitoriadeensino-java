package br.univille.microservproreitoriadeensino.criacao_cursos.service;
import java.util.List;

import br.univille.microservproreitoriadeensino.criacao_cursos.entity.Disciplina;

public interface DisciplinaService {

    List<Disciplina> getAll();
    Disciplina save(Disciplina disciplina);
    Disciplina update (String id, Disciplina disciplina);
    Disciplina delete (String id);
    
}
