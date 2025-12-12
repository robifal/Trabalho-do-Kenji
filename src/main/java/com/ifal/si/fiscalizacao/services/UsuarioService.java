package com.ifal.si.fiscalizacao.services;

import com.ifal.si.fiscalizacao.models.Usuario;
import com.ifal.si.fiscalizacao.repositories.UsuarioRepository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class UsuarioService {

    private final UsuarioRepository repo;

    public UsuarioService(UsuarioRepository repo) {
        this.repo = repo;
    }

    public List<Usuario> listarTodos() {
        return repo.findAll();
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
    }
}
