package com.progettomedusa.player_sheets_service.model.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.Column;
import jakarta.persistence.Lob;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CreatePlayerSheetRequest {

    @JsonProperty
    @NotBlank
    private String name;
    @JsonProperty
    @NotBlank
    private String race;
    @JsonProperty("character_class")
    @NotBlank
    private String characterClass;
    @JsonProperty
    @NotBlank
    private String background;
    @JsonProperty
    @NotNull
    private int experience;
    @JsonProperty
    @NotBlank
    private String alignment;
    @JsonProperty
    @NotNull
    private int strength;
    @JsonProperty
    @NotNull
    private int dexterity;
    @JsonProperty
    @NotNull
    private int constitution;
    @JsonProperty
    @NotNull
    private int intelligence;
    @JsonProperty
    @NotNull
    private int wisdom;
    @JsonProperty
    @NotNull
    private int charisma;
    @JsonProperty ("proficiency_bonus")
    @NotNull
    private int proficiencyBonus;
    @JsonProperty ("passive_perception")
    @NotNull
    private int passivePerception;
    @JsonProperty
    @NotNull
    private int speed;
    @JsonProperty
    @NotNull
    private int initiative;
    @JsonProperty ("max_hit_points")
    @NotNull
    private int maxHitPoints;
    @JsonProperty ("current_hit_points")
    @NotNull
    private int currentHitPoints;
    @JsonProperty ("temp_hit_points")
    @NotNull
    private int tempHitPoints;
    @JsonProperty ("hit_dice")
    @NotBlank
    private String hitDice;
    @JsonProperty ("spellcasting_ability")
    @NotBlank
    private String spellcastingAbility;
    @JsonProperty ("spell_save_dc")
    @NotNull
    private int spellSaveDC;
    @JsonProperty ("spell_attack_bonus")
    @NotNull
    private int spellAttackBonus;
    @JsonProperty @Lob
    @NotBlank
    private String features;
    @JsonProperty @Lob
    @NotBlank
    private String notes;
}
