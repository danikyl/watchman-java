package com.fucci.watchman.core.ports.integration;

import com.fucci.watchman.core.domain.item.ItemPrice;

public interface ItemsPriceSourceIntegration {
    ItemPrice getItemPrice(String itemSymbol);
}
