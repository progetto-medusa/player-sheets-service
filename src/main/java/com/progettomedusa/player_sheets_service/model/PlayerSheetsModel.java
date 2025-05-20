package com.progettomedusa.player_sheets_service.model;

import jakarta.persistence.*;

@Entity
@Table(name = "playerSheets")
public class PlayerSheetsModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String race;
    private String characterClass;
    private String background;
    private int experience;
    private String alignment;
    private int strength;
    private int dexterity;
    private int constitution;
    private int intelligence;
    private int wisdom;
    private int charisma;
    private int proficiencyBonus;
    private int passivePerception;
    private int speed;
    private int initiative;
    private int maxHitPoints;
    private int currentHitPoints;
    private int tempHitPoints;
    private String hitDice;
    private String spellcastingAbility;
    private int spellSaveDC;
    private int spellAttackBonus;
    @Lob
    private String features;
    @Lob
    private String notes;

    public PlayerSheetsModel() {
    }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getRace() { return race; }
    public void setRace(String race) { this.race = race; }

    public String getCharacterClass() { return characterClass; }
    public void setCharacterClass(String characterClass) { this.characterClass = characterClass; }

    public String getBackground() { return background; }
    public void setBackground(String background) { this.background = background; }

    public int getExperience() { return experience; }
    public void setExperience(int experience) { this.experience = experience; }

    public String getAlignment() { return alignment; }
    public void setAlignment(String alignment) { this.alignment = alignment; }

    public int getStrength() { return strength; }
    public void setStrength(int strength) { this.strength = strength; }

    public int getDexterity() { return dexterity; }
    public void setDexterity(int dexterity) { this.dexterity = dexterity; }

    public int getConstitution() { return constitution; }
    public void setConstitution(int constitution) { this.constitution = constitution; }

    public int getIntelligence() { return intelligence; }
    public void setIntelligence(int intelligence) { this.intelligence = intelligence; }

    public int getWisdom() { return wisdom; }
    public void setWisdom(int wisdom) { this.wisdom = wisdom; }

    public int getCharisma() { return charisma; }
    public void setCharisma(int charisma) { this.charisma = charisma; }

    public int getProficiencyBonus() { return proficiencyBonus; }
    public void setProficiencyBonus(int proficiencyBonus) { this.proficiencyBonus = proficiencyBonus; }

    public int getPassivePerception() { return passivePerception; }
    public void setPassivePerception(int passivePerception) { this.passivePerception = passivePerception; }

    public int getSpeed() { return speed; }
    public void setSpeed(int speed) { this.speed = speed; }

    public int getInitiative() { return initiative; }
    public void setInitiative(int initiative) { this.initiative = initiative; }

    public int getMaxHitPoints() { return maxHitPoints; }
    public void setMaxHitPoints(int maxHitPoints) { this.maxHitPoints = maxHitPoints; }

    public int getCurrentHitPoints() { return currentHitPoints; }
    public void setCurrentHitPoints(int currentHitPoints) { this.currentHitPoints = currentHitPoints; }

    public int getTempHitPoints() { return tempHitPoints; }
    public void setTempHitPoints(int tempHitPoints) { this.tempHitPoints = tempHitPoints; }

    public String getHitDice() { return hitDice; }
    public void setHitDice(String hitDice) { this.hitDice = hitDice; }

    public String getSpellcastingAbility() { return spellcastingAbility; }
    public void setSpellcastingAbility(String spellcastingAbility) { this.spellcastingAbility = spellcastingAbility; }

    public int getSpellSaveDC() { return spellSaveDC; }
    public void setSpellSaveDC(int spellSaveDC) { this.spellSaveDC = spellSaveDC; }

    public int getSpellAttackBonus() { return spellAttackBonus; }
    public void setSpellAttackBonus(int spellAttackBonus) { this.spellAttackBonus = spellAttackBonus; }

    public String getFeatures() { return features; }
    public void setFeatures(String features) { this.features = features; }

    public String getNotes() { return notes; }
    public void setNotes(String notes) { this.notes = notes; }
}