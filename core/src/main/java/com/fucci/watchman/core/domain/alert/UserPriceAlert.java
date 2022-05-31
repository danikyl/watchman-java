package com.fucci.watchman.core.domain.alert;

import com.fucci.watchman.core.domain.enums.ItemType;
import com.fucci.watchman.core.domain.user.User;
import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;

@Builder
@Data
public class UserPriceAlert {
    private String itemSymbol;
    private ItemType itemType;
    private User user;
    private BigDecimal minPrice;
    private BigDecimal maxPrice;
}
