package com.progettomedusa.player_sheets_service.model.po.componentPO;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Embeddable
public class CantripsPO {

    @Column
    private String cantrip1;
    @Column
    private String cantrip2;
    @Column
    private String cantrip3;
    @Column
    private String cantrip4;
}
