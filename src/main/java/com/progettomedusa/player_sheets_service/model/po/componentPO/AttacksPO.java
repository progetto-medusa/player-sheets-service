package com.progettomedusa.player_sheets_service.model.po.componentPO;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class AttacksPO {

    @Column(name="attack1_name")
    private String attack1Name;
    @Column(name="attack1_bonus")
    private String attack1Bonus;
    @Column(name="attack1_damage")
    private String attack1Damage;
    @Column(name="attack2_name")
    private String attack2Name;
    @Column(name="attack2_bonus")
    private String attack2Bonus;
    @Column(name="attack2_damage")
    private String attack2Damage;
    @Column(name="attack3_name")
    private String attack3Name;
    @Column(name="attack3_bonus")
    private String attack3Bonus;
    @Column(name="attack3_damage")
    private String attack3Damage;




}
