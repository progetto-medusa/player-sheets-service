package com.progettomedusa.player_sheets_service.model.request.componentRequest;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.Data;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Data
public class CurrencyRequest {

    @JsonProperty ("copper_currency")
    private Integer copperCurrency;
    @JsonProperty ("bronze_currency")
    private Integer bronzeCurrency;
    @JsonProperty ("silver_currency")
    private Integer silverCurrency;
    @JsonProperty ("gold_currency")
    private Integer goldCurrency;
    @JsonProperty ("platinum_currency")
    private Integer platinumCurrency;
}
