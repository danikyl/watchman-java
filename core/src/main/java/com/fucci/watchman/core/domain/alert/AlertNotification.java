package com.fucci.watchman.core.domain.alert;

import com.fucci.watchman.core.domain.item.ItemPrice;
import com.fucci.watchman.core.domain.user.User;
import lombok.Builder;

@Builder
public class AlertNotification {
    private String itemSymbol;
    private ItemPrice currentPrice;
    private User userToNotify;
}
