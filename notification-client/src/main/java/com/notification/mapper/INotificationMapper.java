package com.notification.mapper;

import com.notification.dto.NotificationDto;
import com.notification.entity.NotificationEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface INotificationMapper extends IBaseMapper<NotificationEntity, NotificationDto> {

}