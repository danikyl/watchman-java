package com.fucci.watchman.core.gateway.event_stream.port;

import com.fucci.watchman.core.domain.alert.PriceAlert;
import org.springframework.stereotype.Component;

@Component
public class EventStreamGatewayImpl implements EventStreamGateway {
    @Override
    public void publishUserAlertEvent(PriceAlert priceAlert) {
        System.out.println("ChegueiiiIIiiII");
    }
}
