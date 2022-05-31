package com.fucci.watchman.core.usecase.chain;

import com.fucci.watchman.core.domain.exchange.FindAndProcessUserAlertEventExchangeDto;
import com.fucci.watchman.core.ports.event_stream.EventStreamGateway;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class NotifyUserAboutAlarmChain {
    private final EventStreamGateway eventStreamGateway;

    public FindAndProcessUserAlertEventExchangeDto execute(FindAndProcessUserAlertEventExchangeDto exchangeDto) {
        eventStreamGateway.publishUserAlertEvent(exchangeDto.getNotificationsToPublish());
        return exchangeDto;
    }
}
