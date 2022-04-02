package com.fucci.watchman.core.usecase;

import com.fucci.watchman.core.domain.alert.PriceAlert;
import com.fucci.watchman.core.gateway.event_stream.port.EventStreamGateway;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class SendUserAlertEventUseCase {
    private final EventStreamGateway eventStreamGateway;

    public void sendUserAlertEvent(PriceAlert priceAlert) {
        eventStreamGateway.publishUserAlertEvent(priceAlert);
    }
}
