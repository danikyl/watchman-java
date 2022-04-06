package com.fucci.watchman.core.usecase.chain;

import com.fucci.watchman.core.domain.exchange.FindAndProcessUserAlertEventExchangeDto;
import com.fucci.watchman.core.gateway.integration.port.ItemsPriceSourceIntegration;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class GetItemsPriceChain {
    private final ItemsPriceSourceIntegration itemsPriceSourceIntegration;

    public FindAndProcessUserAlertEventExchangeDto execute(FindAndProcessUserAlertEventExchangeDto dto) {
        dto.getItensRegistered().forEach(item -> {
            item.setPrice(itemsPriceSourceIntegration.getItemPrice(item));
        });
        return dto;
    }
}
