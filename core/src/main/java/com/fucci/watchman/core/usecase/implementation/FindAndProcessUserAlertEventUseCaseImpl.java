package com.fucci.watchman.core.usecase.implementation;

import com.fucci.watchman.core.domain.exchange.FindAndProcessUserAlertEventExchangeDto;
import com.fucci.watchman.core.usecase.FindAndProcessUserAlertEventUseCase;
import com.fucci.watchman.core.usecase.chain.GetItemsPriceChain;
import com.fucci.watchman.core.usecase.chain.GetItemsRegisteredForUsersChain;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class FindAndProcessUserAlertEventUseCaseImpl implements FindAndProcessUserAlertEventUseCase {
    private final GetItemsRegisteredForUsersChain getItemsRegisteredForUsersChain;
    private final GetItemsPriceChain getItemsPriceChain;

    public void execute() {
        var exchangeDto = FindAndProcessUserAlertEventExchangeDto.builder().build();
        exchangeDto = getItemsRegisteredForUsersChain.execute(exchangeDto);
        exchangeDto = getItemsPriceChain.execute(exchangeDto);


        //Change below to include a new step instead of calling the gateway directly
        //eventStreamGateway.publishUserAlertEvent(UserPriceAlert.builder().build());
    }
}
