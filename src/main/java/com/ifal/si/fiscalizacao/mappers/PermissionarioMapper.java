package com.ifal.si.fiscalizacao.mappers;

import com.ifal.si.fiscalizacao.dtos.permissionario.*;
import com.ifal.si.fiscalizacao.models.Permissionario;
import org.mapstruct.*;

@Mapper(componentModel = "spring")
public interface PermissionarioMapper {

    Permissionario toEntity(PermissionarioCreateDTO dto);

    Permissionario toEntity(PermissionarioUpdateDTO dto, @MappingTarget Permissionario entity);

    PermissionarioResponseDTO toResponse(Permissionario entity);
}
