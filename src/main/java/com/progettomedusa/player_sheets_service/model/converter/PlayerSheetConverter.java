package com.progettomedusa.player_sheets_service.model.converter;

import com.progettomedusa.player_sheets_service.config.PlayerSheetsApplicationProperties;
import com.progettomedusa.player_sheets_service.model.dto.PlayerSheetDTO;
import com.progettomedusa.player_sheets_service.model.po.PlayerSheetPO;
import com.progettomedusa.player_sheets_service.model.dto.componentDTO.*;
import com.progettomedusa.player_sheets_service.model.po.componentPO.*;
import com.progettomedusa.player_sheets_service.model.request.*;
import com.progettomedusa.player_sheets_service.model.response.*;
import com.progettomedusa.player_sheets_service.model.request.componentRequest.*;
import com.progettomedusa.player_sheets_service.model.response.componentResponse.*;
import com.progettomedusa.player_sheets_service.util.Tools;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

import static com.progettomedusa.player_sheets_service.util.Constants.*;

@Slf4j
@Component
@RequiredArgsConstructor
public class PlayerSheetConverter {

    private final Tools tools;
    private final PlayerSheetsApplicationProperties playerSheetsApplicationProperties;


    public CreatePlayerSheetRequestResponse createPlayerSheetRequestResponse(PlayerSheetPO playerSheetPO) {
        CreatePlayerSheetRequestResponse createPlayerSheetRequestResponse = new CreatePlayerSheetRequestResponse();
        createPlayerSheetRequestResponse.setMessage("Creation done");
        createPlayerSheetRequestResponse.setDomain(playerSheetsApplicationProperties.getName());
        createPlayerSheetRequestResponse.setTimestamp(tools.getInstant());

        createPlayerSheetRequestResponse.setName(playerSheetPO.getName());
        createPlayerSheetRequestResponse.setRace(playerSheetPO.getRace());
        createPlayerSheetRequestResponse.setCharacterClass(playerSheetPO.getCharacterClass());
        createPlayerSheetRequestResponse.setBackground(playerSheetPO.getBackground());
        createPlayerSheetRequestResponse.setExperience(playerSheetPO.getExperience());
        createPlayerSheetRequestResponse.setLevel(playerSheetPO.getLevel());
        createPlayerSheetRequestResponse.setAlignment(playerSheetPO.getAlignment());

        createPlayerSheetRequestResponse.setStats(new StatsResponse(
                playerSheetPO.getStatsPO().getStrength(), playerSheetPO.getStatsPO().getDexterity(),
                playerSheetPO.getStatsPO().getConstitution(), playerSheetPO.getStatsPO().getIntelligence(),
                playerSheetPO.getStatsPO().getWisdom(), playerSheetPO.getStatsPO().getCharisma()
        ));
        createPlayerSheetRequestResponse.setStatus(new StatusResponse(
                playerSheetPO.getStatusPO().getArmorClass(), playerSheetPO.getStatusPO().getSpeed(),
                playerSheetPO.getStatusPO().getInitiative(), playerSheetPO.getStatusPO().getMaxHitPoints(),
                playerSheetPO.getStatusPO().getCurrentHitPoints(), playerSheetPO.getStatusPO().getTempHitPoints(),
                playerSheetPO.getStatusPO().getHitDice(), playerSheetPO.getStatusPO().getArmor(),
                playerSheetPO.getStatusPO().getWeapons(), playerSheetPO.getStatusPO().getTools(),
                playerSheetPO.getStatusPO().getLanguages()
        ));
        createPlayerSheetRequestResponse.setSkills(new SkillsResponse(
                playerSheetPO.getSkillsPO().getAcrobatics(), playerSheetPO.getSkillsPO().getAnimalHandling(), playerSheetPO.getSkillsPO().getArcana(),
                playerSheetPO.getSkillsPO().getAthletics(),playerSheetPO.getSkillsPO().getDeception(), playerSheetPO.getSkillsPO().getHistory(),
                playerSheetPO.getSkillsPO().getInsight(), playerSheetPO.getSkillsPO().getIntimidation(), playerSheetPO.getSkillsPO().getInvestigation(),
                playerSheetPO.getSkillsPO().getMedicine(), playerSheetPO.getSkillsPO().getNature(), playerSheetPO.getSkillsPO().getPerception(),
                playerSheetPO.getSkillsPO().getPerformance(), playerSheetPO.getSkillsPO().getPersuasion(), playerSheetPO.getSkillsPO().getReligion(),
                playerSheetPO.getSkillsPO().getSightOfHand(), playerSheetPO.getSkillsPO().getStealth(), playerSheetPO.getSkillsPO().getSurvival()
        ));
        createPlayerSheetRequestResponse.setSavingThrows(new SavingThrowsResponse(
                playerSheetPO.getSavingThrowsPO().isSavingThrow1(), playerSheetPO.getSavingThrowsPO().isSavingThrow2(),
                playerSheetPO.getSavingThrowsPO().isSavingThrow3()
        ));
        createPlayerSheetRequestResponse.setAttacks(new AttacksResponse(
                playerSheetPO.getAttacksPO().getAttack1Name(), playerSheetPO.getAttacksPO().getAttack1Bonus(), playerSheetPO.getAttacksPO().getAttack1Damage(),
                playerSheetPO.getAttacksPO().getAttack2Name(), playerSheetPO.getAttacksPO().getAttack2Bonus(), playerSheetPO.getAttacksPO().getAttack2Damage(),
                playerSheetPO.getAttacksPO().getAttack3Name(), playerSheetPO.getAttacksPO().getAttack3Bonus(), playerSheetPO.getAttacksPO().getAttack3Damage()
        ));
        createPlayerSheetRequestResponse.setCantrips(new CantripsResponse(
                playerSheetPO.getCantripsPO().getCantrip1(), playerSheetPO.getCantripsPO().getCantrip2(),
                playerSheetPO.getCantripsPO().getCantrip3(), playerSheetPO.getCantripsPO().getCantrip4()
        ));
        createPlayerSheetRequestResponse.setSpellcasting(new SpellcastingResponse(
                playerSheetPO.getSpellcastingPO().getSpellcastingClass(), playerSheetPO.getSpellcastingPO().getSpellcastingAbility(),
                playerSheetPO.getSpellcastingPO().getSpellSaveDC(), playerSheetPO.getSpellcastingPO().getSpellAttackBonus()
        ));
        createPlayerSheetRequestResponse.setSpellSlots(new SpellSlotsResponse(
                playerSheetPO.getSpellSlotsPO().getSpellSlots1(), playerSheetPO.getSpellSlotsPO().isSpellSlots1Used(),
                playerSheetPO.getSpellSlotsPO().getSpellSlots2(), playerSheetPO.getSpellSlotsPO().isSpellSlots2Used(),
                playerSheetPO.getSpellSlotsPO().getSpellSlots3(), playerSheetPO.getSpellSlotsPO().isSpellSlots3Used(),
                playerSheetPO.getSpellSlotsPO().getSpellSlots4(), playerSheetPO.getSpellSlotsPO().isSpellSlots4Used(),
                playerSheetPO.getSpellSlotsPO().getSpellSlots5(), playerSheetPO.getSpellSlotsPO().isSpellSlots5Used(),
                playerSheetPO.getSpellSlotsPO().getSpellSlots6(), playerSheetPO.getSpellSlotsPO().isSpellSlots6Used(),
                playerSheetPO.getSpellSlotsPO().getSpellSlots7(), playerSheetPO.getSpellSlotsPO().isSpellSlots7Used(),
                playerSheetPO.getSpellSlotsPO().getSpellSlots8(), playerSheetPO.getSpellSlotsPO().isSpellSlots8Used(),
                playerSheetPO.getSpellSlotsPO().getSpellSlots9(), playerSheetPO.getSpellSlotsPO().isSpellSlots9Used()
        ));
        createPlayerSheetRequestResponse.setCurrency(new CurrencyResponse(
                playerSheetPO.getCurrencyPO().getCopperCurrency(), playerSheetPO.getCurrencyPO().getBronzeCurrency(),
                playerSheetPO.getCurrencyPO().getSilverCurrency(), playerSheetPO.getCurrencyPO().getGoldCurrency(),
                playerSheetPO.getCurrencyPO().getPlatinumCurrency()
        ));
        createPlayerSheetRequestResponse.setEquipments(new EquipmentsResponse(
                playerSheetPO.getEquipmentsPO().getEquipment1(), playerSheetPO.getEquipmentsPO().getEquipment2(),
                playerSheetPO.getEquipmentsPO().getEquipment3(), playerSheetPO.getEquipmentsPO().getEquipment4(),
                playerSheetPO.getEquipmentsPO().getEquipment5()
        ));
        createPlayerSheetRequestResponse.setPassiveStats(new PassiveStatsResponse(
                playerSheetPO.getPassiveStatsPO().getInspiration(), playerSheetPO.getPassiveStatsPO().getProficiencyBonus(),
                playerSheetPO.getPassiveStatsPO().getPassivePerception()
        ));
        createPlayerSheetRequestResponse.setPersonality(new PersonalityResponse(
                playerSheetPO.getPersonalityPO().getPersonalityTraits(), playerSheetPO.getPersonalityPO().getIdeals(),
                playerSheetPO.getPersonalityPO().getBonds(), playerSheetPO.getPersonalityPO().getFlaws(),
                playerSheetPO.getPersonalityPO().getFeature1(), playerSheetPO.getPersonalityPO().getFeature2(),
                playerSheetPO.getPersonalityPO().getFeature3(), playerSheetPO.getPersonalityPO().getNotes(),
                playerSheetPO.getPersonalityPO().getBackstory()
        ));
        log.info("UserConverter - createPlayerSheetRequestResponse END with response -> {}", createPlayerSheetRequestResponse);
        return createPlayerSheetRequestResponse;}




