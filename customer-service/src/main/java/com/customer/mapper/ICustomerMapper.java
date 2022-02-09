package com.customer.mapper;

import com.customer.dto.CustomerDto;
import com.customer.entity.CustomerEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ICustomerMapper extends IBaseMapper<CustomerEntity, CustomerDto> {

}