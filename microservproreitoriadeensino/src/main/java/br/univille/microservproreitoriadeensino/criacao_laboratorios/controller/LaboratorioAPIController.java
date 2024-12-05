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

import br.univille.microservproreitoriadeensino.criacao_laboratorios.entity.Laboratorio;
import br.univille.microservproreitoriadeensino.criacao_laboratorios.service.LaboratorioService;
import java.util.List;

@RestController
@RequestMapping("/api/v1/laboratorios")
public class LaboratorioAPIController {

    @Autowired
    private LaboratorioService service;

    @GetMapping
    public ResponseEntity<List<Laboratorio>> get() {
        var listaLaboratorios = service.getAll();
        return new ResponseEntity<>(listaLaboratorios, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Laboratorio> post(@RequestBody Laboratorio laboratorio) {
        if (laboratorio == null) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
        var laboratorioSalvo = service.save(laboratorio);
        return new ResponseEntity<>(laboratorioSalvo, HttpStatus.OK);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Laboratorio> put(@PathVariable("id") String id, @RequestBody Laboratorio laboratorio) {
        if (laboratorio == null || id == null || id.isBlank()) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
        var laboratorioAtualizado = service.update(id, laboratorio);
        if (laboratorioAtualizado == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(laboratorioAtualizado, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Laboratorio> delete(@PathVariable("id") String id) {
        if (id == null || id.isBlank()) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
        var laboratorio = service.delete(id);
        if (laboratorio != null) {
            return new ResponseEntity<>(laboratorio, HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
}