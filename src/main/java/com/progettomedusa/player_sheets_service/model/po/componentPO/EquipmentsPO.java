package com.progettomedusa.player_sheets_service.model.po.componentPO;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Embeddable
public class EquipmentsPO {

    @Column
    private String equipment1;
    @Column
    private String equipment2;
    @Column
    private String equipment3;
    @Column
    private String equipment4;
    @Column
    private String equipment5;
}
