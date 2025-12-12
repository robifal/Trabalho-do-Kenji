package com.ifal.si.fiscalizacao.services;

import com.ifal.si.fiscalizacao.models.Veiculo;
import com.ifal.si.fiscalizacao.repositories.VeiculoRepository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class VeiculoService {

    private final VeiculoRepository repo;

    public VeiculoService(VeiculoRepository repo) { this.repo = repo; }

    public List<Veiculo> listarTodos() { return repo.findAll(); }

    public Optional<Veiculo> buscarPorId(Long id) { return repo.findById(id); }

    public Veiculo criar(Veiculo v) { return repo.save(v); }

    public Veiculo atualizar(Long id, Veiculo v) {
        Veiculo atual = repo.findById(id)
                .orElseThrow(() -> new RuntimeException("Veículo não encontrado"));

        atual.setPlaca(v.getPlaca());
        atual.setMarca(v.getMarca());
        atual.setSituacao(v.getSituacao());
        atual.setQuantidadeMultas(v.getQuantidadeMultas());
        atual.setPermissionario(v.getPermissionario());

        return repo.save(atual);
    }

    public void deletar(Long id) { repo.deleteById(id); }
}
