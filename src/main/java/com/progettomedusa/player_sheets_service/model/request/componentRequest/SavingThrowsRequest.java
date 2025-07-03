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
public class SavingThrowsRequest {

    @JsonProperty ("saving_throw1")
    private boolean savingThrow1;
    @JsonProperty ("saving_throw2")
    private boolean savingThrow2;
    @JsonProperty ("saving_throw3")
    private boolean savingThrow3;
}
