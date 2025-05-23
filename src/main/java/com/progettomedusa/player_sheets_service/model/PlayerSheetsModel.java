package com.progettomedusa.player_sheets_service.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter 
@Setter 
@NoArgsConstructor
@AllArgsConstructor

@Table(name = "player_sheets")
public class PlayerSheetsModel {

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
    private String alignment;
    @Column (nullable = false)
    private int strength;
    @Column (nullable = false)
    private int dexterity;
    @Column (nullable = false)
    private int constitution;
    @Column (nullable = false)
    private int intelligence;
    @Column (nullable = false)
    private int wisdom;
    @Column (nullable = false)
    private int charisma;
    @Column (name="proficiency_bonus", nullable = false)
    private int proficiencyBonus;
    @Column (name="passive_perception", nullable = false)
    private int passivePerception;
    @Column (nullable = false)
    private int speed;
    @Column (nullable = false)
    private int initiative;
    @Column (name="max_hit_points", nullable = false)
    private int maxHitPoints;
    @Column (name="current_hit_points")
    private int currentHitPoints;
    @Column (name="temp_hit_points")
    private int tempHitPoints;
    @Column (name="hit_dice")
    private String hitDice;
    @Column (name="spellcasting_ability")
    private String spellcastingAbility;
    @Column (name="spell_save_dc")
    private int spellSaveDC;
    @Column (name="spell_attack_bonus")
    private int spellAttackBonus;
    @Column @Lob
    private String features;
    @Column @Lob
    private String notes;

}