package com.fucci.watchman.repository.service;

import com.fucci.watchman.core.domain.alert.UserPriceAlert;
import com.fucci.watchman.core.domain.item.ItemPrice;
import com.fucci.watchman.core.ports.repository.UserPriceAlertRepositoryPort;
import com.fucci.watchman.repository.domain.alert.UserPriceAlertEntity;
import com.fucci.watchman.repository.repository.UserPriceAlertRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Component
@RequiredArgsConstructor
public class UserPriceAlertRepositoryService implements UserPriceAlertRepositoryPort {

    private final UserPriceAlertRepository userPriceAlertRepository;

    public List<UserPriceAlert> getUserPriceAlertBySymbolAndPriceBetween(Map<String, ItemPrice> itemPriceMap) {
        userPriceAlertRepository.save(UserPriceAlertEntity.builder().build());
        System.out.println("212");
        return new ArrayList<>();
    }

    public List<String> getAllDistinctSymbols() {
        return new ArrayList<>();
    }
}
