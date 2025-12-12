package com.ifal.si.fiscalizacao.repositories;

import com.ifal.si.fiscalizacao.models.Permissionario;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

public interface PermissionarioRepository extends JpaRepository<Permissionario, Long> {
    Optional<Permissionario> findByCpfCnpj(String cpfCnpj);
}
