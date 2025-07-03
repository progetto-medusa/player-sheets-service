package com.progettomedusa.player_sheets_service.model.request.componentRequest;

import com.fasterxml.jackson.annotation.JsonProperty;
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
public class SpellSlotsRequest {

    @JsonProperty ("spell_slots1")
    private Integer spellSlots1;
    @JsonProperty ("spell_slots1_used")
    private boolean spellSlots1Used;
    @JsonProperty  ("spell_slots2")
    private Integer spellSlots2;
    @JsonProperty ("spell_slots2_used")
    private boolean spellSlots2Used;
    @JsonProperty ("spell_slots3")
    private Integer spellSlots3;
    @JsonProperty ("spell_slots3_used")
    private boolean spellSlots3Used;
    @JsonProperty ("spell_slots4")
    private Integer spellSlots4;
    @JsonProperty ("spell_slots4_used")
    private boolean spellSlots4Used;
    @JsonProperty ("spell_slots5")
    private Integer spellSlots5;
    @JsonProperty ("spell_slots5_used")
    private boolean spellSlots5Used;
    @JsonProperty ("spell_slots6")
    private Integer spellSlots6;
    @JsonProperty ("spell_slots6_used")
    private boolean spellSlots6Used;
    @JsonProperty ("spell_slots7")
    private Integer spellSlots7;
    @JsonProperty ("spell_slots7_used")
    private boolean spellSlots7Used;
    @JsonProperty ("spell_slots8")
    private Integer spellSlots8;
    @JsonProperty ("spell_slots8_used")
    private boolean spellSlots8Used;
    @JsonProperty ("spell_slots9")
    private Integer spellSlots9;
    @JsonProperty ("spell_slots9_used")
    private boolean spellSlots9Used;

}
