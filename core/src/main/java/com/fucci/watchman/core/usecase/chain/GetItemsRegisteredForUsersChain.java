package com.fucci.watchman.core.usecase.chain;

import com.fucci.watchman.core.domain.exchange.FindAndProcessUserAlertEventExchangeDto;
import com.fucci.watchman.core.ports.repository.UserPriceAlertRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class GetItemsRegisteredForUsersChain {
    private final UserPriceAlertRepository userPriceAlertRepository;

    public FindAndProcessUserAlertEventExchangeDto execute(FindAndProcessUserAlertEventExchangeDto dto) {
        var itemSymbols = userPriceAlertRepository.getAllDistinctSymbols();
        dto.setItemsSymbolToCheck(itemSymbols);
        return dto;
    }
}
