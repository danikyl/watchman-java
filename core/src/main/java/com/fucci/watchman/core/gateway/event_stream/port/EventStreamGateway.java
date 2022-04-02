package com.fucci.watchman.core.gateway.event_stream.port;

import com.fucci.watchman.core.domain.alert.PriceAlert;

public interface EventStreamGateway {
    void publishUserAlertEvent(PriceAlert priceAlert);
}
