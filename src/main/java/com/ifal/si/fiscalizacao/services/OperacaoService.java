package com.ifal.si.fiscalizacao.services;

import com.ifal.si.fiscalizacao.models.Operacao;
import com.ifal.si.fiscalizacao.repositories.OperacaoRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OperacaoService {

    private final OperacaoRepository repo;

    public OperacaoService(OperacaoRepository repo) { this.repo = repo; }

    public List<Operacao> listarTodos() { return repo.findAll(); }

    public Optional<Operacao> buscarPorId(Long id) { return repo.findById(id); }

    public Operacao criar(Operacao o) { return repo.save(o); }

    public Operacao atualizar(Long id, Operacao o) {
        Operacao atual = repo.findById(id)
                .orElseThrow(() -> new RuntimeException("Operação não encontrada"));

        atual.setNome(o.getNome());
        atual.setDataASerExecutada(o.getDataASerExecutada());
        atual.setFinalidade(o.getFinalidade());
        atual.setGuarnicao(o.getGuarnicao());
        atual.setResponsavel(o.getResponsavel());

        return repo.save(atual);
    }

    public void deletar(Long id) { repo.deleteById(id); }
}
