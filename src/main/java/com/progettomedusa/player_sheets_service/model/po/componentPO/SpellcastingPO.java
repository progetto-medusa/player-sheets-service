package com.progettomedusa.player_sheets_service.model.po.componentPO;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class SpellcastingPO {

    @Column(name="spellcasting_class")
    private String spellcastingClass;
    @Column(name="spellcasting_ability")
    private String spellcastingAbility;
    @Column(name="spell_save_dc")
    private Integer spellSaveDC;
    @Column(name="spell_attack_bonus")
    private Integer spellAttackBonus;
}
