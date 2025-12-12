package com.ifal.si.fiscalizacao.services;

import com.ifal.si.fiscalizacao.models.Chefe;
import com.ifal.si.fiscalizacao.repositories.ChefeRepository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class ChefeService {

    private final ChefeRepository repo;

    public ChefeService(ChefeRepository repo) {
        this.repo = repo;
    }

    public List<Chefe> listarTodos() { return repo.findAll(); }

    public Optional<Chefe> buscarPorId(Long id) { return repo.findById(id); }

    public Chefe criar(Chefe c) { return repo.save(c); }

    public Chefe atualizar(Long id, Chefe c) {
        Chefe atual = repo.findById(id)
                .orElseThrow(() -> new RuntimeException("Chefe não encontrado"));

        atual.setLogin(c.getLogin());
        atual.setSenha(c.getSenha());
        atual.setNome(c.getNome());
        atual.setMatricula(c.getMatricula());
        atual.setCpf(c.getCpf());
        atual.setCnh(c.getCnh());
        atual.setDataAdmissao(c.getDataAdmissao());
        atual.setNivelGestao(c.getNivelGestao());

        return repo.save(atual);
    }

    public void deletar(Long id) { repo.deleteById(id); }
}
