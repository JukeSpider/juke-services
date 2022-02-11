package com.customer.controller;

import com.customer.dto.CustomerDto;
import java.util.List;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient("customer")
public interface CustomerControllerApi {

  @GetMapping("/customer/id{id}")
  ResponseEntity<CustomerDto> findById(@PathVariable Long id);

  @GetMapping("/customer/all")
  ResponseEntity<List<CustomerDto>> findAll();

  @PostMapping("/customer")
  ResponseEntity<CustomerDto> save(@RequestBody CustomerDto entity);

  @PutMapping("/customer/id{id}")
  void delete(@PathVariable Long id);
}
