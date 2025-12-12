package com.ifal.si.fiscalizacao.repositories;

import com.ifal.si.fiscalizacao.models.Administrativo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdministrativoRepository extends JpaRepository<Administrativo, Long> {}