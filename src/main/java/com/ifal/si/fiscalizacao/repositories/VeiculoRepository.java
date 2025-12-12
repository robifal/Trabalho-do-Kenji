package com.ifal.si.fiscalizacao.repositories;

import com.ifal.si.fiscalizacao.models.Veiculo;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;
import java.util.List;

public interface VeiculoRepository extends JpaRepository<Veiculo, Long> {
    Optional<Veiculo> findByPlaca(String placa);
    List<Veiculo> findByPermissionarioId(Long permissionarioId);
}
