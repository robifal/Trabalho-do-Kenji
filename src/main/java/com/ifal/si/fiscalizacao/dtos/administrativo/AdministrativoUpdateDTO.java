package com.ifal.si.fiscalizacao.dtos.administrativo;

import jakarta.validation.constraints.NotBlank;

public class AdministrativoUpdateDTO{

    @NotBlank
    private Long id;
}
