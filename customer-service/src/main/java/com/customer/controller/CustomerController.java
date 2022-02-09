package com.customer.controller;

import com.customer.dto.CustomerDto;
import com.customer.service.CustomerService;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@RequestMapping("/customer")
public class CustomerController {

  private final CustomerService service;

  @GetMapping("/id{id}")
  public ResponseEntity<CustomerDto> getById(@PathVariable Long id) {
    return ResponseEntity.status(HttpStatus.OK).body(service.getById(id));
  }

  @GetMapping("/all")
  public ResponseEntity<List<CustomerDto>> findAll() {
    return ResponseEntity.status(HttpStatus.OK).body(service.findAll());
  }

  @PostMapping
  public ResponseEntity<CustomerDto> save(@RequestBody CustomerDto entity) {
    return ResponseEntity.status(HttpStatus.CREATED).body(service.save(entity));
  }

  @PutMapping("/id{id}")
  public void delete(@PathVariable Long id) {
    service.delete(id);
  }
}
