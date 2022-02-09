package com.product.controller;

import com.product.dto.ProductDto;
import com.product.service.ProductService;
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
@RequestMapping("/product")
public class ProductController {

  private final ProductService service;

  @GetMapping("/id{id}")
  public ResponseEntity<ProductDto> getById(@PathVariable Long id) {
    return ResponseEntity.status(HttpStatus.OK).body(service.findById(id));
  }

  @GetMapping("/all")
  public ResponseEntity<List<ProductDto>> findAll() {
    return ResponseEntity.status(HttpStatus.OK).body(service.findAll());
  }

  @PostMapping
  public ResponseEntity<ProductDto> save(@RequestBody ProductDto entity) {
    return ResponseEntity.status(HttpStatus.CREATED).body(service.save(entity));
  }

  @PutMapping("/id{id}")
  public void delete(@PathVariable Long id) {
    service.delete(id);
  }

}
