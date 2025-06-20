package com.progettomedusa.player_sheets_service.model.dto.componentDTO;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Data
public class StatusDTO {

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
