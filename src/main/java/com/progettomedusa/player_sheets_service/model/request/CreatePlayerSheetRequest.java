package com.progettomedusa.player_sheets_service.model.request;

import com.progettomedusa.player_sheets_service.model.dto.componentDTO.*;
import com.progettomedusa.player_sheets_service.model.request.componentRequest.*;
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
import lombok.Data;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Data
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
    @NotNull
    private int level;
    @JsonProperty
    @NotBlank
    private String alignment;

    private AttacksRequest attacks;
    private CantripsRequest cantrips;
    private CurrencyRequest currency;
    private EquipmentsRequest equipments;
    private PassiveStatsRequest passiveStats;
    private PersonalityRequest personality;
    private SavingThrowsRequest savingThrows;
    private SkillsRequest skills;
    private SpellcastingRequest spellcasting;
    private SpellSlotsRequest spellSlots;
    private StatsRequest stats;
    private StatusRequest status;



}