    public CreatePlayerSheetRequestResponse createPlayerSheetRequestResponse(Exception e){
        CreatePlayerSheetRequestResponse createPlayerSheetRequestResponse = new CreatePlayerSheetRequestResponse();
        createPlayerSheetRequestResponse.setMessage(e.getMessage());
        createPlayerSheetRequestResponse.setDomain(playerSheetsApplicationProperties.getName());
        createPlayerSheetRequestResponse.setTimestamp(tools.getInstant());
        createPlayerSheetRequestResponse.setDetailed(BASE_ERROR_DETAILS);
        log.info("PlayerSheetConverter - createPlayerSheetRequestResponse END with createPlayerSheetRequestResponse -> {}", createPlayerSheetRequestResponse);
        return createPlayerSheetRequestResponse;
    }

    public PlayerSheetPO dtoToPo(PlayerSheetDTO playerSheetDTO) {
        PlayerSheetPO playerSheetPO = new PlayerSheetPO();
        if(playerSheetPO.getId() != null){
            playerSheetPO.setId(Long.valueOf(playerSheetPO.getId()));
        }
        CreatePlayerSheetRequestResponse createPlayerSheetRequestResponse = new CreatePlayerSheetRequestResponse();
        createPlayerSheetRequestResponse.setMessage("Creation done");
        createPlayerSheetRequestResponse.setDomain(playerSheetsApplicationProperties.getName());
        createPlayerSheetRequestResponse.setTimestamp(tools.getInstant());
        playerSheetPO.setName(playerSheetDTO.getName());
        playerSheetPO.setRace(playerSheetDTO.getRace());
        playerSheetPO.setCharacterClass(playerSheetDTO.getCharacterClass());
        playerSheetPO.setBackground(playerSheetDTO.getBackground());
        playerSheetPO.setExperience(playerSheetDTO.getExperience());
        playerSheetPO.setLevel(playerSheetDTO.getLevel());
        playerSheetPO.setAlignment(playerSheetDTO.getAlignment());
        playerSheetPO.setName(playerSheetPO.getName());
        playerSheetPO.setRace(playerSheetPO.getRace());
        playerSheetPO.setCharacterClass(playerSheetPO.getCharacterClass());
        playerSheetPO.setBackground(playerSheetPO.getBackground());
        playerSheetPO.setExperience(playerSheetPO.getExperience());
        playerSheetPO.setLevel(playerSheetPO.getLevel());
        playerSheetPO.setAlignment(playerSheetPO.getAlignment());

        playerSheetPO.setStatsPO(new StatsPO(
                playerSheetDTO.getStatsDTO().getStrength(), playerSheetDTO.getStatsDTO().getDexterity(),
                playerSheetDTO.getStatsDTO().getConstitution(), playerSheetDTO.getStatsDTO().getIntelligence(),
                playerSheetDTO.getStatsDTO().getWisdom(), playerSheetDTO.getStatsDTO().getCharisma()
        ));
        playerSheetPO.setStatusPO(new StatusPO(
                playerSheetDTO.getStatusDTO().getArmorClass(), playerSheetDTO.getStatusDTO().getSpeed(),
                playerSheetDTO.getStatusDTO().getInitiative(), playerSheetDTO.getStatusDTO().getMaxHitPoints(),
                playerSheetDTO.getStatusDTO().getCurrentHitPoints(), playerSheetDTO.getStatusDTO().getTempHitPoints(),
                playerSheetDTO.getStatusDTO().getHitDice(), playerSheetDTO.getStatusDTO().getArmor(),
                playerSheetDTO.getStatusDTO().getWeapons(), playerSheetDTO.getStatusDTO().getTools(),
                playerSheetDTO.getStatusDTO().getLanguages()
        ));
        playerSheetPO.setSkillsPO(new SkillsPO(
                playerSheetDTO.getSkillsDTO().getAcrobatics(), playerSheetDTO.getSkillsDTO().getAnimalHandling(), playerSheetDTO.getSkillsDTO().getArcana(),
                playerSheetDTO.getSkillsDTO().getAthletics(),playerSheetDTO.getSkillsDTO().getDeception(), playerSheetDTO.getSkillsDTO().getHistory(),
               playerSheetDTO.getSkillsDTO().getInsight(), playerSheetDTO.getSkillsDTO().getIntimidation(), playerSheetDTO.getSkillsDTO().getInvestigation(),
                playerSheetDTO.getSkillsDTO().getMedicine(), playerSheetDTO.getSkillsDTO().getNature(), playerSheetDTO.getSkillsDTO().getPerception(),
                playerSheetDTO.getSkillsDTO().getPerformance(), playerSheetDTO.getSkillsDTO().getPersuasion(), playerSheetDTO.getSkillsDTO().getReligion(),
                playerSheetDTO.getSkillsDTO().getSightOfHand(), playerSheetDTO.getSkillsDTO().getStealth(), playerSheetDTO.getSkillsDTO().getSurvival()
        ));
        playerSheetPO.setSavingThrowsPO(new SavingThrowsPO(
                playerSheetDTO.getSavingThrowsDTO().isSavingThrow1(), playerSheetDTO.getSavingThrowsDTO().isSavingThrow2(),
                playerSheetDTO.getSavingThrowsDTO().isSavingThrow3()
        ));
        playerSheetPO.setAttacksPO(new AttacksPO(
                playerSheetDTO.getAttacksDTO().getAttack1Name(), playerSheetDTO.getAttacksDTO().getAttack1Bonus(), playerSheetDTO.getAttacksDTO().getAttack1Damage(),
                playerSheetDTO.getAttacksDTO().getAttack2Name(), playerSheetDTO.getAttacksDTO().getAttack2Bonus(), playerSheetDTO.getAttacksDTO().getAttack2Damage(),
                playerSheetDTO.getAttacksDTO().getAttack3Name(), playerSheetDTO.getAttacksDTO().getAttack3Bonus(), playerSheetDTO.getAttacksDTO().getAttack3Damage()
        ));
        playerSheetPO.setCantripsPO(new CantripsPO(
                playerSheetDTO.getCantripsDTO().getCantrip1(), playerSheetDTO.getCantripsDTO().getCantrip2(),
                playerSheetDTO.getCantripsDTO().getCantrip3(), playerSheetDTO.getCantripsDTO().getCantrip4()
        ));
        playerSheetPO.setSpellcastingPO(new SpellcastingPO(
                playerSheetDTO.getSpellcastingDTO().getSpellcastingClass(), playerSheetDTO.getSpellcastingDTO().getSpellcastingAbility(),
                playerSheetDTO.getSpellcastingDTO().getSpellSaveDC(), playerSheetDTO.getSpellcastingDTO().getSpellAttackBonus()
        ));
        playerSheetPO.setSpellSlotsPO(new SpellSlotsPO(
                playerSheetDTO.getSpellSlotsDTO().getSpellSlots1(), playerSheetDTO.getSpellSlotsDTO().isSpellSlots1Used(),
                playerSheetDTO.getSpellSlotsDTO().getSpellSlots2(), playerSheetDTO.getSpellSlotsDTO().isSpellSlots2Used(),
                playerSheetDTO.getSpellSlotsDTO().getSpellSlots3(), playerSheetDTO.getSpellSlotsDTO().isSpellSlots3Used(),
                playerSheetDTO.getSpellSlotsDTO().getSpellSlots4(), playerSheetDTO.getSpellSlotsDTO().isSpellSlots4Used(),
                playerSheetDTO.getSpellSlotsDTO().getSpellSlots5(), playerSheetDTO.getSpellSlotsDTO().isSpellSlots5Used(),
                playerSheetDTO.getSpellSlotsDTO().getSpellSlots6(), playerSheetDTO.getSpellSlotsDTO().isSpellSlots6Used(),
                playerSheetDTO.getSpellSlotsDTO().getSpellSlots7(), playerSheetDTO.getSpellSlotsDTO().isSpellSlots7Used(),
                playerSheetDTO.getSpellSlotsDTO().getSpellSlots8(), playerSheetDTO.getSpellSlotsDTO().isSpellSlots8Used(),
                playerSheetDTO.getSpellSlotsDTO().getSpellSlots9(), playerSheetDTO.getSpellSlotsDTO().isSpellSlots9Used()
        ));
        playerSheetPO.setCurrencyPO(new CurrencyPO(
                playerSheetDTO.getCurrencyDTO().getCopperCurrency(), playerSheetDTO.getCurrencyDTO().getBronzeCurrency(),
                playerSheetDTO.getCurrencyDTO().getSilverCurrency(), playerSheetDTO.getCurrencyDTO().getGoldCurrency(),
                playerSheetDTO.getCurrencyDTO().getPlatinumCurrency()
        ));
        playerSheetPO.setEquipmentsPO(new EquipmentsPO(
                playerSheetDTO.getEquipmentsDTO().getEquipment1(), playerSheetDTO.getEquipmentsDTO().getEquipment2(),
                playerSheetDTO.getEquipmentsDTO().getEquipment3(), playerSheetDTO.getEquipmentsDTO().getEquipment4(),
                playerSheetDTO.getEquipmentsDTO().getEquipment5()
        ));
        playerSheetPO.setPassiveStatsPO(new PassiveStatsPO(
                playerSheetDTO.getPassiveStatsDTO().getInspiration(), playerSheetDTO.getPassiveStatsDTO().getProficiencyBonus(),
                playerSheetDTO.getPassiveStatsDTO().getPassivePerception()
        ));
        playerSheetPO.setPersonalityPO(new PersonalityPO(
                playerSheetDTO.getPersonalityDTO().getPersonalityTraits(), playerSheetDTO.getPersonalityDTO().getIdeals(),
                playerSheetDTO.getPersonalityDTO().getBonds(), playerSheetDTO.getPersonalityDTO().getFlaws(),
                playerSheetDTO.getPersonalityDTO().getFeature1(), playerSheetDTO.getPersonalityDTO().getFeature2(),
                playerSheetDTO.getPersonalityDTO().getFeature3(), playerSheetDTO.getPersonalityDTO().getNotes(),
                playerSheetDTO.getPersonalityDTO().getBackstory()
        ));
        log.info("PlayerSheetConverter - createPlayerSheetRequestToUserDTO END with PO -> {}", playerSheetPO);
        return playerSheetPO;
    }


