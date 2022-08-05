package com.fucci.watchman.core.ports.repository;

import com.fucci.watchman.core.domain.alert.UserPriceAlert;
import com.fucci.watchman.core.domain.item.ItemPrice;

import java.util.List;
import java.util.Map;

public interface UserPriceAlertRepositoryPort {
    List<UserPriceAlert> getUserPriceAlertBySymbolAndPriceBetween(Map<String, ItemPrice> itemPriceMap);

    List<String> getAllDistinctSymbols();
}
