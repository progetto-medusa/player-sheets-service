package com.progettomedusa.player_sheets_service.model.response.componentResponse;

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
public class CantripsResponse {

    @JsonProperty
    @NotBlank
    private String cantrip1;
    @JsonProperty
    @NotBlank
    private String cantrip2;
    @JsonProperty
    @NotBlank
    private String cantrip3;
    @JsonProperty
    @NotBlank
    private String cantrip4;
}
