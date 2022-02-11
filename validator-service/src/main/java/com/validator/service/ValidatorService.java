package com.validator.service;

import com.validator.entity.ValidatorEntity;
import com.validator.repository.IValidatorRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class ValidatorService implements IValidatorService {

  private final IValidatorRepository repository;

  @Override
  public boolean isValidate(Long id) {
    boolean valid = id % 2 == 1;
    repository.save(new ValidatorEntity(id, valid));
    return valid;
  }
}
