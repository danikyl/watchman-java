package com.fucci.watchman.core.ports.event_stream;

import com.fucci.watchman.core.domain.alert.AlertNotification;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class EventStreamGatewayDumbImpl implements EventStreamGateway{

    public void publishUserAlertEvent(List<AlertNotification> alertNotification) {

    }
}
