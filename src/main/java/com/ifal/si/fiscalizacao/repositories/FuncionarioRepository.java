package com.ifal.si.fiscalizacao.repositories;

import com.ifal.si.fiscalizacao.models.Funcionario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FuncionarioRepository extends JpaRepository<Funcionario, Long> {}
