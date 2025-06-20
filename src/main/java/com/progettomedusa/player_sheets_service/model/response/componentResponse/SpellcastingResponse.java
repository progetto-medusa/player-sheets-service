package com.progettomedusa.player_sheets_service.model.response.componentResponse;

import com.fasterxml.jackson.annotation.JsonProperty;
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
public class SpellcastingResponse {

    @JsonProperty
    private String spellcastingClass;
    @JsonProperty
    private String spellcastingAbility;
    @JsonProperty
    private Integer spellSaveDC;
    @JsonProperty
    private Integer spellAttackBonus;
}
