package com.fucci.watchman.core.ports.repository;

import com.fucci.watchman.core.domain.alert.UserPriceAlert;
import com.fucci.watchman.core.domain.item.ItemPrice;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Component
public class UserPriceAlertImplTest implements UserPriceAlertRepository {
    @Override
    public List<UserPriceAlert> getUserPriceAlertBySymbolAndPriceBetween(Map<String, ItemPrice> itemPriceMap) {
        return new ArrayList<>();
    }

    @Override
    public List<String> getAllDistinctSymbols() {
        return new ArrayList<>();
    }
}
