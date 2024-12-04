package br.univille.microservproreitoriadeensino.criacao_cursos.service.impl;

import java.util.List;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.univille.microservproreitoriadeensino.criacao_cursos.entity.Disciplina;
import br.univille.microservproreitoriadeensino.criacao_cursos.repository.DisciplinaRepository;
import br.univille.microservproreitoriadeensino.criacao_cursos.service.DisciplinaService;

@Service
public class DisciplinaServiceImpl 
    implements DisciplinaService{

    @Autowired
    private DisciplinaRepository repository;

    @Override
    public List<Disciplina> getAll() {
        var retorno = repository.findAll();
        List<Disciplina> listaDisciplinas = new ArrayList<Disciplina>();
        retorno.forEach(listaDisciplinas::add);

        return listaDisciplinas;
    }

    @Override
    public Disciplina save(Disciplina disciplina) {
        return repository.save(disciplina);
    }

    @Override
    public Disciplina update(String id, Disciplina disciplina) {
       var buscaDisciplinaAntigo = repository.findById(id);
       if(buscaDisciplinaAntigo.isPresent()){
        var DisciplinaAntigo = buscaDisciplinaAntigo.get();
        DisciplinaAntigo.setDisciplina(disciplina.getDisciplina());
        repository.save(DisciplinaAntigo);
        return DisciplinaAntigo;
       }
       return null;
    }

    @Override
    public Disciplina delete(String id) {
        var buscaDisciplinaAntigo = repository.findById(id);
        if(buscaDisciplinaAntigo.isPresent()){
            var DisciplinaAntigo = buscaDisciplinaAntigo.get();
            repository.delete(DisciplinaAntigo);
            return DisciplinaAntigo;
    }
    return null;
}
}
