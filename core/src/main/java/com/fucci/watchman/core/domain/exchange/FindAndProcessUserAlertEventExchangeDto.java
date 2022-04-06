package com.fucci.watchman.core.domain.exchange;

import com.fucci.watchman.core.domain.item.Item;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Builder
@Data
public class FindAndProcessUserAlertEventExchangeDto {
    private List<Item> itensRegistered;
}
