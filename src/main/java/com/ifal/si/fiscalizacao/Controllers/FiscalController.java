package com.ifal.si.fiscalizacao.Controllers;

import com.ifal.si.fiscalizacao.models.Fiscal;
import com.ifal.si.fiscalizacao.services.FiscalService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/fiscais")
public class FiscalController {

    private final FiscalService service;

    public FiscalController(FiscalService service) { this.service = service; }

    @GetMapping
    public List<Fiscal> listar() { return service.listarTodos(); }

    @GetMapping("/{id}")
    public ResponseEntity<Fiscal> buscar(@PathVariable Long id) {
        return service.buscarPorId(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public Fiscal criar(@RequestBody Fiscal f) { return service.criar(f); }

    @PutMapping("/{id}")
    public Fiscal atualizar(@PathVariable Long id, @RequestBody Fiscal f) {
        return service.atualizar(id, f);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) { service.deletar(id); }
}
