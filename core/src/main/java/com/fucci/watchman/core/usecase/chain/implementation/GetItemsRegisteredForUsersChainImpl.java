package com.fucci.watchman.core.usecase.chain.implementation;

import com.fucci.watchman.core.domain.exchange.ProcessUserAlertEventExchangeDto;
import com.fucci.watchman.core.usecase.chain.GetItemsRegisteredForUsersChain;
import org.springframework.stereotype.Component;

@Component
public class GetItemsRegisteredForUsersChainImpl implements GetItemsRegisteredForUsersChain {
    public ProcessUserAlertEventExchangeDto execute(ProcessUserAlertEventExchangeDto dto) {
        return dto;
    }
}
