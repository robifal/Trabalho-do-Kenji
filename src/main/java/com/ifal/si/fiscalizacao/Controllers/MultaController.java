package com.ifal.si.fiscalizacao.Controllers;

import com.ifal.si.fiscalizacao.models.Multa;
import com.ifal.si.fiscalizacao.services.MultaService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/multas")
public class MultaController {

    private final MultaService service;

    public MultaController(MultaService service) {
        this.service = service;
    }

    @GetMapping
    public List<Multa> listar() { return service.listarTodos(); }

    @GetMapping("/{id}")
    public ResponseEntity<Multa> buscar(@PathVariable Long id) {
        return service.buscarPorId(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public Multa criar(@RequestBody Multa m) { return service.criar(m); }

    @PutMapping("/{id}")
    public Multa atualizar(@PathVariable Long id, @RequestBody Multa m) {
        return service.atualizar(id, m);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) { service.deletar(id); }
}
