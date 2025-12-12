package com.ifal.si.fiscalizacao.services;

import com.ifal.si.fiscalizacao.models.Multa;
import com.ifal.si.fiscalizacao.repositories.MultaRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MultaService {

    private final MultaRepository repo;

    public MultaService(MultaRepository repo) { this.repo = repo; }

    public List<Multa> listarTodos() { return repo.findAll(); }

    public Optional<Multa> buscarPorId(Long id) { return repo.findById(id); }

    public Multa criar(Multa m) { return repo.save(m); }

    public Multa atualizar(Long id, Multa m) {
        Multa atual = repo.findById(id)
                .orElseThrow(() -> new RuntimeException("Multa não encontrada"));

        atual.setInfracao(m.getInfracao());
        atual.setTipoMulta(m.getTipoMulta());
        atual.setObservacao(m.getObservacao());
        atual.setPontos(m.getPontos());
        atual.setDataVencimento(m.getDataVencimento());
        atual.setValorMulta(m.getValorMulta());
        atual.setDataAtualizacao(m.getDataAtualizacao());
        atual.setMotoristasReceberam(m.getMotoristasReceberam());
        atual.setVeiculo(m.getVeiculo());
        atual.setOperacao(m.getOperacao());

        return repo.save(atual);
    }

    public void deletar(Long id) { repo.deleteById(id); }
}
