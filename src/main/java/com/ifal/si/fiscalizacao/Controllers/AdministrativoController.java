package com.ifal.si.fiscalizacao.controllers;

import com.ifal.si.fiscalizacao.models.Administrativo;
import com.ifal.si.fiscalizacao.services.AdministrativoService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/administrativos")
public class AdministrativoController {

    private final AdministrativoService service;

    public AdministrativoController(AdministrativoService service) {
        this.service = service;
    }

    @GetMapping
    public List<Administrativo> listar() { return service.listarTodos(); }

    @GetMapping("/{id}")
    public ResponseEntity<Administrativo> buscar(@PathVariable Long id) {
        return service.buscarPorId(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public Administrativo criar(@RequestBody Administrativo a) { return service.criar(a); }

    @PutMapping("/{id}")
    public Administrativo atualizar(@PathVariable Long id, @RequestBody Administrativo a) {
        return service.atualizar(id, a);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) { service.deletar(id); }
}
