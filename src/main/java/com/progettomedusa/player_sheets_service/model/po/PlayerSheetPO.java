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
    private int experience;
    @Column (nullable = false)
    private Integer level;
    @Column (nullable = false)
    private String alignment;

    private AttacksPO attacksPO;
    private CantripsPO cantripsPO;
    private CurrencyPO currencyPO;
    private EquipmentsPO equipmentsPO;
    private PassiveStatsPO passiveStatsPO;
    private PersonalityPO personalityPO;
    private SavingThrowsPO savingThrowsPO;
    private SkillsPO skillsPO;
    private SpellcastingPO spellcastingPO;
    private SpellSlotsPO spellSlotsPO;
    private StatsPO statsPO;
    private StatusPO statusPO;

}

