package com.order.dto;

import com.order.dto.base.LongIdDto;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class PositionDto extends LongIdDto {

  private String item;

  private Long count;
}
