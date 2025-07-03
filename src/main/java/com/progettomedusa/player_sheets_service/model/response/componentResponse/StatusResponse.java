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
public class StatusResponse {

    @JsonProperty ("armor_class")
    private Integer armorClass;
    @JsonProperty
    private Integer speed;
    @JsonProperty
    private Integer initiative;
    @JsonProperty ("max_hit_points")
    private Integer maxHitPoints;
    @JsonProperty ("current_hit_points")
    private Integer currentHitPoints;
    @JsonProperty ("temp_hit_points")
    private Integer tempHitPoints;
    @JsonProperty ("hit_dice")
    private String hitDice;
    @JsonProperty
    private String armor;
    @JsonProperty
    private String weapons;
    @JsonProperty
    private String tools;
    @JsonProperty
    private String languages;

}
