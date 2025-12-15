package com.ifal.si.fiscalizacao.Controllers;

import com.ifal.si.fiscalizacao.models.Guarnicao;
import com.ifal.si.fiscalizacao.services.GuarnicaoService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/guarnicoes")
public class GuarnicaoController {

    private final GuarnicaoService service;

    public GuarnicaoController(GuarnicaoService service) {
        this.service = service;
    }

    @GetMapping
    public List<Guarnicao> listar() { return service.listarTodos(); }

    @GetMapping("/{id}")
    public ResponseEntity<Guarnicao> buscar(@PathVariable Long id) {
        return service.buscarPorId(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public Guarnicao criar(@RequestBody Guarnicao g) { return service.criar(g); }

    @PutMapping("/{id}")
    public Guarnicao atualizar(@PathVariable Long id, @RequestBody Guarnicao g) {
        return service.atualizar(id, g);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) { service.deletar(id); }
}
