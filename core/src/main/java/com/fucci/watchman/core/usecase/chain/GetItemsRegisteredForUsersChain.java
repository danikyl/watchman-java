package com.fucci.watchman.core.usecase.chain;

import com.fucci.watchman.core.domain.exchange.ProcessUserAlertEventExchangeDto;

public interface GetItemsRegisteredForUsersChain {
    ProcessUserAlertEventExchangeDto execute(ProcessUserAlertEventExchangeDto dto);
}
