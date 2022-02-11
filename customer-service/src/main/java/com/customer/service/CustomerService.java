package com.customer.service;

import com.customer.dto.CustomerDto;
import com.customer.entity.CustomerEntity;
import com.customer.mapper.ICustomerMapper;
import com.customer.repository.ICustomerRepository;
import com.notification.controller.INotificationControllerApi;
import com.notification.dto.NotificationDto;
import com.validator.controller.IValidatorControllerApi;
import com.validator.dto.ValidatorDto;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class CustomerService implements ICustomerService {

  private final ICustomerRepository repository;
  private final ICustomerMapper mapper;

  private final IValidatorControllerApi validatorApi;
  private final INotificationControllerApi notificationApi;

  @Override
  public CustomerDto findById(Long id) {
    CustomerEntity entity = repository
        .findById(id)
        .orElseThrow(() -> new IllegalArgumentException("User with id" + id + " not found!"));
    return mapper.mapToDto(entity);
  }

  @Override
  public List<CustomerDto> findAll() {
    List<CustomerEntity> entityList = repository.findAll();
    return mapper.mapToDtoList(entityList);
  }

  @Override
  public CustomerDto save(CustomerDto dto) {
    CustomerEntity entity = mapper.mapToEntity(dto);
    repository.save(entity);

    ValidatorDto validator = validatorApi.isValidate(entity.getId());

    notificationApi.sendNotification(
        new NotificationDto(
            entity.getId(),
            entity.getEmail(),
            String.format("Hi, %s! Welcome to Juke Services!",entity.getName())));

    if (!validator.isValidate()) {
      throw new IllegalStateException("Is not valid!");
    }

    return dto;
  }

  @Override
  public void delete(Long id) {
    repository.deleteById(id);
  }
}
