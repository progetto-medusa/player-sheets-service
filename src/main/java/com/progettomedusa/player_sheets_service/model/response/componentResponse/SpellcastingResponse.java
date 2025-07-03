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

    @JsonProperty ("spellcasting_class")
    private String spellcastingClass;
    @JsonProperty ("spellcasting_ability")
    private String spellcastingAbility;
    @JsonProperty ("spell_save_dc")
    private Integer spellSaveDC;
    @JsonProperty ("spell_attack_bonus")
    private Integer spellAttackBonus;
}
