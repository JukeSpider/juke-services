package com.customer.service;

import com.customer.dto.CustomerDto;
import java.util.List;

public interface ICustomerService {

  CustomerDto getById(Long id);

  List<CustomerDto> findAll();

  CustomerDto save(CustomerDto app);

  void delete(Long id);
}
