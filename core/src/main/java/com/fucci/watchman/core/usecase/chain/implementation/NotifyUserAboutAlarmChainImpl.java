package com.fucci.watchman.core.usecase.chain.implementation;

import com.fucci.watchman.core.domain.exchange.FindAndProcessUserAlertEventExchangeDto;
import com.fucci.watchman.core.ports.event_stream.EventStreamGateway;
import com.fucci.watchman.core.usecase.chain.NotifyUserAboutAlarmChain;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class NotifyUserAboutAlarmChainImpl implements NotifyUserAboutAlarmChain {
    private final EventStreamGateway eventStreamGateway;

    public FindAndProcessUserAlertEventExchangeDto execute(FindAndProcessUserAlertEventExchangeDto exchangeDto) {
        eventStreamGateway.publishUserAlertEvent(exchangeDto.getNotificationsToPublish());
        return exchangeDto;
    }
}
