package com.fucci.watchman.core.usecase.chain;

import com.fucci.watchman.core.domain.exchange.FindAndProcessUserAlertEventExchangeDto;
import com.fucci.watchman.core.ports.integration.ItemsPriceSourceIntegration;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.HashMap;

@Component
@RequiredArgsConstructor
public class GetItemsPriceChain {
    private final ItemsPriceSourceIntegration itemsPriceSourceIntegration;

    public FindAndProcessUserAlertEventExchangeDto execute(FindAndProcessUserAlertEventExchangeDto dto) {
        dto.setItemsPriceMap(new HashMap<>());
        dto.getItemsSymbolToCheck().forEach(symbol -> {
            dto.getItemsPriceMap().put(symbol, itemsPriceSourceIntegration.getItemPrice(symbol));
        });
        return dto;
    }
}
