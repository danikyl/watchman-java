package com.fucci.watchman.core.gateway.repository.port;

import com.fucci.watchman.core.domain.alert.UserPriceAlert;

import java.util.List;

public interface UserPriceAlertRepository {
    List<UserPriceAlert> findUserPriceAlertTriggered();
}
