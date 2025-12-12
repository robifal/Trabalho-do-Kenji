package com.ifal.si.fiscalizacao.services;

import com.ifal.si.fiscalizacao.models.Permissionario;
import com.ifal.si.fiscalizacao.repositories.PermissionarioRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PermissionarioService {

    private final PermissionarioRepository repo;

    public PermissionarioService(PermissionarioRepository repo) {
        this.repo = repo;
    }

    public List<Permissionario> listarTodos() { return repo.findAll(); }

    public Optional<Permissionario> buscarPorId(Long id) { return repo.findById(id); }

    public Permissionario criar(Permissionario p) { return repo.save(p); }

    public Permissionario atualizar(Long id, Permissionario p) {
        Permissionario atual = repo.findById(id)
                .orElseThrow(() -> new RuntimeException("Permissionário não encontrado"));

        atual.setNomeRazaoSocial(p.getNomeRazaoSocial());
        atual.setCpfCnpj(p.getCpfCnpj());
        atual.setCrlvne(p.getCrlvne());
        atual.setQuantidadeMultasPendentes(p.getQuantidadeMultasPendentes());

        return repo.save(atual);
    }

    public void deletar(Long id) { repo.deleteById(id); }
}
