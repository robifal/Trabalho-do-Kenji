package com.ifal.si.fiscalizacao.services;

import com.ifal.si.fiscalizacao.models.Escala;
import com.ifal.si.fiscalizacao.repositories.EscalaRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EscalaService {

    private final EscalaRepository repo;

    public EscalaService(EscalaRepository repo) { this.repo = repo; }

    public List<Escala> listarTodos() { return repo.findAll(); }

    public Optional<Escala> buscarPorId(Long id) { return repo.findById(id); }

    public Escala criar(Escala e) { return repo.save(e); }

    public Escala atualizar(Long id, Escala e) {
        Escala atual = repo.findById(id)
                .orElseThrow(() -> new RuntimeException("Escala não encontrada"));

        atual.setDiaDaSemana(e.getDiaDaSemana());
        atual.setInicioServico(e.getInicioServico());
        atual.setFimServico(e.getFimServico());
        atual.setUsuario(e.getUsuario());
        atual.setVeiculo(e.getVeiculo());
        atual.setGuarnicao(e.getGuarnicao());

        return repo.save(atual);
    }

    public void deletar(Long id) { repo.deleteById(id); }
}
