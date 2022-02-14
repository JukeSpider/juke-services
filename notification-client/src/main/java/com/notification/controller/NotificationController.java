package com.notification.controller;

import com.notification.dto.NotificationDto;
import com.notification.service.INotificationService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RequiredArgsConstructor
@RequestMapping("/notification")
@RestController
public class NotificationController implements INotificationControllerApi {

  private final INotificationService service;

  @PostMapping
  public void sendNotification(@RequestBody NotificationDto notification) {
    log.info("New notification registration {}", notification);
    service.send(notification);
  }
}
