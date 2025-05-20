package com.progettomedusa.player_sheets_service.dto;
import jakarta.validation.constraints.Null;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.Size;
import java.util.List;

public class PlayerSheetDTO {
    @Null
    private Long id;

    @NotBlank @Size(max = 255)
    private String name;

    @NotBlank @Size(max = 20)
    private String race;

    @NotBlank @Size(max = 20)
    private String characterClass;

    @NotBlank @Size(max = 50)
    private String background;

    @NotNull @Min(0)
    private Integer experience;

    @NotBlank @Size(max = 50)
    private String alignment;

    @NotNull @Min(0)
    private Integer strength;

    @NotNull @Min(0)
    private Integer dexterity;

    @NotNull @Min(0)
    private Integer constitution;

    @NotNull @Min(0)
    private Integer intelligence;

    @NotNull @Min(0)
    private Integer wisdom;

    @NotNull @Min(0)
    private Integer charisma;

    @NotNull @Min(0)
    private Integer proficiencyBonus;

    @NotNull @Min(0)
    private Integer passivePerception;

    @NotNull @Min(0)
    private Integer speed;

    @NotNull @Min(0)
    private Integer initiative;

    @NotNull @Min(0)
    private Integer maxHitPoints;

    @NotNull @Min(0)
    private Integer currentHitPoints;

    @NotNull @Min(0)
    private Integer tempHitPoints;

    @NotBlank @Size(max = 20)
    private String hitDice;

    @Size(max = 255)
    private String spellcastingAbility;

    @NotNull @Min(0)
    private Integer spellSaveDC;

    @NotNull @Min(0)
    private Integer spellAttackBonus;

    private String features;
    private String notes;

    public PlayerSheetDTO() {
        // Default constructor
    }

    public PlayerSheetDTO(Long id,
                          String name,
                          String race,
                          String characterClass,
                          String background,
                          int experience,
                          String alignment,
                          int strength,
                          int dexterity,
                          int constitution,
                          int intelligence,
                          int wisdom,
                          int charisma,
                          int proficiencyBonus,
                          int passivePerception,
                          int speed,
                          int initiative,
                          int maxHitPoints,
                          int currentHitPoints,
                          int tempHitPoints,
                          String hitDice,
                          String spellcastingAbility,
                          int spellSaveDC,
                          int spellAttackBonus,
                          String features,
                          String notes) {
        this.id = id;
        this.name = name;
        this.race = race;
        this.characterClass = characterClass;
        this.background = background;
        this.experience = experience;
        this.alignment = alignment;
        this.strength = strength;
        this.dexterity = dexterity;
        this.constitution = constitution;
        this.intelligence = intelligence;
        this.wisdom = wisdom;
        this.charisma = charisma;
        this.proficiencyBonus = proficiencyBonus;
        this.passivePerception = passivePerception;
        this.speed = speed;
        this.initiative = initiative;
        this.maxHitPoints = maxHitPoints;
        this.currentHitPoints = currentHitPoints;
        this.tempHitPoints = tempHitPoints;
        this.hitDice = hitDice;
        this.spellcastingAbility = spellcastingAbility;
        this.spellSaveDC = spellSaveDC;
        this.spellAttackBonus = spellAttackBonus;
        this.features = features;
        this.notes = notes;
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
