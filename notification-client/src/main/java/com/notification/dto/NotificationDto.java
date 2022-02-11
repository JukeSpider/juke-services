package com.notification.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class NotificationDto extends LongIdDto {

  private Long customerId;

  private String customerEmail;

  private String message;
}
