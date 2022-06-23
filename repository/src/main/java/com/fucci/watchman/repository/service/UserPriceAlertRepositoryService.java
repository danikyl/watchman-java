package com.fucci.watchman.repository.service;

import com.fucci.watchman.core.domain.alert.UserPriceAlert;
import com.fucci.watchman.core.domain.item.ItemPrice;
import com.fucci.watchman.core.ports.repository.UserPriceAlertRepository;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Component
public class UserPriceAlertRepositoryService implements UserPriceAlertRepository {

    public List<UserPriceAlert> getUserPriceAlertBySymbolAndPriceBetween(Map<String, ItemPrice> itemPriceMap) {
        return new ArrayList<>();
    }

    public List<String> getAllDistinctSymbols() {
        return new ArrayList<>();
    }
}
