package br.univille.microservproreitoriadeensino.criacao_laboratorios.controller;

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

import br.univille.microservproreitoriadeensino.criacao_laboratorios.entity.Equipamento;
import br.univille.microservproreitoriadeensino.criacao_laboratorios.service.EquipamentoService;
import java.util.List;

@RestController
@RequestMapping("/api/v1/equipamentos")
public class EquipamentoAPIController {

    @Autowired
    private EquipamentoService service;

    @GetMapping
    public ResponseEntity<List<Equipamento>> get() {
        var listaEquipamentos = service.getAll();
        return new ResponseEntity<>(listaEquipamentos, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Equipamento> post(@RequestBody Equipamento equipamento) {
        if (equipamento == null) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
        var equipamentoSalvo = service.save(equipamento);
        return new ResponseEntity<>(equipamentoSalvo, HttpStatus.OK);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Equipamento> put(@PathVariable("id") String id, @RequestBody Equipamento equipamento) {
        if (equipamento == null || id == null || id.isBlank()) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
        var equipamentoAtualizado = service.update(id, equipamento);
        if (equipamentoAtualizado == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(equipamentoAtualizado, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Equipamento> delete(@PathVariable("id") String id) {
        if (id == null || id.isBlank()) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
        var equipamento = service.delete(id);
        if (equipamento != null) {
            return new ResponseEntity<>(equipamento, HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
}