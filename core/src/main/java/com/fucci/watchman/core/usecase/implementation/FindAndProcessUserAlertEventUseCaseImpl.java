package com.fucci.watchman.core.usecase.implementation;

import com.fucci.watchman.core.domain.exchange.FindAndProcessUserAlertEventExchangeDto;
import com.fucci.watchman.core.usecase.FindAndProcessUserAlertEventUseCase;
import com.fucci.watchman.core.usecase.chain.GetItemsPriceChain;
import com.fucci.watchman.core.usecase.chain.GetItemsRegisteredForUsersChain;
import com.fucci.watchman.core.usecase.chain.GetUserAlarmsThatShouldBeTriggeredChain;
import com.fucci.watchman.core.usecase.chain.NotifyUserAboutAlarmChain;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class FindAndProcessUserAlertEventUseCaseImpl implements FindAndProcessUserAlertEventUseCase {
    private final GetItemsRegisteredForUsersChain getItemsRegisteredForUsersChain;
    private final GetItemsPriceChain getItemsPriceChain;
    private final GetUserAlarmsThatShouldBeTriggeredChain getUserAlarmsThatShouldBeTriggeredChain;
    private final NotifyUserAboutAlarmChain notifyUserAboutAlarmChain;

    public void execute() {
        var exchangeDto = FindAndProcessUserAlertEventExchangeDto.builder().build();
        exchangeDto = getItemsRegisteredForUsersChain.execute(exchangeDto);
        exchangeDto = getItemsPriceChain.execute(exchangeDto);
        exchangeDto = getUserAlarmsThatShouldBeTriggeredChain.execute(exchangeDto);
        notifyUserAboutAlarmChain.execute(exchangeDto);
    }
}
