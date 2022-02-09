package com.product.mapper;

import com.product.dto.ProductDto;
import com.product.entity.ProductEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface IProductMapper extends IBaseMapper<ProductEntity, ProductDto> {

}