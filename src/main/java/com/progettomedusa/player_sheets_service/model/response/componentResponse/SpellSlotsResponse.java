package com.progettomedusa.player_sheets_service.model.response.componentResponse;

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
public class SpellSlotsResponse {

    @JsonProperty
    private Integer spellSlots1;
    @JsonProperty
    private boolean spellSlots1Used;
    @JsonProperty
    private Integer spellSlots2;
    @JsonProperty
    private boolean spellSlots2Used;
    @JsonProperty
    private Integer spellSlots3;
    @JsonProperty
    private boolean spellSlots3Used;
    @JsonProperty
    private Integer spellSlots4;
    @JsonProperty
    private boolean spellSlots4Used;
    @JsonProperty
    private Integer spellSlots5;
    @JsonProperty
    private boolean spellSlots5Used;
    @JsonProperty
    private Integer spellSlots6;
    @JsonProperty
    private boolean spellSlots6Used;
    @JsonProperty
    private Integer spellSlots7;
    @JsonProperty
    private boolean spellSlots7Used;
    @JsonProperty
    private Integer spellSlots8;
    @JsonProperty
    private boolean spellSlots8Used;
    @JsonProperty
    private Integer spellSlots9;
    @JsonProperty
    private boolean spellSlots9Used;

}
