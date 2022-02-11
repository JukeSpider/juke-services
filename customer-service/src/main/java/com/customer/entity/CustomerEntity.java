package com.customer.entity;

import com.customer.entity.base.BaseEntity;
import com.customer.entity.enums.SexEnumEntity;
import java.time.LocalDate;
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
@Table(name = "customer")
public class CustomerEntity extends BaseEntity {

  @Column(name = "name", nullable = false)
  private String name;

  @Column(name = "birth_date", nullable = false)
  private LocalDate birthDate;

  @Enumerated(EnumType.STRING)
  @Column(name = "sex", nullable = false)
  private SexEnumEntity sex;

  @Column(name = "phone")
  private String phone;

  @Column(name = "email")
  private String email;
}