package com.validator.controller;

import com.validator.dto.ValidatorDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient("validator")
public interface IValidatorControllerApi {

  @GetMapping("/validator/customer/id{id}")
  ValidatorDto isValidate(@PathVariable Long id);
}
