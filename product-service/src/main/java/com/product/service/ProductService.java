package com.product.service;

import com.product.dto.ProductDto;
import com.product.entity.ProductEntity;
import com.product.mapper.IProductMapper;
import com.product.repository.IProductRepository;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class ProductService implements IProductService {

  private final IProductMapper mapper;
  private final IProductRepository repository;


  @Override
  public ProductDto findById(Long id) {
    ProductEntity entity = repository.findById(id).orElseThrow(IllegalArgumentException::new);
    return mapper.mapToDto(entity);
  }

  @Override
  public List<ProductDto> findAll() {
    List<ProductEntity> entityList = repository.findAll();
    return mapper.mapToDtoList(entityList);
  }

  @Override
  public ProductDto save(ProductDto app) {
    ProductEntity entity = mapper.mapToEntity(app);
    repository.save(entity);
    return app;
  }

  @Override
  public void delete(Long id) {
    repository.deleteById(id);
  }
}
