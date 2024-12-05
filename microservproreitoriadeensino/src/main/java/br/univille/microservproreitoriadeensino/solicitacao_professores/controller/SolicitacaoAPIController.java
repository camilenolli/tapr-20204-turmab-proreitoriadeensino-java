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

import br.univille.microservproreitoriadeensino.solicitacao_professores.entity.Solicitacao;
import br.univille.microservproreitoriadeensino.solicitacao_professores.service.SolicitacaoService;
import java.util.List;

@RestController
@RequestMapping("/api/v1/solicitacoes")
public class SolicitacaoAPIController {

    @Autowired
    private SolicitacaoService service;

    @GetMapping
    public ResponseEntity<List<Solicitacao>> get() {
        var listaSolicitacoes = service.getAll();
        return new ResponseEntity<>(listaSolicitacoes, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Solicitacao> post(@RequestBody Solicitacao solicitacao) {
        if (solicitacao == null) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
        var solicitacaoSalva = service.save(solicitacao);
        return new ResponseEntity<>(solicitacaoSalva, HttpStatus.OK);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Solicitacao> put(@PathVariable("id") String id, @RequestBody Solicitacao solicitacao) {
        if (solicitacao == null || id == null || id.isBlank()) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
        var solicitacaoAtualizada = service.update(id, solicitacao);
        if (solicitacaoAtualizada == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(solicitacaoAtualizada, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Solicitacao> delete(@PathVariable("id") String id) {
        if (id == null || id.isBlank()) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
        var solicitacao = service.delete(id);
        if (solicitacao != null) {
            return new ResponseEntity<>(solicitacao, HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
}