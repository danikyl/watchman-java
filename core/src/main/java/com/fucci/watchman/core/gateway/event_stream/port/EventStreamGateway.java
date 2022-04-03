package com.fucci.watchman.core.gateway.event_stream.port;

import com.fucci.watchman.core.domain.alert.UserPriceAlert;

public interface EventStreamGateway {
    void publishUserAlertEvent(UserPriceAlert priceAlert);
}
