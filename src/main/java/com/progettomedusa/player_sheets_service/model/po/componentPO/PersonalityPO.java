package com.progettomedusa.player_sheets_service.model.po.componentPO;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Embeddable
public class PersonalityPO {

    @Column(name="personality_traits")
    private String personalityTraits;
    @Column
    private String ideals;
    @Column
    private String bonds;
    @Column
    private String flaws;
    @Column
    private String feature1;
    @Column
    private String feature2;
    @Column
    private String feature3;
    @Column
    private String notes;
    @Column
    private String backstory;
}
