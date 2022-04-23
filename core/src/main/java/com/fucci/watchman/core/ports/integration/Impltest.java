package com.fucci.watchman.core.ports.integration;

import com.fucci.watchman.core.domain.item.ItemPrice;
import org.springframework.stereotype.Component;

@Component
public class Impltest implements ItemsPriceSourceIntegration {
    @Override
    public ItemPrice getItemPrice(String itemSymbol) {
        return new ItemPrice();
    }
}
