package com.order.dto;

import com.order.dto.base.BaseDto;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class OrderDto extends BaseDto {

  private Long customerId;

  private List<PositionDto> itemList;
}
