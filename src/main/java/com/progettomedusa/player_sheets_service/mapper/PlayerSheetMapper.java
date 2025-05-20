package com.progettomedusa.player_sheets_service.mapper;

import com.progettomedusa.player_sheets_service.dto.PlayerSheetDTO;
import com.progettomedusa.player_sheets_service.model.PlayerSheetsModel;

import java.util.Objects;

public class PlayerSheetMapper {

    public static PlayerSheetsModel toModel(PlayerSheetDTO dto) {
        if (dto == null) return null;
        PlayerSheetsModel model = new PlayerSheetsModel();
        model.setId(dto.getId());
        model.setName(dto.getName());
        model.setRace(dto.getRace());
        model.setCharacterClass(dto.getCharacterClass());
        model.setBackground(dto.getBackground());
        model.setExperience(dto.getExperience());
        model.setAlignment(dto.getAlignment());
        model.setStrength(dto.getStrength());
        model.setDexterity(dto.getDexterity());
        model.setConstitution(dto.getConstitution());
        model.setIntelligence(dto.getIntelligence());
        model.setWisdom(dto.getWisdom());
        model.setCharisma(dto.getCharisma());
        model.setProficiencyBonus(dto.getProficiencyBonus());
        model.setPassivePerception(dto.getPassivePerception());
        model.setSpeed(dto.getSpeed());
        model.setInitiative(dto.getInitiative());
        model.setMaxHitPoints(dto.getMaxHitPoints());
        model.setCurrentHitPoints(dto.getCurrentHitPoints());
        model.setTempHitPoints(dto.getTempHitPoints());
        model.setHitDice(dto.getHitDice());
        model.setSpellcastingAbility(dto.getSpellcastingAbility());
        model.setSpellSaveDC(dto.getSpellSaveDC());
        model.setSpellAttackBonus(dto.getSpellAttackBonus());
        model.setFeatures(dto.getFeatures());
        model.setNotes(dto.getNotes());
        return model;
    }

    public static PlayerSheetDTO toDTO(PlayerSheetsModel model) {
        if (model == null) return null;
        PlayerSheetDTO dto = new PlayerSheetDTO();
        dto.setId(model.getId());
        dto.setName(model.getName());
        dto.setRace(model.getRace());
        dto.setCharacterClass(model.getCharacterClass());
        dto.setBackground(model.getBackground());
        dto.setExperience(model.getExperience());
        dto.setAlignment(model.getAlignment());
        dto.setStrength(model.getStrength());
        dto.setDexterity(model.getDexterity());
        dto.setConstitution(model.getConstitution());
        dto.setIntelligence(model.getIntelligence());
        dto.setWisdom(model.getWisdom());
        dto.setCharisma(model.getCharisma());
        dto.setProficiencyBonus(model.getProficiencyBonus());
        dto.setPassivePerception(model.getPassivePerception());
        dto.setSpeed(model.getSpeed());
        dto.setInitiative(model.getInitiative());
        dto.setMaxHitPoints(model.getMaxHitPoints());
        dto.setCurrentHitPoints(model.getCurrentHitPoints());
        dto.setTempHitPoints(model.getTempHitPoints());
        dto.setHitDice(model.getHitDice());
        dto.setSpellcastingAbility(model.getSpellcastingAbility());
        dto.setSpellSaveDC(model.getSpellSaveDC());
        dto.setSpellAttackBonus(model.getSpellAttackBonus());
        dto.setFeatures(model.getFeatures());
        dto.setNotes(model.getNotes());
        return dto;
    }
}
