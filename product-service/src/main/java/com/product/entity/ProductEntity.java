package com.product.entity;

import com.product.entity.base.BaseEntity;
import com.product.entity.enums.ProductCategoryEnum;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "product")
public class ProductEntity extends BaseEntity {

  @Column(name = "name", nullable = false)
  private String name;

  @Enumerated(EnumType.STRING)
  @Column(name = "category", nullable = false)
  private ProductCategoryEnum category;

  @Column(name = "company", nullable = false)
  private String company;

  @Column(name = "country", nullable = false)
  private String country;

  @Column(name = "count", nullable = false)
  private Long count;
}
