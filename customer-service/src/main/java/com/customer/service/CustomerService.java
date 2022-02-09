package com.customer.service;

import com.customer.dto.CustomerDto;
import com.customer.entity.CustomerEntity;
import com.customer.mapper.ICustomerMapper;
import com.customer.repository.ICustomerRepository;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class CustomerService implements ICustomerService {

  private final ICustomerRepository repository;
  private final ICustomerMapper mapper;

  @Override
  public CustomerDto findById(Long id) {
    CustomerEntity entity = repository.findById(id).orElseThrow(IllegalArgumentException::new);
    return mapper.mapToDto(entity);
  }

  @Override
  public List<CustomerDto> findAll() {
    List<CustomerEntity> entityList = repository.findAll();
    return mapper.mapToDtoList(entityList);
  }

  @Override
  public CustomerDto save(CustomerDto app) {
    CustomerEntity entity = mapper.mapToEntity(app);
    repository.save(entity);
    return app;
  }

  @Override
  public void delete(Long id) {
    repository.deleteById(id);
  }
}