    public GetPlayerSheetsResponse listOfPlayerSheetsGetPlayerSheetsResponse(List<PlayerSheetPO> sheetList){
        GetPlayerSheetsResponse getPlayerSheetsResponse = new GetPlayerSheetsResponse();

        List<GetPlayerSheetResponse> getPlayerSheetResponseList = new ArrayList<>();

        for (PlayerSheetPO sheet : sheetList) {
            GetPlayerSheetResponse getPlayerSheetResponse = playerSheetPoToGetPlayerSheetResponse(sheet, true);
            getPlayerSheetResponseList.add(getPlayerSheetResponse);
        }

        getPlayerSheetsResponse.setPlayerSheets(getPlayerSheetResponseList);
        getPlayerSheetsResponse.setDomain(playerSheetsApplicationProperties.getName());
        getPlayerSheetsResponse.setTimestamp(tools.getInstant());

        log.info("UserConverter - listOfPlayerSheetsResponse END with response -> {}", getPlayerSheetsResponse);
        return getPlayerSheetsResponse;
    }

    public GetPlayerSheetResponse playerSheetPoToGetPlayerSheetResponse(PlayerSheetPO playerSheetPO, boolean internal){
        GetPlayerSheetResponse getPlayerSheetResponse = new GetPlayerSheetResponse();

        PlayerSheetResponse playerSheetResponse = new PlayerSheetResponse();
        playerSheetResponse.setId(playerSheetPO.getId());
        playerSheetResponse.setName(playerSheetPO.getName());
        playerSheetResponse.setRace(playerSheetPO.getRace());
        playerSheetResponse.setCharacterClass(playerSheetPO.getCharacterClass());
        playerSheetResponse.setBackground(playerSheetPO.getBackground());
        playerSheetResponse.setExperience(playerSheetPO.getExperience());
        playerSheetResponse.setLevel(playerSheetPO.getLevel());
        playerSheetResponse.setAlignment(playerSheetPO.getAlignment());

        playerSheetResponse.setStats(new StatsResponse(
                playerSheetPO.getStatsPO().getStrength(), playerSheetPO.getStatsPO().getDexterity(),
                playerSheetPO.getStatsPO().getConstitution(), playerSheetPO.getStatsPO().getIntelligence(),
                playerSheetPO.getStatsPO().getWisdom(), playerSheetPO.getStatsPO().getCharisma()
        ));
        playerSheetResponse.setStatus(new StatusResponse(
                playerSheetPO.getStatusPO().getArmorClass(), playerSheetPO.getStatusPO().getSpeed(),
                playerSheetPO.getStatusPO().getInitiative(), playerSheetPO.getStatusPO().getMaxHitPoints(),
                playerSheetPO.getStatusPO().getCurrentHitPoints(), playerSheetPO.getStatusPO().getTempHitPoints(),
                playerSheetPO.getStatusPO().getHitDice(), playerSheetPO.getStatusPO().getArmor(),
                playerSheetPO.getStatusPO().getWeapons(), playerSheetPO.getStatusPO().getTools(),
                playerSheetPO.getStatusPO().getLanguages()
        ));
        playerSheetResponse.setSkills(new SkillsResponse(
                playerSheetPO.getSkillsPO().getAcrobatics(), playerSheetPO.getSkillsPO().getAnimalHandling(), playerSheetPO.getSkillsPO().getArcana(),
                playerSheetPO.getSkillsPO().getAthletics(),playerSheetPO.getSkillsPO().getDeception(), playerSheetPO.getSkillsPO().getHistory(),
                playerSheetPO.getSkillsPO().getInsight(), playerSheetPO.getSkillsPO().getIntimidation(), playerSheetPO.getSkillsPO().getInvestigation(),
                playerSheetPO.getSkillsPO().getMedicine(), playerSheetPO.getSkillsPO().getNature(), playerSheetPO.getSkillsPO().getPerception(),
                playerSheetPO.getSkillsPO().getPerformance(), playerSheetPO.getSkillsPO().getPersuasion(), playerSheetPO.getSkillsPO().getReligion(),
                playerSheetPO.getSkillsPO().getSightOfHand(), playerSheetPO.getSkillsPO().getStealth(), playerSheetPO.getSkillsPO().getSurvival()
        ));
        playerSheetResponse.setSavingThrows(new SavingThrowsResponse(
                playerSheetPO.getSavingThrowsPO().isSavingThrow1(), playerSheetPO.getSavingThrowsPO().isSavingThrow2(),
                playerSheetPO.getSavingThrowsPO().isSavingThrow3()
        ));
        playerSheetResponse.setAttacks(new AttacksResponse(
                playerSheetPO.getAttacksPO().getAttack1Name(), playerSheetPO.getAttacksPO().getAttack1Bonus(), playerSheetPO.getAttacksPO().getAttack1Damage(),
                playerSheetPO.getAttacksPO().getAttack2Name(), playerSheetPO.getAttacksPO().getAttack2Bonus(), playerSheetPO.getAttacksPO().getAttack2Damage(),
                playerSheetPO.getAttacksPO().getAttack3Name(), playerSheetPO.getAttacksPO().getAttack3Bonus(), playerSheetPO.getAttacksPO().getAttack3Damage()
        ));
        playerSheetResponse.setCantrips(new CantripsResponse(
                playerSheetPO.getCantripsPO().getCantrip1(), playerSheetPO.getCantripsPO().getCantrip2(),
                playerSheetPO.getCantripsPO().getCantrip3(), playerSheetPO.getCantripsPO().getCantrip4()
        ));
        playerSheetResponse.setSpellcasting(new SpellcastingResponse(
                playerSheetPO.getSpellcastingPO().getSpellcastingClass(), playerSheetPO.getSpellcastingPO().getSpellcastingAbility(),
                playerSheetPO.getSpellcastingPO().getSpellSaveDC(), playerSheetPO.getSpellcastingPO().getSpellAttackBonus()
        ));
        playerSheetResponse.setSpellSlots(new SpellSlotsResponse(
                playerSheetPO.getSpellSlotsPO().getSpellSlots1(), playerSheetPO.getSpellSlotsPO().isSpellSlots1Used(),
                playerSheetPO.getSpellSlotsPO().getSpellSlots2(), playerSheetPO.getSpellSlotsPO().isSpellSlots2Used(),
                playerSheetPO.getSpellSlotsPO().getSpellSlots3(), playerSheetPO.getSpellSlotsPO().isSpellSlots3Used(),
                playerSheetPO.getSpellSlotsPO().getSpellSlots4(), playerSheetPO.getSpellSlotsPO().isSpellSlots4Used(),
                playerSheetPO.getSpellSlotsPO().getSpellSlots5(), playerSheetPO.getSpellSlotsPO().isSpellSlots5Used(),
                playerSheetPO.getSpellSlotsPO().getSpellSlots6(), playerSheetPO.getSpellSlotsPO().isSpellSlots6Used(),
                playerSheetPO.getSpellSlotsPO().getSpellSlots7(), playerSheetPO.getSpellSlotsPO().isSpellSlots7Used(),
                playerSheetPO.getSpellSlotsPO().getSpellSlots8(), playerSheetPO.getSpellSlotsPO().isSpellSlots8Used(),
                playerSheetPO.getSpellSlotsPO().getSpellSlots9(), playerSheetPO.getSpellSlotsPO().isSpellSlots9Used()
        ));
        playerSheetResponse.setCurrency(new CurrencyResponse(
                playerSheetPO.getCurrencyPO().getCopperCurrency(), playerSheetPO.getCurrencyPO().getBronzeCurrency(),
                playerSheetPO.getCurrencyPO().getSilverCurrency(), playerSheetPO.getCurrencyPO().getGoldCurrency(),
                playerSheetPO.getCurrencyPO().getPlatinumCurrency()
        ));
        playerSheetResponse.setEquipments(new EquipmentsResponse(
                playerSheetPO.getEquipmentsPO().getEquipment1(), playerSheetPO.getEquipmentsPO().getEquipment2(),
                playerSheetPO.getEquipmentsPO().getEquipment3(), playerSheetPO.getEquipmentsPO().getEquipment4(),
                playerSheetPO.getEquipmentsPO().getEquipment5()
        ));
        playerSheetResponse.setPassiveStats(new PassiveStatsResponse(
                playerSheetPO.getPassiveStatsPO().getInspiration(), playerSheetPO.getPassiveStatsPO().getProficiencyBonus(),
                playerSheetPO.getPassiveStatsPO().getPassivePerception()
        ));
        playerSheetResponse.setPersonality(new PersonalityResponse(
                playerSheetPO.getPersonalityPO().getPersonalityTraits(), playerSheetPO.getPersonalityPO().getIdeals(),
                playerSheetPO.getPersonalityPO().getBonds(), playerSheetPO.getPersonalityPO().getFlaws(),
                playerSheetPO.getPersonalityPO().getFeature1(), playerSheetPO.getPersonalityPO().getFeature2(),
                playerSheetPO.getPersonalityPO().getFeature3(), playerSheetPO.getPersonalityPO().getNotes(),
                playerSheetPO.getPersonalityPO().getBackstory()
        ));

        getPlayerSheetResponse.setSheet(playerSheetResponse);
        if(!internal) {
            getPlayerSheetResponse.setDomain(playerSheetsApplicationProperties.getName());
            getPlayerSheetResponse.setTimestamp(tools.getInstant());
        }
        log.info("UserConverter - userPoToGetUserResponse END with response -> {}", getPlayerSheetResponse);
        return getPlayerSheetResponse;
    }

