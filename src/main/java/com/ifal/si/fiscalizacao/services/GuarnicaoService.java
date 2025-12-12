package com.ifal.si.fiscalizacao.services;

import com.ifal.si.fiscalizacao.models.Guarnicao;
import com.ifal.si.fiscalizacao.repositories.GuarnicaoRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class GuarnicaoService {

    private final GuarnicaoRepository repo;

    public GuarnicaoService(GuarnicaoRepository repo) { this.repo = repo; }

    public List<Guarnicao> listarTodos() { return repo.findAll(); }

    public Optional<Guarnicao> buscarPorId(Long id) { return repo.findById(id); }

    public Guarnicao criar(Guarnicao g) { return repo.save(g); }

    public Guarnicao atualizar(Long id, Guarnicao g) {
        Guarnicao atual = repo.findById(id)
                .orElseThrow(() -> new RuntimeException("Guarnição não encontrada"));

        atual.setNome(g.getNome());
        atual.setResponsavel(g.getResponsavel());
        atual.setFiscais(g.getFiscais());
        atual.setCarrosMotos(g.getCarrosMotos());

        return repo.save(atual);
    }

    public void deletar(Long id) { repo.deleteById(id); }
}
