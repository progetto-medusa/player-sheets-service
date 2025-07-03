package com.progettomedusa.player_sheets_service.model.request.componentRequest;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.NotNull;
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
public class SpellcastingRequest {

    @JsonProperty ("spellcasting_class")
    private String spellcastingClass;
    @JsonProperty ("spellcasting_ability")
    private String spellcastingAbility;
    @JsonProperty ("spell_save_dc")
    private Integer spellSaveDC;
    @JsonProperty ("spell_attack_bonus")
    private Integer spellAttackBonus;
}