    public GetPlayerSheetResponse getPlayerSheetResponse(){
        GetPlayerSheetResponse getPlayerSheetResponse = new GetPlayerSheetResponse();
        getPlayerSheetResponse.setSheet(new PlayerSheetResponse());
        getPlayerSheetResponse.setMessage(PLAYER_SHEET_NOT_FOUND_MESSAGE);
        getPlayerSheetResponse.setDomain(playerSheetsApplicationProperties.getName());
        getPlayerSheetResponse.setTimestamp(tools.getInstant());
        log.info("UserConverter - getUserResponse END with getUserResponse -> {}", getPlayerSheetResponse);
        return getPlayerSheetResponse;
    }

    public PlayerSheetDTO updatePlayerSheetRequestToDto(UpdatePlayerSheetRequest updatePlayerSheetRequest){
        PlayerSheetDTO playerSheetDTO = new PlayerSheetDTO();
        playerSheetDTO.setId(updatePlayerSheetRequest.getId());
        playerSheetDTO.setName(updatePlayerSheetRequest.getName());
        playerSheetDTO.setRace(updatePlayerSheetRequest.getRace());
        playerSheetDTO.setCharacterClass(updatePlayerSheetRequest.getCharacterClass());
        playerSheetDTO.setBackground(updatePlayerSheetRequest.getBackground());
        playerSheetDTO.setExperience(updatePlayerSheetRequest.getExperience());
        playerSheetDTO.setLevel(updatePlayerSheetRequest.getLevel());
        playerSheetDTO.setAlignment(updatePlayerSheetRequest.getAlignment());
        playerSheetDTO.setStatsDTO(new StatsDTO(
                updatePlayerSheetRequest.getStats().getStrength(), updatePlayerSheetRequest.getStats().getDexterity(),
                updatePlayerSheetRequest.getStats().getConstitution(), updatePlayerSheetRequest.getStats().getIntelligence(),
                updatePlayerSheetRequest.getStats().getWisdom(), updatePlayerSheetRequest.getStats().getCharisma()
        ));
        playerSheetDTO.setStatusDTO(new StatusDTO(
                updatePlayerSheetRequest.getStatus().getArmorClass(), updatePlayerSheetRequest.getStatus().getSpeed(),
                updatePlayerSheetRequest.getStatus().getInitiative(), updatePlayerSheetRequest.getStatus().getMaxHitPoints(),
                updatePlayerSheetRequest.getStatus().getCurrentHitPoints(), updatePlayerSheetRequest.getStatus().getTempHitPoints(),
                updatePlayerSheetRequest.getStatus().getHitDice(), updatePlayerSheetRequest.getStatus().getArmor(),
                updatePlayerSheetRequest.getStatus().getWeapons(), updatePlayerSheetRequest.getStatus().getTools(),
                updatePlayerSheetRequest.getStatus().getLanguages()
        ));
        playerSheetDTO.setSkillsDTO(new SkillsDTO(
                updatePlayerSheetRequest.getSkills().getAcrobatics(), updatePlayerSheetRequest.getSkills().getAnimalHandling(), updatePlayerSheetRequest.getSkills().getArcana(),
                updatePlayerSheetRequest.getSkills().getAthletics(),updatePlayerSheetRequest.getSkills().getDeception(), updatePlayerSheetRequest.getSkills().getHistory(),
                updatePlayerSheetRequest.getSkills().getInsight(), updatePlayerSheetRequest.getSkills().getIntimidation(), updatePlayerSheetRequest.getSkills().getInvestigation(),
                updatePlayerSheetRequest.getSkills().getMedicine(), updatePlayerSheetRequest.getSkills().getNature(), updatePlayerSheetRequest.getSkills().getPerception(),
                updatePlayerSheetRequest.getSkills().getPerformance(), updatePlayerSheetRequest.getSkills().getPersuasion(), updatePlayerSheetRequest.getSkills().getReligion(),
                updatePlayerSheetRequest.getSkills().getSightOfHand(), updatePlayerSheetRequest.getSkills().getStealth(), updatePlayerSheetRequest.getSkills().getSurvival()
        ));
        playerSheetDTO.setSavingThrowsDTO(new SavingThrowsDTO(
                updatePlayerSheetRequest.getSavingThrows().isSavingThrow1(), updatePlayerSheetRequest.getSavingThrows().isSavingThrow2(),
                updatePlayerSheetRequest.getSavingThrows().isSavingThrow3()
        ));
        playerSheetDTO.setAttacksDTO(new AttacksDTO(
                updatePlayerSheetRequest.getAttacks().getAttack1Name(), updatePlayerSheetRequest.getAttacks().getAttack1Bonus(), updatePlayerSheetRequest.getAttacks().getAttack1Damage(),
                updatePlayerSheetRequest.getAttacks().getAttack2Name(), updatePlayerSheetRequest.getAttacks().getAttack2Bonus(), updatePlayerSheetRequest.getAttacks().getAttack2Damage(),
                updatePlayerSheetRequest.getAttacks().getAttack3Name(), updatePlayerSheetRequest.getAttacks().getAttack3Bonus(), updatePlayerSheetRequest.getAttacks().getAttack3Damage()
        ));
        playerSheetDTO.setCantripsDTO(new CantripsDTO(
                updatePlayerSheetRequest.getCantrips().getCantrip1(), updatePlayerSheetRequest.getCantrips().getCantrip2(),
                updatePlayerSheetRequest.getCantrips().getCantrip3(), updatePlayerSheetRequest.getCantrips().getCantrip4()
        ));
        playerSheetDTO.setSpellcastingDTO(new SpellcastingDTO(
                updatePlayerSheetRequest.getSpellcasting().getSpellcastingClass(), updatePlayerSheetRequest.getSpellcasting().getSpellcastingAbility(),
                updatePlayerSheetRequest.getSpellcasting().getSpellSaveDC(), updatePlayerSheetRequest.getSpellcasting().getSpellAttackBonus()
        ));
        playerSheetDTO.setSpellSlotsDTO(new SpellSlotsDTO(
                updatePlayerSheetRequest.getSpellSlots().getSpellSlots1(), updatePlayerSheetRequest.getSpellSlots().isSpellSlots1Used(),
                updatePlayerSheetRequest.getSpellSlots().getSpellSlots2(), updatePlayerSheetRequest.getSpellSlots().isSpellSlots2Used(),
                updatePlayerSheetRequest.getSpellSlots().getSpellSlots3(), updatePlayerSheetRequest.getSpellSlots().isSpellSlots3Used(),
                updatePlayerSheetRequest.getSpellSlots().getSpellSlots4(), updatePlayerSheetRequest.getSpellSlots().isSpellSlots4Used(),
                updatePlayerSheetRequest.getSpellSlots().getSpellSlots5(), updatePlayerSheetRequest.getSpellSlots().isSpellSlots5Used(),
                updatePlayerSheetRequest.getSpellSlots().getSpellSlots6(), updatePlayerSheetRequest.getSpellSlots().isSpellSlots6Used(),
                updatePlayerSheetRequest.getSpellSlots().getSpellSlots7(), updatePlayerSheetRequest.getSpellSlots().isSpellSlots7Used(),
                updatePlayerSheetRequest.getSpellSlots().getSpellSlots8(), updatePlayerSheetRequest.getSpellSlots().isSpellSlots8Used(),
                updatePlayerSheetRequest.getSpellSlots().getSpellSlots9(), updatePlayerSheetRequest.getSpellSlots().isSpellSlots9Used()
        ));
        playerSheetDTO.setCurrencyDTO(new CurrencyDTO(
                updatePlayerSheetRequest.getCurrency().getCopperCurrency(), updatePlayerSheetRequest.getCurrency().getBronzeCurrency(),
                updatePlayerSheetRequest.getCurrency().getSilverCurrency(), updatePlayerSheetRequest.getCurrency().getGoldCurrency(),
                updatePlayerSheetRequest.getCurrency().getPlatinumCurrency()
        ));
        playerSheetDTO.setEquipmentsDTO(new EquipmentsDTO(
                updatePlayerSheetRequest.getEquipments().getEquipment1(), updatePlayerSheetRequest.getEquipments().getEquipment2(),
                updatePlayerSheetRequest.getEquipments().getEquipment3(), updatePlayerSheetRequest.getEquipments().getEquipment4(),
                updatePlayerSheetRequest.getEquipments().getEquipment5()
        ));
        playerSheetDTO.setPassiveStatsDTO(new PassiveStatsDTO(
                updatePlayerSheetRequest.getPassiveStats().getInspiration(), updatePlayerSheetRequest.getPassiveStats().getProficiencyBonus(),
                updatePlayerSheetRequest.getPassiveStats().getPassivePerception()
        ));
        playerSheetDTO.setPersonalityDTO(new PersonalityDTO(
                updatePlayerSheetRequest.getPersonality().getPersonalityTraits(), updatePlayerSheetRequest.getPersonality().getIdeals(),
                updatePlayerSheetRequest.getPersonality().getBonds(), updatePlayerSheetRequest.getPersonality().getFlaws(),
                updatePlayerSheetRequest.getPersonality().getFeature1(), updatePlayerSheetRequest.getPersonality().getFeature2(),
                updatePlayerSheetRequest.getPersonality().getFeature3(), updatePlayerSheetRequest.getPersonality().getNotes(),
                updatePlayerSheetRequest.getPersonality().getBackstory()
        ));

        log.info("PlayerSheetConverter - updateRequestToDto END with DTO -> {}", playerSheetDTO);
        return playerSheetDTO;
    }

