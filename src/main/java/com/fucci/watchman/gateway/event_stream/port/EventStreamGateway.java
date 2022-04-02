package com.fucci.watchman.gateway.event_stream.port;

import com.fucci.watchman.domain.alert.PriceAlert;

public interface EventStreamGateway {
    void publishUserAlertEvent(PriceAlert priceAlert);
}
