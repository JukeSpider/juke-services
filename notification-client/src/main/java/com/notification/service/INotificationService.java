package com.notification.service;

import com.notification.dto.NotificationDto;

public interface INotificationService {

  void send(NotificationDto dto);
}