    public UpdatePlayerSheetResponse playerSheetToUpdateResponse(PlayerSheetPO playerSheetPO){
        PlayerSheetResponse playerSheetResponse = new PlayerSheetResponse();
        playerSheetResponse.setId(playerSheetPO.getId());
        playerSheetResponse.setName(playerSheetPO.getName());
        playerSheetResponse.setRace(playerSheetPO.getRace());
        playerSheetResponse.setCharacterClass(playerSheetPO.getCharacterClass());
        playerSheetResponse.setBackground(playerSheetPO.getBackground());
        playerSheetResponse.setExperience(playerSheetPO.getExperience());
        playerSheetResponse.setLevel(playerSheetPO.getLevel());
        playerSheetResponse.setAlignment(playerSheetPO.getAlignment());

        playerSheetResponse.setStats(new StatsResponse(
                playerSheetPO.getStatsPO().getStrength(), playerSheetPO.getStatsPO().getDexterity(),
                playerSheetPO.getStatsPO().getConstitution(), playerSheetPO.getStatsPO().getIntelligence(),
                playerSheetPO.getStatsPO().getWisdom(), playerSheetPO.getStatsPO().getCharisma()
        ));
        playerSheetResponse.setStatus(new StatusResponse(
                playerSheetPO.getStatusPO().getArmorClass(), playerSheetPO.getStatusPO().getSpeed(),
                playerSheetPO.getStatusPO().getInitiative(), playerSheetPO.getStatusPO().getMaxHitPoints(),
                playerSheetPO.getStatusPO().getCurrentHitPoints(), playerSheetPO.getStatusPO().getTempHitPoints(),
                playerSheetPO.getStatusPO().getHitDice(), playerSheetPO.getStatusPO().getArmor(),
                playerSheetPO.getStatusPO().getWeapons(), playerSheetPO.getStatusPO().getTools(),
                playerSheetPO.getStatusPO().getLanguages()
        ));
        playerSheetResponse.setSkills(new SkillsResponse(
                playerSheetPO.getSkillsPO().getAcrobatics(), playerSheetPO.getSkillsPO().getAnimalHandling(), playerSheetPO.getSkillsPO().getArcana(),
                playerSheetPO.getSkillsPO().getAthletics(),playerSheetPO.getSkillsPO().getDeception(), playerSheetPO.getSkillsPO().getHistory(),
                playerSheetPO.getSkillsPO().getInsight(), playerSheetPO.getSkillsPO().getIntimidation(), playerSheetPO.getSkillsPO().getInvestigation(),
                playerSheetPO.getSkillsPO().getMedicine(), playerSheetPO.getSkillsPO().getNature(), playerSheetPO.getSkillsPO().getPerception(),
                playerSheetPO.getSkillsPO().getPerformance(), playerSheetPO.getSkillsPO().getPersuasion(), playerSheetPO.getSkillsPO().getReligion(),
                playerSheetPO.getSkillsPO().getSightOfHand(), playerSheetPO.getSkillsPO().getStealth(), playerSheetPO.getSkillsPO().getSurvival()
        ));
        playerSheetResponse.setSavingThrows(new SavingThrowsResponse(
                playerSheetPO.getSavingThrowsPO().isSavingThrow1(), playerSheetPO.getSavingThrowsPO().isSavingThrow2(),
                playerSheetPO.getSavingThrowsPO().isSavingThrow3()
        ));
        playerSheetResponse.setAttacks(new AttacksResponse(
                playerSheetPO.getAttacksPO().getAttack1Name(), playerSheetPO.getAttacksPO().getAttack1Bonus(), playerSheetPO.getAttacksPO().getAttack1Damage(),
                playerSheetPO.getAttacksPO().getAttack2Name(), playerSheetPO.getAttacksPO().getAttack2Bonus(), playerSheetPO.getAttacksPO().getAttack2Damage(),
                playerSheetPO.getAttacksPO().getAttack3Name(), playerSheetPO.getAttacksPO().getAttack3Bonus(), playerSheetPO.getAttacksPO().getAttack3Damage()
        ));
        playerSheetResponse.setCantrips(new CantripsResponse(
                playerSheetPO.getCantripsPO().getCantrip1(), playerSheetPO.getCantripsPO().getCantrip2(),
                playerSheetPO.getCantripsPO().getCantrip3(), playerSheetPO.getCantripsPO().getCantrip4()
        ));
        playerSheetResponse.setSpellcasting(new SpellcastingResponse(
                playerSheetPO.getSpellcastingPO().getSpellcastingClass(), playerSheetPO.getSpellcastingPO().getSpellcastingAbility(),
                playerSheetPO.getSpellcastingPO().getSpellSaveDC(), playerSheetPO.getSpellcastingPO().getSpellAttackBonus()
        ));
        playerSheetResponse.setSpellSlots(new SpellSlotsResponse(
                playerSheetPO.getSpellSlotsPO().getSpellSlots1(), playerSheetPO.getSpellSlotsPO().isSpellSlots1Used(),
                playerSheetPO.getSpellSlotsPO().getSpellSlots2(), playerSheetPO.getSpellSlotsPO().isSpellSlots2Used(),
                playerSheetPO.getSpellSlotsPO().getSpellSlots3(), playerSheetPO.getSpellSlotsPO().isSpellSlots3Used(),
                playerSheetPO.getSpellSlotsPO().getSpellSlots4(), playerSheetPO.getSpellSlotsPO().isSpellSlots4Used(),
                playerSheetPO.getSpellSlotsPO().getSpellSlots5(), playerSheetPO.getSpellSlotsPO().isSpellSlots5Used(),
                playerSheetPO.getSpellSlotsPO().getSpellSlots6(), playerSheetPO.getSpellSlotsPO().isSpellSlots6Used(),
                playerSheetPO.getSpellSlotsPO().getSpellSlots7(), playerSheetPO.getSpellSlotsPO().isSpellSlots7Used(),
                playerSheetPO.getSpellSlotsPO().getSpellSlots8(), playerSheetPO.getSpellSlotsPO().isSpellSlots8Used(),
                playerSheetPO.getSpellSlotsPO().getSpellSlots9(), playerSheetPO.getSpellSlotsPO().isSpellSlots9Used()
        ));
        playerSheetResponse.setCurrency(new CurrencyResponse(
                playerSheetPO.getCurrencyPO().getCopperCurrency(), playerSheetPO.getCurrencyPO().getBronzeCurrency(),
                playerSheetPO.getCurrencyPO().getSilverCurrency(), playerSheetPO.getCurrencyPO().getGoldCurrency(),
                playerSheetPO.getCurrencyPO().getPlatinumCurrency()
        ));
        playerSheetResponse.setEquipments(new EquipmentsResponse(
                playerSheetPO.getEquipmentsPO().getEquipment1(), playerSheetPO.getEquipmentsPO().getEquipment2(),
                playerSheetPO.getEquipmentsPO().getEquipment3(), playerSheetPO.getEquipmentsPO().getEquipment4(),
                playerSheetPO.getEquipmentsPO().getEquipment5()
        ));
        playerSheetResponse.setPassiveStats(new PassiveStatsResponse(
                playerSheetPO.getPassiveStatsPO().getInspiration(), playerSheetPO.getPassiveStatsPO().getProficiencyBonus(),
                playerSheetPO.getPassiveStatsPO().getPassivePerception()
        ));
        playerSheetResponse.setPersonality(new PersonalityResponse(
                playerSheetPO.getPersonalityPO().getPersonalityTraits(), playerSheetPO.getPersonalityPO().getIdeals(),
                playerSheetPO.getPersonalityPO().getBonds(), playerSheetPO.getPersonalityPO().getFlaws(),
                playerSheetPO.getPersonalityPO().getFeature1(), playerSheetPO.getPersonalityPO().getFeature2(),
                playerSheetPO.getPersonalityPO().getFeature3(), playerSheetPO.getPersonalityPO().getNotes(),
                playerSheetPO.getPersonalityPO().getBackstory()
        ));


        UpdatePlayerSheetResponse updatePlayerSheetResponse = new UpdatePlayerSheetResponse();
        updatePlayerSheetResponse.setMessage("Update done");
        updatePlayerSheetResponse.setDomain(playerSheetsApplicationProperties.getName());
        updatePlayerSheetResponse.setTimestamp(tools.getInstant());
        updatePlayerSheetResponse.setSheet(playerSheetResponse);

        log.info("PlayerSheetConverter - playerSheetToUpdateResponse END with updatePlayerSheetResponse -> {}", updatePlayerSheetResponse);
        return updatePlayerSheetResponse;
    }

    public DeletePlayerSheetResponse deletePlayerSheetResponse(){
        DeletePlayerSheetResponse deletePlayerSheetResponse = new DeletePlayerSheetResponse();
        deletePlayerSheetResponse.setMessage(PLAYER_SHEET_DELETED_MESSAGE);
        deletePlayerSheetResponse.setDomain(playerSheetsApplicationProperties.getName());
        deletePlayerSheetResponse.setTimestamp(tools.getInstant());
        log.info("PlayerSheetConverter - deletePlayerSheetResponse END with deleteUserResponse -> {}", deletePlayerSheetResponse);
        return deletePlayerSheetResponse;
    }
}
