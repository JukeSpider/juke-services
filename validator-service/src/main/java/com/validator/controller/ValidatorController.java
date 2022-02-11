package com.validator.controller;

import com.validator.dto.ValidatorDto;
import com.validator.service.ValidatorService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RequestMapping("/validator")
@RestController
public class ValidatorController implements IValidatorControllerApi {

  private final ValidatorService service;


  @GetMapping("/customer/id{id}")
  public ValidatorDto isValidate(@PathVariable Long id) {
    boolean isValidatorDto = service.isValidate(id);
    return new ValidatorDto(isValidatorDto);
  }
}
