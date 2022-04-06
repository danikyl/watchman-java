package com.fucci.watchman.core.usecase.chain;

import com.fucci.watchman.core.domain.exchange.FindAndProcessUserAlertEventExchangeDto;
import com.fucci.watchman.core.gateway.repository.port.ItemRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class GetItemsRegisteredForUsersChain {
    private final ItemRepository itemRepository;

    public FindAndProcessUserAlertEventExchangeDto execute(FindAndProcessUserAlertEventExchangeDto dto) {
        var items = itemRepository.getAllDistinctItems();
        dto.setItensRegistered(items);
        return dto;
    }
}
