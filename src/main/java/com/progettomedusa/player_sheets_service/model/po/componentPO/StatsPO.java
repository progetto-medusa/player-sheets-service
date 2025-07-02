package com.progettomedusa.player_sheets_service.model.po.componentPO;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Embeddable
public class StatsPO {

    @Column
    private Integer strength;
    @Column
    private Integer dexterity;
    @Column
    private Integer constitution;
    @Column
    private Integer intelligence;
    @Column
    private Integer wisdom;
    @Column
    private Integer charisma;
}
