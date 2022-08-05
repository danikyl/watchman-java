package com.fucci.watchman.core.usecase.chain;

import com.fucci.watchman.core.domain.exchange.FindAndProcessUserAlertEventExchangeDto;
import com.fucci.watchman.core.ports.repository.UserPriceAlertRepositoryPort;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class GetAllRegisteredItemsChain {
    private final UserPriceAlertRepositoryPort userPriceAlertRepositoryPort;

    public FindAndProcessUserAlertEventExchangeDto execute(FindAndProcessUserAlertEventExchangeDto exchangeDto) {
        var itemSymbols = userPriceAlertRepositoryPort.getAllDistinctSymbols();
        exchangeDto.setItemsSymbolToCheck(itemSymbols);
        return exchangeDto;
    }
}
