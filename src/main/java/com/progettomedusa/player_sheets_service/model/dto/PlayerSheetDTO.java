package com.progettomedusa.player_sheets_service.model.dto;
import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class PlayerSheetDTO { 
    
    private Long id;
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

    /*public PlayerSheetDTO(Long id,
                          String name,
                          String race,
                          String characterClass,
                          String background,
                          int experience,
                          String alignment,
                          int strength,
                          int dexterity,
                          int constitution,
                          int intelligence,
                          int wisdom,
                          int charisma,
                          int proficiencyBonus,
                          int passivePerception,
                          int speed,
                          int initiative,
                          int maxHitPoints,
                          int currentHitPoints,
                          int tempHitPoints,
                          String hitDice,
                          String spellcastingAbility,
                          int spellSaveDC,
                          int spellAttackBonus,
                          String features,
                          String notes) {
        this.id = id;
        this.name = name;
        this.race = race;
        this.characterClass = characterClass;
        this.background = background;
        this.experience = experience;
        this.alignment = alignment;
        this.strength = strength;
        this.dexterity = dexterity;
        this.constitution = constitution;
        this.intelligence = intelligence;
        this.wisdom = wisdom;
        this.charisma = charisma;
        this.proficiencyBonus = proficiencyBonus;
        this.passivePerception = passivePerception;
        this.speed = speed;
        this.initiative = initiative;
        this.maxHitPoints = maxHitPoints;
        this.currentHitPoints = currentHitPoints;
        this.tempHitPoints = tempHitPoints;
        this.hitDice = hitDice;
        this.spellcastingAbility = spellcastingAbility;
        this.spellSaveDC = spellSaveDC;
        this.spellAttackBonus = spellAttackBonus;
        this.features = features;
        this.notes = notes;
    }*/

    
