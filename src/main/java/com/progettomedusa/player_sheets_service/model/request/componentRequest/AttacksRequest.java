package com.progettomedusa.player_sheets_service.model.request.componentRequest;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.NotBlank;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Data
public class AttacksRequest {


    @JsonProperty
    @NotBlank
    private String attack1Name;
    @JsonProperty
    @NotBlank
    private String attack1Bonus;
    @JsonProperty
    @NotBlank
    private String attack1Damage;
    @JsonProperty
    @NotBlank
    private String attack2Name;
    @JsonProperty
    @NotBlank
    private String attack2Bonus;
    @JsonProperty
    @NotBlank
    private String attack2Damage;
    @JsonProperty
    @NotBlank
    private String attack3Name;
    @JsonProperty
    @NotBlank
    private String attack3Bonus;
    @JsonProperty
    @NotBlank
    private String attack3Damage;

}
