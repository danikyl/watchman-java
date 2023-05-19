package com.fucci.watchman.core.usecase.chain.implementation;

import com.fucci.watchman.core.domain.exchange.FindAndProcessUserAlertEventExchangeDto;
import com.fucci.watchman.core.ports.repository.UserPriceAlertRepositoryPort;
import com.fucci.watchman.core.usecase.chain.GetAllRegisteredItemsChain;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class GetAllRegisteredItemsChainImpl implements GetAllRegisteredItemsChain {
    private final UserPriceAlertRepositoryPort userPriceAlertRepositoryPort;

    public FindAndProcessUserAlertEventExchangeDto execute(FindAndProcessUserAlertEventExchangeDto exchangeDto) {
        var itemSymbols = userPriceAlertRepositoryPort.getAllDistinctSymbols();
        exchangeDto.setItemsSymbolToCheck(itemSymbols);
        return exchangeDto;
    }
}
