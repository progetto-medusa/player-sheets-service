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


    @JsonProperty ("attack1_name")
    private String attack1Name;
    @JsonProperty ("attack1_bonus")
    private String attack1Bonus;
    @JsonProperty ("attack1_damage")
    private String attack1Damage;
    @JsonProperty ("attack2_name")
    private String attack2Name;
    @JsonProperty ("attack2_bonus")
    private String attack2Bonus;
    @JsonProperty ("attack2_damage")
    private String attack2Damage;
    @JsonProperty ("attack3_name")
    private String attack3Name;
    @JsonProperty ("attack3_bonus")
    private String attack3Bonus;
    @JsonProperty ("attack3_damage")
    private String attack3Damage;

}
