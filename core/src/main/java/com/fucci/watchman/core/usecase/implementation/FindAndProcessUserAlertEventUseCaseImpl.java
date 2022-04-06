package com.fucci.watchman.core.usecase.implementation;

import com.fucci.watchman.core.domain.alert.UserPriceAlert;
import com.fucci.watchman.core.domain.exchange.ProcessUserAlertEventExchangeDto;
import com.fucci.watchman.core.gateway.event_stream.port.EventStreamGateway;
import com.fucci.watchman.core.usecase.FindAndProcessUserAlertEventUseCase;
import com.fucci.watchman.core.usecase.chain.GetItemsRegisteredForUsersChain;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class FindAndProcessUserAlertEventUseCaseImpl implements FindAndProcessUserAlertEventUseCase {
    private final EventStreamGateway eventStreamGateway;
    private final GetItemsRegisteredForUsersChain getItemsRegisteredForUsersChain;

    public void execute() {
        var exchangeDto = ProcessUserAlertEventExchangeDto.builder().build();
        exchangeDto = getItemsRegisteredForUsersChain.execute(exchangeDto);
        eventStreamGateway.publishUserAlertEvent(UserPriceAlert.builder().build());
    }
}
