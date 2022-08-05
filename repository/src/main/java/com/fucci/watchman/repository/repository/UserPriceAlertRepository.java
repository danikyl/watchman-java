package com.fucci.watchman.repository.repository;

import com.fucci.watchman.repository.domain.alert.UserPriceAlertEntity;
import org.springframework.data.repository.CrudRepository;

public interface UserPriceAlertRepository extends CrudRepository<UserPriceAlertEntity, Integer> {
}
