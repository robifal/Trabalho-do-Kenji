package com.ifal.si.fiscalizacao.Controllers;

import com.ifal.si.fiscalizacao.models.Escala;
import com.ifal.si.fiscalizacao.services.EscalaService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/escalas")
public class EscalaController {

    private final EscalaService service;

    public EscalaController(EscalaService service) {
        this.service = service;
    }

    @GetMapping
    public List<Escala> listar() { return service.listarTodos(); }

    @GetMapping("/{id}")
    public ResponseEntity<Escala> buscar(@PathVariable Long id) {
        return service.buscarPorId(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public Escala criar(@RequestBody Escala e) { return service.criar(e); }

    @PutMapping("/{id}")
    public Escala atualizar(@PathVariable Long id, @RequestBody Escala e) {
        return service.atualizar(id, e);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) { service.deletar(id); }
}
