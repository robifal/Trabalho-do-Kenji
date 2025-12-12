package com.ifal.si.fiscalizacao.repositories;

import com.ifal.si.fiscalizacao.models.Fiscal;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FiscalRepository extends JpaRepository<Fiscal, Long> {}