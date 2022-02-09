package com.product.service;

import com.product.dto.ProductDto;
import java.util.List;

public interface IProductService {

  ProductDto findById(Long id);

  List<ProductDto> findAll();

  ProductDto save(ProductDto app);

  void delete(Long id);

}
