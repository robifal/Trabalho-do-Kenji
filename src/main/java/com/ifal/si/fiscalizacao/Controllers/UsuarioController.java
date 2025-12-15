package com.ifal.si.fiscalizacao.Controllers;

import com.ifal.si.fiscalizacao.models.Usuario;
import com.ifal.si.fiscalizacao.services.UsuarioService;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;


@Controller
@RequestMapping("/usuarios")
public class UsuarioController {

      private final UsuarioService service;

    public UsuarioController(UsuarioService service) {
        this.service = service;
    }

     @GetMapping
    public ModelAndView listarUsuarios() {
        return service.listarTodos();
    }
	
    @GetMapping("/form")
    public ModelAndView novoUsuario(Usuario usuario) {
      return service.formulario(usuario);
    }
    /*private final UsuarioService service;

    public UsuarioController(UsuarioService service) {
        this.service = service;
    }

    
    @RequestMapping("/lista")
    public ModelAndView listar() { return service.listarTodos(); }

    @GetMapping("/{id}")
    public ResponseEntity<Usuario> buscar(@PathVariable Long id) {
        return service.buscarPorId(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping("/novo")
    public Usuario criar(@RequestBody Usuario u) { return service.criar(u); }

    @PutMapping("/{id}")
    public Usuario atualizar(@PathVariable Long id, @RequestBody Usuario u) {
        return service.atualizar(id, u);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) { service.deletar(id); }
    */
}
