package com.progettomedusa.player_sheets_service.model.po;

import com.progettomedusa.player_sheets_service.model.po.componentPO.*;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "player_sheets")
public class PlayerSheetPO {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column (nullable = false)
    private String name;
    @Column (nullable = false)
    private String race;
    @Column (name="character_class", nullable = false)
    private String characterClass;
    @Column (nullable = false)
    private String background;
    @Column (nullable = false)
    private Integer experience;
    @Column (nullable = false)
    private Integer level;
    @Column (nullable = false)
    private String alignment;

    @Embedded
    private AttacksPO attacksPO;
    @Embedded
    private CantripsPO cantripsPO;
    @Embedded
    private CurrencyPO currencyPO;
    @Embedded
    private EquipmentsPO equipmentsPO;
    @Embedded
    private PassiveStatsPO passiveStatsPO;
    @Embedded
    private PersonalityPO personalityPO;
    @Embedded
    private SavingThrowsPO savingThrowsPO;
    @Embedded
    private SkillsPO skillsPO;
    @Embedded
    private SpellcastingPO spellcastingPO;
    @Embedded
    private SpellSlotsPO spellSlotsPO;
    @Embedded
    private StatsPO statsPO;
    @Embedded
    private StatusPO statusPO;

}

