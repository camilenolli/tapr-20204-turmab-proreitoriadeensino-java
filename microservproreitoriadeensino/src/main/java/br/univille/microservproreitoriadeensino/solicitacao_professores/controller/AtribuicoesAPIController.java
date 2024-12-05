package br.univille.microservproreitoriadeensino.solicitacao_professores.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.univille.microservproreitoriadeensino.solicitacao_professores.entity.Atribuicoes;
import br.univille.microservproreitoriadeensino.solicitacao_professores.service.AtribuicoesService;
import java.util.List;

@RestController
@RequestMapping("/api/v1/atribuicoes")
public class AtribuicoesAPIController {

    @Autowired
    private AtribuicoesService service;

    @GetMapping
    public ResponseEntity<List<Atribuicoes>> get() {
        var listaAtribuicoes = service.getAll();
        return new ResponseEntity<>(listaAtribuicoes, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Atribuicoes> post(@RequestBody Atribuicoes atribuicoes) {
        if (atribuicoes == null) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
        var atribuicoesSalvas = service.save(atribuicoes);
        return new ResponseEntity<>(atribuicoesSalvas, HttpStatus.OK);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Atribuicoes> put(@PathVariable("id") String id, @RequestBody Atribuicoes atribuicoes) {
        if (atribuicoes == null || id == null || id.isBlank()) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
        var atribuicoesAtualizadas = service.update(id, atribuicoes);
        if (atribuicoesAtualizadas == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(atribuicoesAtualizadas, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Atribuicoes> delete(@PathVariable("id") String id) {
        if (id == null || id.isBlank()) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
        var atribuicoes = service.delete(id);
        if (atribuicoes != null) {
            return new ResponseEntity<>(atribuicoes, HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
}