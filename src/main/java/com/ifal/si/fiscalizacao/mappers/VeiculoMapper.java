package com.ifal.si.fiscalizacao.mappers;

import com.ifal.si.fiscalizacao.dtos.veiculo.*;
import com.ifal.si.fiscalizacao.models.Veiculo;
import org.mapstruct.*;

@Mapper(componentModel = "spring")
public interface VeiculoMapper {

    @Mapping(source = "permissionarioId", target = "permissionario.id")
    Veiculo toEntity(VeiculoCreateDTO dto);

    Veiculo toEntity(VeiculoUpdateDTO dto, @MappingTarget Veiculo entity);

    @Mapping(source = "permissionario.id", target = "permissionarioId")
    VeiculoResponseDTO toResponse(Veiculo entity);
}
