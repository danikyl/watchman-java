package com.fucci.watchman.core.ports.event_stream;

import com.fucci.watchman.core.domain.alert.AlertNotification;

import java.util.List;

public interface EventStreamGateway {
    void publishUserAlertEvent(List<AlertNotification> alertNotification);
}
