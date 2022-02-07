package com.application.entity;

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
@Table(name = "application")
public class AppEntity extends LongIdEntity {

  @Column(name = "person_name")
  private String person;

  @Column(name = "app_target")
  private String target;
}
