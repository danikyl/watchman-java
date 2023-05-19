package com.fucci.watchman.core.usecase.chain.implementation;

import com.fucci.watchman.core.domain.alert.AlertNotification;
import com.fucci.watchman.core.domain.exchange.FindAndProcessUserAlertEventExchangeDto;
import com.fucci.watchman.core.ports.repository.UserPriceAlertRepositoryPort;
import com.fucci.watchman.core.usecase.chain.GetUserAlarmsThatShouldBeTriggeredChain;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.ArrayList;

@Component
@RequiredArgsConstructor
public class GetUserAlarmsThatShouldBeTriggeredChainImpl implements GetUserAlarmsThatShouldBeTriggeredChain {
    private final UserPriceAlertRepositoryPort userPriceAlertRepositoryPort;

    public FindAndProcessUserAlertEventExchangeDto execute(FindAndProcessUserAlertEventExchangeDto exchangeDto) {
        exchangeDto.setNotificationsToPublish(new ArrayList<>());
        var alerts = userPriceAlertRepositoryPort
                .getUserPriceAlertBySymbolAndPriceBetween(exchangeDto.getItemsPriceMap());
        alerts.forEach(userPriceAlert -> {
            exchangeDto.getNotificationsToPublish().add(
                    AlertNotification.builder()
                            .itemSymbol(userPriceAlert.getItemSymbol())
                            .currentPrice(exchangeDto.getItemsPriceMap().get(userPriceAlert.getItemSymbol()))
                            .userToNotify(userPriceAlert.getUser())
                            .build()
            );
        });
        return exchangeDto;
    }
}
