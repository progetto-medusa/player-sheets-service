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
public class StatsResponse {

    @JsonProperty
    private Integer strength;
    @JsonProperty
    private Integer dexterity;
    @JsonProperty
    private Integer constitution;
    @JsonProperty
    private Integer intelligence;
    @JsonProperty
    private Integer wisdom;
    @JsonProperty
    private Integer charisma;
}
