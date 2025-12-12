package com.ifal.si.fiscalizacao.services;

import com.ifal.si.fiscalizacao.models.Administrativo;
import com.ifal.si.fiscalizacao.repositories.AdministrativoRepository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class AdministrativoService {

    private final AdministrativoRepository repo;

    public AdministrativoService(AdministrativoRepository repo) {
        this.repo = repo;
    }

    public List<Administrativo> listarTodos() { return repo.findAll(); }

    public Optional<Administrativo> buscarPorId(Long id) { return repo.findById(id); }

    public Administrativo criar(Administrativo a) { return repo.save(a); }

    public Administrativo atualizar(Long id, Administrativo a) {
        Administrativo atual = repo.findById(id)
                .orElseThrow(() -> new RuntimeException("Administrativo não encontrado"));

        atual.setLogin(a.getLogin());
        atual.setSenha(a.getSenha());
        atual.setNome(a.getNome());
        atual.setMatricula(a.getMatricula());
        atual.setCpf(a.getCpf());
        atual.setCnh(a.getCnh());
        atual.setDataAdmissao(a.getDataAdmissao());

        return repo.save(atual);
    }

    public void deletar(Long id) { repo.deleteById(id); }
}
