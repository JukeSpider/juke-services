package com.notification.entity;

import java.time.LocalDateTime;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "notification")
public class NotificationEntity extends LongIdEntity {

  @Column(name = "customer_id", nullable = false)
  private Long customerId;

  @Column(name = "customer_email", nullable = false)
  private String customerEmail;

  @Column(name = "sender", nullable = false)
  private String sender;

  @Column(name = "message", nullable = false)
  private String message;

  @Column(name = "created_at", nullable = false)
  private LocalDateTime sentAt;
}
