package com.order.mapper;

import com.order.dto.OrderDto;
import com.order.dto.PositionDto;
import com.order.dto.entity.OrderEntity;
import com.order.dto.entity.PositionEntity;
import java.util.List;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ICustomerMapper extends IBaseMapper<OrderEntity, OrderDto> {

  @Override
  OrderDto mapToDto(OrderEntity entity);

  @Override
  OrderEntity mapToEntity(OrderDto dto);

  @Override
  List<OrderDto> mapToDtoList(List<OrderEntity> entityList);

  @Override
  List<OrderEntity> mapToEntityList(List<OrderDto> dtoList);

  PositionDto mapToPositionDto(PositionEntity entity);

  PositionEntity mapToPositionEntity(PositionDto dto);
}