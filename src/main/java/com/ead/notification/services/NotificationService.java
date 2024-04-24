package com.ead.notification.services;

import java.util.Optional;
import java.util.UUID;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.ead.notification.models.NotificationModel;

public interface NotificationService {

	public NotificationModel saveNotification(NotificationModel notificationModel);

	public Page<NotificationModel> findAllNotificationsByUser(UUID userId, Pageable pageable);

	public Optional<NotificationModel> findByNotificationIdAndUserId(UUID notificationId, UUID userId);

}
