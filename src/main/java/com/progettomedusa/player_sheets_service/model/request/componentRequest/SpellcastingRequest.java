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

    @JsonProperty
    private String spellcastingClass;
    @JsonProperty
    private String spellcastingAbility;
    @JsonProperty
    private Integer spellSaveDC;
    @JsonProperty
    private Integer spellAttackBonus;
}
