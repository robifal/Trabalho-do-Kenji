package com.ifal.si.fiscalizacao.services;

import com.ifal.si.fiscalizacao.models.Funcionario;
import com.ifal.si.fiscalizacao.repositories.FuncionarioRepository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class FuncionarioService {

    private final FuncionarioRepository repo;

    public FuncionarioService(FuncionarioRepository repo) {
        this.repo = repo;
    }

    public List<Funcionario> listarTodos() { return repo.findAll(); }

    public Optional<Funcionario> buscarPorId(Long id) { return repo.findById(id); }

    public Funcionario criar(Funcionario f) { return repo.save(f); }

    public Funcionario atualizar(Long id, Funcionario f) {
        Funcionario atual = repo.findById(id)
                .orElseThrow(() -> new RuntimeException("Funcionário não encontrado"));

        atual.setLogin(f.getLogin());
        atual.setSenha(f.getSenha());
        atual.setNome(f.getNome());
        atual.setMatricula(f.getMatricula());
        atual.setCpf(f.getCpf());
        atual.setCnh(f.getCnh());
        atual.setDataAdmissao(f.getDataAdmissao());
        atual.setSetor(f.getSetor());

        return repo.save(atual);
    }

    public void deletar(Long id) { repo.deleteById(id); }
}
