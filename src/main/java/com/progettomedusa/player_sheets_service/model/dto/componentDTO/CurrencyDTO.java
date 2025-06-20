package com.progettomedusa.player_sheets_service.model.dto.componentDTO;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Data
public class CurrencyDTO {

    private Integer copperCurrency;
    private Integer bronzeCurrency;
    private Integer silverCurrency;
    private Integer goldCurrency;
    private Integer platinumCurrency;
}
