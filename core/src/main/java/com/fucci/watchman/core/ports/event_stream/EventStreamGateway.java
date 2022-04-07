package com.fucci.watchman.core.ports.event_stream;

import com.fucci.watchman.core.domain.alert.AlertNotification;

public interface EventStreamGateway {
    void publishUserAlertEvent(AlertNotification alertNotification);
}
