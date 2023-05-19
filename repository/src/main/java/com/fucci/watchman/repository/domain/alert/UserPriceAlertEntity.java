package com.fucci.watchman.repository.domain.alert;

import com.fucci.watchman.core.domain.enums.ItemType;
import com.fucci.watchman.repository.domain.user.UserEntity;
import lombok.Builder;
import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Builder
@Data
public class UserPriceAlertEntity {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer id;
    private String itemSymbol;
    private ItemType itemType;
    @ManyToOne
    private UserEntity user;
    private BigDecimal minPrice;
    private BigDecimal maxPrice;
}
