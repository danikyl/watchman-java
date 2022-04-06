package com.fucci.watchman.core.domain.alert;

import com.fucci.watchman.core.domain.item.Item;
import com.fucci.watchman.core.domain.user.User;
import lombok.Builder;

@Builder
public class UserPriceAlert {
    Item item;
    User user;
}
