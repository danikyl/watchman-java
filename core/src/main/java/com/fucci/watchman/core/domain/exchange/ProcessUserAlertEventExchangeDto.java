package com.fucci.watchman.core.domain.exchange;

import com.fucci.watchman.core.domain.item.Item;
import lombok.Builder;

import java.util.List;

@Builder
public class ProcessUserAlertEventExchangeDto {
    private List<Item> itensRegistered;
}
