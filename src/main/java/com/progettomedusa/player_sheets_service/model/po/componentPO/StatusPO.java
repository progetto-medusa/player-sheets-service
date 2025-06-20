package com.progettomedusa.player_sheets_service.model.po.componentPO;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class StatusPO {

    @Column(name="armor_class")
    private Integer armorClass;
    @Column
    private Integer speed;
    @Column
    private Integer initiative;
    @Column(name="max_hit_points")
    private Integer maxHitPoints;
    @Column(name="current_hit_points")
    private Integer currentHitPoints;
    @Column(name="temp_hit_points")
    private Integer tempHitPoints;
    @Column(name="hit_dice")
    private String hitDice;
    @Column
    private String armor;
    @Column
    private String weapons;
    @Column
    private String tools;
    @Column
    private String languages;

}
