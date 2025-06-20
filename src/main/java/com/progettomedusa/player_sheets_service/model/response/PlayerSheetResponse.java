package com.progettomedusa.player_sheets_service.model.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.progettomedusa.player_sheets_service.model.response.componentResponse.*;
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
@JsonInclude(JsonInclude.Include.NON_NULL)
public class PlayerSheetResponse {
    private Long id;
    private String name;
    private String race;
    private String characterClass;
    private String background;
    private Integer experience;
    private Integer level;
    private String alignment;

    private AttacksResponse attacks;
    private CantripsResponse cantrips;
    private CurrencyResponse currency;
    private EquipmentsResponse equipments;
    private PassiveStatsResponse passiveStats;
    private PersonalityResponse personality;
    private SavingThrowsResponse savingThrows;
    private SkillsResponse skills;
    private SpellcastingResponse spellcasting;
    private SpellSlotsResponse spellSlots;
    private StatsResponse stats;
    private StatusResponse status;
}
