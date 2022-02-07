package com.application.dto;

import java.util.Objects;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public abstract class LongIdDto {

  private Long id;

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }

    if (!(o instanceof LongIdDto longIdDto)) {
      return false;
    }

    return id.equals(longIdDto.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id);
  }
}