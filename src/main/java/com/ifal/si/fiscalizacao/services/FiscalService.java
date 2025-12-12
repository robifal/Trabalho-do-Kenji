package com.ifal.si.fiscalizacao.services;

import com.ifal.si.fiscalizacao.models.Fiscal;
import com.ifal.si.fiscalizacao.repositories.FiscalRepository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class FiscalService {

    private final FiscalRepository repo;

    public FiscalService(FiscalRepository repo) {
        this.repo = repo;
    }

    public List<Fiscal> listarTodos() { return repo.findAll(); }

    public Optional<Fiscal> buscarPorId(Long id) { return repo.findById(id); }

    public Fiscal criar(Fiscal f) { return repo.save(f); }

    public Fiscal atualizar(Long id, Fiscal f) {
        Fiscal atual = repo.findById(id)
                .orElseThrow(() -> new RuntimeException("Fiscal não encontrado"));

        atual.setLogin(f.getLogin());
        atual.setSenha(f.getSenha());
        atual.setNome(f.getNome());
        atual.setMatricula(f.getMatricula());
        atual.setCpf(f.getCpf());
        atual.setCnh(f.getCnh());
        atual.setDataAdmissao(f.getDataAdmissao());

        return repo.save(atual);
    }

    public void deletar(Long id) { repo.deleteById(id); }
}
