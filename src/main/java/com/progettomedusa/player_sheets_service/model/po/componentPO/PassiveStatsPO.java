package com.progettomedusa.player_sheets_service.model.po.componentPO;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Embeddable
public class PassiveStatsPO {

    @Column
    private Integer inspiration;
    @Column(name="proficiency_bonus")
    private Integer proficiencyBonus;
    @Column(name="passive_perception")
    private Integer passivePerception;
}
