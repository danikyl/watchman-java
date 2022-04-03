package com.fucci.watchman.core.gateway.event_stream.port;

import com.fucci.watchman.core.domain.alert.UserPriceAlert;
import org.springframework.stereotype.Component;

@Component
public class EventStreamGatewayImpl implements EventStreamGateway {
    @Override
    public void publishUserAlertEvent(UserPriceAlert priceAlert) {
        System.out.println("TEST: Published event");
    }
}
