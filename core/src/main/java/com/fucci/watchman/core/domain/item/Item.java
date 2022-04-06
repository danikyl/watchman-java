package com.fucci.watchman.core.domain.item;

import com.fucci.watchman.core.domain.enums.ItemType;
import lombok.Data;

@Data
public class Item {
    private String symbol;
    private ItemPrice price;
    private ItemType type;
}
