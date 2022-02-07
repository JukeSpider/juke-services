package com.application.mapper;

import com.application.dto.AppDto;
import com.application.entity.AppEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface IAppMapper extends IBaseMapper<AppEntity, AppDto> {

}