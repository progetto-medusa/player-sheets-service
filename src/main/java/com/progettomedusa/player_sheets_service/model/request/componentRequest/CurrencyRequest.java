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

    @JsonProperty
    @NotNull
    private Integer copperCurrency;
    @JsonProperty
    @NotNull
    private Integer bronzeCurrency;
    @JsonProperty
    @NotNull
    private Integer silverCurrency;
    @JsonProperty
    @NotNull
    private Integer goldCurrency;
    @JsonProperty
    @NotNull
    private Integer platinumCurrency;
}
