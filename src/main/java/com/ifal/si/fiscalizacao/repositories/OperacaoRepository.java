package com.ifal.si.fiscalizacao.repositories;

import com.ifal.si.fiscalizacao.models.Operacao;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OperacaoRepository extends JpaRepository<Operacao, Long> {}
