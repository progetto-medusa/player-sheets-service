package com.progettomedusa.player_sheets_service.model.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CreatePlayerSheetRequestResponse extends RestResponse {
    private String name;
    private String race;
    private String characterClass;
    private String background;
    private Integer experience;
    private String alignment;
    private Integer strength;
    private Integer dexterity;
    private Integer constitution;
    private Integer intelligence;
    private Integer wisdom;
    private Integer charisma;
    private Integer proficiencyBonus;
    private Integer passivePerception;
    private Integer speed;
    private Integer initiative;
    private Integer maxHitPoints;
    private Integer currentHitPoints;
    private Integer tempHitPoints;
    private String hitDice;
    private String spellcastingAbility;
    private Integer spellSaveDC;
    private Integer spellAttackBonus;
    private String features;
    private String notes;
}
