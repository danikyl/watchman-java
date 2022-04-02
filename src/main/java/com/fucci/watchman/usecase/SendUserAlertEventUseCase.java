package com.fucci.watchman.usecase;

import com.fucci.watchman.domain.alert.PriceAlert;
import com.fucci.watchman.gateway.event_stream.port.EventStreamGateway;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class SendUserAlertEventUseCase {
    private final EventStreamGateway eventStreamGateway;

    public void sendUserAlertEvent(PriceAlert priceAlert) {
        eventStreamGateway.publishUserAlertEvent(priceAlert);
    }
}
