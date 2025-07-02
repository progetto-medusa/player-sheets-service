package com.progettomedusa.player_sheets_service.model.po.componentPO;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Embeddable
public class SkillsPO {


        @Column
    private Integer acrobatics; //(Dex)
        @Column(name="animal_handling")
    private Integer animalHandling; //(Wis)
        @Column
    private Integer arcana; //(Int)
        @Column
    private Integer athletics; //(Str)
        @Column
    private Integer deception; //(Cha)
        @Column
    private Integer history; //(Int)
        @Column
    private Integer insight; //(Wis)
        @Column
    private Integer intimidation; //(Cha)
        @Column
    private Integer investigation; //(Int)
        @Column
    private Integer medicine; //(Wis)
        @Column
    private Integer nature; //(Int)
        @Column
    private Integer perception; //(Wis)
        @Column
    private Integer performance; //(Cha)
        @Column
    private Integer persuasion; //(Cha)
        @Column
    private Integer religion; //(Int)
        @Column(name="sight_of_hands")
    private Integer sightOfHand; //(Dex)
        @Column
    private Integer stealth; //(Dex)
        @Column
    private Integer survival; //(Wis)
}
