package com.product.dto;

import com.product.dto.base.BaseDto;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class ProductDto extends BaseDto {

  private String name;

  private String category;

  private String company;

  private String country;

  private Long count;
}
