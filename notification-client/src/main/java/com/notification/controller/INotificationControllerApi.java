package com.notification.controller;

import com.notification.dto.NotificationDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient("notification")
public interface INotificationControllerApi {

  @PostMapping("/notification")
  void sendNotification(@RequestBody NotificationDto notification);
}