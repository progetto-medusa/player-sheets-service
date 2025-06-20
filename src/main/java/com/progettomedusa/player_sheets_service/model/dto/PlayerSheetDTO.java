package com.progettomedusa.player_sheets_service.model.dto;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import com.progettomedusa.player_sheets_service.model.dto.componentDTO.*;
import com.progettomedusa.player_sheets_service.model.dto.componentDTO.CurrencyDTO;
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
    private Integer level;
    private String alignment;

    private AttacksDTO attacksDTO;
    private CantripsDTO cantripsDTO;
    private CurrencyDTO currencyDTO;
    private EquipmentsDTO equipmentsDTO;
    private PassiveStatsDTO passiveStatsDTO;
    private PersonalityDTO personalityDTO;
    private SavingThrowsDTO savingThrowsDTO;
    private SkillsDTO skillsDTO;
    private SpellcastingDTO spellcastingDTO;
    private SpellSlotsDTO spellSlotsDTO;
    private StatsDTO statsDTO;
    private StatusDTO statusDTO;

}

    
