package com.ifal.si.fiscalizacao.controllers;

import com.ifal.si.fiscalizacao.models.Chefe;
import com.ifal.si.fiscalizacao.services.ChefeService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/chefes")
public class ChefeController {

    private final ChefeService service;

    public ChefeController(ChefeService service) {
        this.service = service;
    }

    @GetMapping
    public List<Chefe> listar() { return service.listarTodos(); }

    @GetMapping("/{id}")
    public ResponseEntity<Chefe> buscar(@PathVariable Long id) {
        return service.buscarPorId(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public Chefe criar(@RequestBody Chefe c) { return service.criar(c); }

    @PutMapping("/{id}")
    public Chefe atualizar(@PathVariable Long id, @RequestBody Chefe c) {
        return service.atualizar(id, c);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) { service.deletar(id); }
}
