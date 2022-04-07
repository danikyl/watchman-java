package com.fucci.watchman.core.usecase.chain;

import com.fucci.watchman.core.domain.alert.AlertNotification;
import com.fucci.watchman.core.domain.exchange.FindAndProcessUserAlertEventExchangeDto;
import com.fucci.watchman.core.ports.repository.UserPriceAlertRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.ArrayList;

@Component
@RequiredArgsConstructor
public class GetUserAlarmsThatShouldBeTriggeredChain {
    private final UserPriceAlertRepository userPriceAlertRepository;

    public FindAndProcessUserAlertEventExchangeDto execute(FindAndProcessUserAlertEventExchangeDto dto) {
        dto.setNotificationsToPublish(new ArrayList<>());
        var alerts = userPriceAlertRepository
                .getUserPriceAlertBySymbolAndPriceBetween(dto.getItemsPriceMap());
        alerts.forEach(userPriceAlert -> {
            dto.getNotificationsToPublish().add(
                    AlertNotification.builder()
                            .itemSymbol(userPriceAlert.getItemSymbol())
                            .currentPrice(dto.getItemsPriceMap().get(userPriceAlert.getItemSymbol()))
                            .userToNotify(userPriceAlert.getUser())
                            .build()
            );
        });
        return dto;
    }
}
