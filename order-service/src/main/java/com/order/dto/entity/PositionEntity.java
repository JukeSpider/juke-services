package com.order.dto.entity;

import com.order.dto.entity.base.LongIdEntity;
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
@Table(name = "items")
public class PositionEntity extends LongIdEntity {

  @Column(name = "item", nullable = false)
  private String item;

  @Column(name = "count", nullable = false)
  private Long count;
}
