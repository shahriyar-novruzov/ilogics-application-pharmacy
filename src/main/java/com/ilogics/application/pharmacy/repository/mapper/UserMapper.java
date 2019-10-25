package com.ilogics.application.pharmacy.repository.mapper;

import com.ilogics.application.pharmacy.entity.UserEntity;
import com.ilogics.application.pharmacy.model.UserDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.NullValueCheckStrategy;

import static org.mapstruct.factory.Mappers.getMapper;

@Mapper(nullValueCheckStrategy = NullValueCheckStrategy.ALWAYS)
public abstract class UserMapper {

    public static final UserMapper INSTANCE = getMapper(UserMapper.class);

    @Mappings({
            @Mapping(target = "password", ignore = true)
    })
    public abstract UserDto userEntityToUserDto(UserEntity userEntity);
}
