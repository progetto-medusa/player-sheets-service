package com.progettomedusa.player_sheets_service.model.dto.componentDTO;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Data
public class SpellcastingDTO {

    private String spellcastingClass;
    private String spellcastingAbility;
    private Integer spellSaveDC;
    private Integer spellAttackBonus;
}
