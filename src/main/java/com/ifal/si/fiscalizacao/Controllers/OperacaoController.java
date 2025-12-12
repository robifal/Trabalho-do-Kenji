package com.ifal.si.fiscalizacao.controllers;

import com.ifal.si.fiscalizacao.models.Operacao;
import com.ifal.si.fiscalizacao.services.OperacaoService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/operacoes")
public class OperacaoController {

    private final OperacaoService service;

    public OperacaoController(OperacaoService service) {
        this.service = service;
    }

    @GetMapping
    public List<Operacao> listar() { return service.listarTodos(); }

    @GetMapping("/{id}")
    public ResponseEntity<Operacao> buscar(@PathVariable Long id) {
        return service.buscarPorId(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public Operacao criar(@RequestBody Operacao o) { return service.criar(o); }

    @PutMapping("/{id}")
    public Operacao atualizar(@PathVariable Long id, @RequestBody Operacao o) {
        return service.atualizar(id, o);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) { service.deletar(id); }
}
