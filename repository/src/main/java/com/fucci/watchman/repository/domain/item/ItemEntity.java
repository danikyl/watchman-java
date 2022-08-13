package com.fucci.watchman.repository.domain.item;

import com.fucci.watchman.core.domain.enums.ItemType;
import lombok.Builder;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Builder
@Data
public class ItemEntity {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer id;
    private String symbol;
    private ItemType type;
}
