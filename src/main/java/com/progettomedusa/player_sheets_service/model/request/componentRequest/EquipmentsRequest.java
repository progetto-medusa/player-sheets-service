package com.progettomedusa.player_sheets_service.model.request.componentRequest;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.NotBlank;
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
public class EquipmentsRequest {

    @JsonProperty
    private String equipment1;
    @JsonProperty
    private String equipment2;
    @JsonProperty
    private String equipment3;
    @JsonProperty
    private String equipment4;
    @JsonProperty
    private String equipment5;
}
