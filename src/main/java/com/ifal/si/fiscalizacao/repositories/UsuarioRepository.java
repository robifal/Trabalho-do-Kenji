package com.ifal.si.fiscalizacao.repositories;

import com.ifal.si.fiscalizacao.models.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
    Optional<Usuario> findByCpf(String cpf);
    Optional<Usuario> findByLogin(String login);
}