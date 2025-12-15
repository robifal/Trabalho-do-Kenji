package com.ifal.si.fiscalizacao.services;

import com.ifal.si.fiscalizacao.models.Usuario;
import com.ifal.si.fiscalizacao.repositories.UsuarioRepository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import java.util.List;
import java.util.Optional;

@Service
public class UsuarioService {
   private final UsuarioRepository repo;

    public UsuarioService(UsuarioRepository repo) {
        this.repo = repo;
    }

    public ModelAndView listarTodos() {
        ModelAndView retorno = new ModelAndView("usuario/usuario-list.html");
        retorno.addObject("usuarios", repo.findAll());
        return retorno;
    }

    @RequestMapping("/formUsuario")
	public ModelAndView formulario(Usuario a){
		ModelAndView retorno = new ModelAndView("usuario/usuario-form.html");
		retorno.addObject("usuario", a);
		return retorno;
	}

    public Usuario salvar(Usuario u) {
     
        return repo.save(u);
    }

    public void deletar(Long id) {
        repo.deleteById(id);
    }

    public Usuario buscarPorId(Long id) {
        return repo.findById(id)
                .orElseThrow(() -> new RuntimeException("Usuário não encontrado"));
    }
    /*private final UsuarioRepository repo;

    public UsuarioService(UsuarioRepository repo) {
        this.repo = repo;
    }

    public ModelAndView listarTodos() {
        ModelAndView retorno = new ModelAndView("listar_alunos.html");
        Iterable<Usuario> usuarios = repo.findAll();
		retorno.addObject("usuarios", usuarios);
        return retorno;
    }

    public Optional<Usuario> buscarPorId(Long id) {
        return repo.findById(id);
    }

    public Usuario criar(Usuario usuario) {
        return repo.save(usuario);
    }

    public Usuario atualizar(Long id, Usuario u) {
        Usuario atual = repo.findById(id)
                .orElseThrow(() -> new RuntimeException("Usuário não encontrado"));

        atual.setLogin(u.getLogin());
        atual.setSenha(u.getSenha());
        atual.setNome(u.getNome());
        atual.setMatricula(u.getMatricula());
        atual.setCpf(u.getCpf());
        atual.setCnh(u.getCnh());
        atual.setDataAdmissao(u.getDataAdmissao());
        atual.setRole(u.getRole());

        return repo.save(atual);
    }

    public void deletar(Long id) {
        repo.deleteById(id);
    }*/
}
