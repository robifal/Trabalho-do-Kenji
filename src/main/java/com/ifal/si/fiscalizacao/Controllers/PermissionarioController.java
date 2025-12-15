package com.ifal.si.fiscalizacao.Controllers;

import com.ifal.si.fiscalizacao.models.Permissionario;
import com.ifal.si.fiscalizacao.services.PermissionarioService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/permissionarios")
public class PermissionarioController {

    private final PermissionarioService service;

    public PermissionarioController(PermissionarioService service) {
        this.service = service;
    }

    @GetMapping
    public List<Permissionario> listar() { return service.listarTodos(); }

    @GetMapping("/{id}")
    public ResponseEntity<Permissionario> buscar(@PathVariable Long id) {
        return service.buscarPorId(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public Permissionario criar(@RequestBody Permissionario p) { return service.criar(p); }

    @PutMapping("/{id}")
    public Permissionario atualizar(@PathVariable Long id, @RequestBody Permissionario p) {
        return service.atualizar(id, p);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) { service.deletar(id); }
}
