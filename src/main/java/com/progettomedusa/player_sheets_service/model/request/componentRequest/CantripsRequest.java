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
public class CantripsRequest {

    @JsonProperty
    private String cantrip1;
    @JsonProperty
    private String cantrip2;
    @JsonProperty
    private String cantrip3;
    @JsonProperty
    private String cantrip4;
}
