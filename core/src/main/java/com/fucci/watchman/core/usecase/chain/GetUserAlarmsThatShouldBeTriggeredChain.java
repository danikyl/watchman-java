package com.fucci.watchman.core.usecase.chain;

import com.fucci.watchman.core.domain.exchange.FindAndProcessUserAlertEventExchangeDto;

public interface GetUserAlarmsThatShouldBeTriggeredChain {
    FindAndProcessUserAlertEventExchangeDto execute(FindAndProcessUserAlertEventExchangeDto exchangeDto);
}
