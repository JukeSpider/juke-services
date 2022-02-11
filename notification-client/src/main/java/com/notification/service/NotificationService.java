package com.notification.service;

import com.notification.dto.NotificationDto;
import com.notification.entity.NotificationEntity;
import com.notification.repository.INotificationRepository;
import java.time.LocalDateTime;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class NotificationService implements INotificationService {

  private final INotificationRepository repository;

  public void send(NotificationDto dto) {
    repository.save(
        NotificationEntity
            .builder()
            .customerId(dto.getCustomerId())
            .customerEmail(dto.getCustomerEmail())
            .sender("Juke Services")
            .message(dto.getMessage())
            .sentAt(LocalDateTime.now())
            .build()
    );
  }
}