package com.validator.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
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
@Table(name = "validator")
public class ValidatorEntity extends LongIdEntity {

  @Column(name = "customer_id", nullable = false)
  private Long customerId;

  @Column(name = "is_validate", nullable = false)
  private boolean isValidate;
}
