package com.fucci.watchman.core.gateway.integration.port;

import com.fucci.watchman.core.domain.item.Item;
import com.fucci.watchman.core.domain.item.ItemPrice;

public interface ItemsPriceSourceIntegration {
    ItemPrice getItemPrice(Item item);
}
