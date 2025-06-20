package com.progettomedusa.player_sheets_service.model.response.componentResponse;

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

    private Integer armorClass;
    private Integer speed;
    private Integer initiative;
    private Integer maxHitPoints;
    private Integer currentHitPoints;
    private Integer tempHitPoints;
    private String hitDice;
    private String armor;
    private String weapons;
    private String tools;
    private String languages;

}
