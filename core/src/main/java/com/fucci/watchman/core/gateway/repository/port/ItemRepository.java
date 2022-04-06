package com.fucci.watchman.core.gateway.repository.port;

import com.fucci.watchman.core.domain.item.Item;

import java.util.List;

public interface ItemRepository {
    List<Item> getAllDistinctItems();
}
