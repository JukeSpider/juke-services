package com.validator.mapper;

import com.validator.dto.ValidatorDto;
import com.validator.entity.ValidatorEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface IValidatorMapper extends IBaseMapper<ValidatorEntity, ValidatorDto> {

}