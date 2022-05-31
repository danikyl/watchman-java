package com.fucci.watchman.core.domain.item;

import java.math.BigDecimal;
import java.time.LocalDate;

public class ItemPrice {
    private String symbol;
    private BigDecimal open;
    private BigDecimal high;
    private BigDecimal low;
    private BigDecimal close;
    private LocalDate quoteDay;
}
