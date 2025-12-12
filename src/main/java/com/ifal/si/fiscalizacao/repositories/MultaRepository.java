package com.ifal.si.fiscalizacao.repositories;

import com.ifal.si.fiscalizacao.models.Multa;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface MultaRepository extends JpaRepository<Multa, Long> {
    List<Multa> findByVeiculoPlaca(String placa);
    List<Multa> findByOperacaoId(Long operacaoId);
}
