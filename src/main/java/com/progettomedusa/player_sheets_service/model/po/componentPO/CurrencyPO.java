package com.progettomedusa.player_sheets_service.model.po.componentPO;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Embeddable
public class CurrencyPO {

    @Column(name="copper_currency")
    private Integer copperCurrency;
    @Column(name="bronze_currency")
    private Integer bronzeCurrency;
    @Column(name="silver_currency")
    private Integer silverCurrency;
    @Column(name="gold_currency")
    private Integer goldCurrency;
    @Column(name="platinum_currency")
    private Integer platinumCurrency;

}
