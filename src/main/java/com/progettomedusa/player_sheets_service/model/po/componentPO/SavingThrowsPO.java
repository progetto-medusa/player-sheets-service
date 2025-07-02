package com.progettomedusa.player_sheets_service.model.po.componentPO;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Data
@Embeddable
public class SavingThrowsPO {

    @Column(name="saving_throw1")
    private boolean savingThrow1;
    @Column(name="saving_throw2")
    private boolean savingThrow2;
    @Column(name="saving_throw3")
    private boolean savingThrow3;
}
