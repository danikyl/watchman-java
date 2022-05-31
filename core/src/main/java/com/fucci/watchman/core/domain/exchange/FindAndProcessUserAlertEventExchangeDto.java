package com.fucci.watchman.core.domain.exchange;

import com.fucci.watchman.core.domain.alert.AlertNotification;
import com.fucci.watchman.core.domain.item.ItemPrice;
import lombok.Builder;
import lombok.Data;

import java.util.List;
import java.util.Map;

@Builder
@Data
public class FindAndProcessUserAlertEventExchangeDto {
    private List<String> itemsSymbolToCheck;
    private Map<String, ItemPrice> itemsPriceMap;
    private List<AlertNotification> notificationsToPublish;
}
