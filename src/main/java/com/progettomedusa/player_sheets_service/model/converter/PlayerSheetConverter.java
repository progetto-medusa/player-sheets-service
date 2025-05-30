package com.progettomedusa.player_sheets_service.model.converter;

import com.progettomedusa.player_sheets_service.config.PlayerSheetsApplicationProperties;
import com.progettomedusa.player_sheets_service.model.dto.PlayerSheetDTO;
import com.progettomedusa.player_sheets_service.model.po.PlayerSheetPO;
import com.progettomedusa.player_sheets_service.model.request.CreatePlayerSheetRequest;
import com.progettomedusa.player_sheets_service.model.request.UpdatePlayerSheetRequest;
import com.progettomedusa.player_sheets_service.model.response.*;
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


    public PlayerSheetDTO createRequestToPlayerSheetDTO(CreatePlayerSheetRequest createPlayerSheetRequest) {
        PlayerSheetDTO playerSheetDTO = new PlayerSheetDTO();
        playerSheetDTO.setName(createPlayerSheetRequest.getName());
        playerSheetDTO.setRace(createPlayerSheetRequest.getRace());
        playerSheetDTO.setCharacterClass(createPlayerSheetRequest.getCharacterClass());
        playerSheetDTO.setBackground(createPlayerSheetRequest.getBackground());
        playerSheetDTO.setExperience(createPlayerSheetRequest.getExperience());
        playerSheetDTO.setAlignment(createPlayerSheetRequest.getAlignment());
        playerSheetDTO.setStrength(createPlayerSheetRequest.getStrength());
        playerSheetDTO.setDexterity(createPlayerSheetRequest.getDexterity());
        playerSheetDTO.setConstitution(createPlayerSheetRequest.getConstitution());
        playerSheetDTO.setIntelligence(createPlayerSheetRequest.getIntelligence());
        playerSheetDTO.setWisdom(createPlayerSheetRequest.getWisdom());
        playerSheetDTO.setCharisma(createPlayerSheetRequest.getCharisma());
        playerSheetDTO.setProficiencyBonus(createPlayerSheetRequest.getProficiencyBonus());
        playerSheetDTO.setPassivePerception(createPlayerSheetRequest.getPassivePerception());
        playerSheetDTO.setSpeed(createPlayerSheetRequest.getSpeed());
        playerSheetDTO.setInitiative(createPlayerSheetRequest.getInitiative());
        playerSheetDTO.setMaxHitPoints(createPlayerSheetRequest.getMaxHitPoints());
        playerSheetDTO.setCurrentHitPoints(createPlayerSheetRequest.getCurrentHitPoints());
        playerSheetDTO.setTempHitPoints(createPlayerSheetRequest.getTempHitPoints());
        playerSheetDTO.setHitDice(createPlayerSheetRequest.getHitDice());
        playerSheetDTO.setSpellcastingAbility(createPlayerSheetRequest.getSpellcastingAbility());
        playerSheetDTO.setSpellSaveDC(createPlayerSheetRequest.getSpellSaveDC());
        playerSheetDTO.setSpellAttackBonus(createPlayerSheetRequest.getSpellAttackBonus());
        playerSheetDTO.setFeatures(createPlayerSheetRequest.getFeatures());
        playerSheetDTO.setNotes(createPlayerSheetRequest.getNotes());
        log.info("PlayerSheetConverter - createRequestToPlayerSheetDTO END with DTO -> {}", playerSheetDTO);
        return playerSheetDTO;
    }
    public CreatePlayerSheetRequestResponse createPlayerSheetRequestResponse (PlayerSheetPO playerSheetCreated){
        CreatePlayerSheetRequestResponse createPlayerSheetRequestResponse = new CreatePlayerSheetRequestResponse();
        createPlayerSheetRequestResponse.setMessage("Creation done");
        createPlayerSheetRequestResponse.setDomain(playerSheetsApplicationProperties.getName());
        createPlayerSheetRequestResponse.setTimestamp(tools.getInstant());
        createPlayerSheetRequestResponse.setName(playerSheetCreated.getName());
        createPlayerSheetRequestResponse.setRace(playerSheetCreated.getRace());
        createPlayerSheetRequestResponse.setCharacterClass(playerSheetCreated.getCharacterClass());
        createPlayerSheetRequestResponse.setBackground(playerSheetCreated.getBackground());
        createPlayerSheetRequestResponse.setExperience(playerSheetCreated.getExperience());
        createPlayerSheetRequestResponse.setAlignment(playerSheetCreated.getAlignment());
        createPlayerSheetRequestResponse.setStrength(playerSheetCreated.getStrength());
        createPlayerSheetRequestResponse.setDexterity(playerSheetCreated.getDexterity());
        createPlayerSheetRequestResponse.setConstitution(playerSheetCreated.getConstitution());
        createPlayerSheetRequestResponse.setIntelligence(playerSheetCreated.getIntelligence());
        createPlayerSheetRequestResponse.setWisdom(playerSheetCreated.getWisdom());
        createPlayerSheetRequestResponse.setCharisma(playerSheetCreated.getCharisma());
        createPlayerSheetRequestResponse.setProficiencyBonus(playerSheetCreated.getProficiencyBonus());
        createPlayerSheetRequestResponse.setPassivePerception(playerSheetCreated.getPassivePerception());
        createPlayerSheetRequestResponse.setSpeed(playerSheetCreated.getSpeed());
        createPlayerSheetRequestResponse.setInitiative(playerSheetCreated.getInitiative());
        createPlayerSheetRequestResponse.setMaxHitPoints(playerSheetCreated.getMaxHitPoints());
        createPlayerSheetRequestResponse.setCurrentHitPoints(playerSheetCreated.getCurrentHitPoints());
        createPlayerSheetRequestResponse.setTempHitPoints(playerSheetCreated.getTempHitPoints());
        createPlayerSheetRequestResponse.setHitDice(playerSheetCreated.getHitDice());
        createPlayerSheetRequestResponse.setSpellcastingAbility(playerSheetCreated.getSpellcastingAbility());
        createPlayerSheetRequestResponse.setSpellSaveDC(playerSheetCreated.getSpellSaveDC());
        createPlayerSheetRequestResponse.setSpellAttackBonus(playerSheetCreated.getSpellAttackBonus());
        createPlayerSheetRequestResponse.setFeatures(playerSheetCreated.getFeatures());
        createPlayerSheetRequestResponse.setNotes(playerSheetCreated.getNotes());

        log.info("PlayerSheetConverter - createPlayerSheetRequestResponse END with createPlayerSheetRequestResponse -> {}", createPlayerSheetRequestResponse);
        return createPlayerSheetRequestResponse;
    }


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
        playerSheetPO.setAlignment(playerSheetDTO.getAlignment());
        playerSheetPO.setStrength(playerSheetDTO.getStrength());
        playerSheetPO.setDexterity(playerSheetDTO.getDexterity());
        playerSheetPO.setConstitution(playerSheetDTO.getConstitution());
        playerSheetPO.setIntelligence(playerSheetDTO.getIntelligence());
        playerSheetPO.setWisdom(playerSheetDTO.getWisdom());
        playerSheetPO.setCharisma(playerSheetDTO.getCharisma());
        playerSheetPO.setProficiencyBonus(playerSheetDTO.getProficiencyBonus());
        playerSheetPO.setPassivePerception(playerSheetDTO.getPassivePerception());
        playerSheetPO.setSpeed(playerSheetDTO.getSpeed());
        playerSheetPO.setInitiative(playerSheetDTO.getInitiative());
        playerSheetPO.setMaxHitPoints(playerSheetDTO.getMaxHitPoints());
        playerSheetPO.setCurrentHitPoints(playerSheetDTO.getCurrentHitPoints());
        playerSheetPO.setTempHitPoints(playerSheetDTO.getTempHitPoints());
        playerSheetPO.setHitDice(playerSheetDTO.getHitDice());
        playerSheetPO.setSpellcastingAbility(playerSheetDTO.getSpellcastingAbility());
        playerSheetPO.setSpellSaveDC(playerSheetDTO.getSpellSaveDC());
        playerSheetPO.setSpellAttackBonus(playerSheetDTO.getSpellAttackBonus());
        playerSheetPO.setFeatures(playerSheetDTO.getFeatures());
        playerSheetPO.setNotes(playerSheetDTO.getNotes());

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
        playerSheetResponse.setAlignment(playerSheetPO.getAlignment());
        playerSheetResponse.setStrength(playerSheetPO.getStrength());
        playerSheetResponse.setDexterity(playerSheetPO.getDexterity());
        playerSheetResponse.setConstitution(playerSheetPO.getConstitution());
        playerSheetResponse.setIntelligence(playerSheetPO.getIntelligence());
        playerSheetResponse.setWisdom(playerSheetPO.getWisdom());
        playerSheetResponse.setCharisma(playerSheetPO.getCharisma());
        playerSheetResponse.setProficiencyBonus(playerSheetPO.getProficiencyBonus());
        playerSheetResponse.setPassivePerception(playerSheetPO.getPassivePerception());
        playerSheetResponse.setSpeed(playerSheetPO.getSpeed());
        playerSheetResponse.setInitiative(playerSheetPO.getInitiative());
        playerSheetResponse.setMaxHitPoints(playerSheetPO.getMaxHitPoints());
        playerSheetResponse.setCurrentHitPoints(playerSheetPO.getCurrentHitPoints());
        playerSheetResponse.setTempHitPoints(playerSheetPO.getTempHitPoints());
        playerSheetResponse.setHitDice(playerSheetPO.getHitDice());
        playerSheetResponse.setSpellcastingAbility(playerSheetPO.getSpellcastingAbility());
        playerSheetResponse.setSpellSaveDC(playerSheetPO.getSpellSaveDC());
        playerSheetResponse.setSpellAttackBonus(playerSheetPO.getSpellAttackBonus());
        playerSheetResponse.setFeatures(playerSheetPO.getFeatures());
        playerSheetResponse.setNotes(playerSheetPO.getNotes());

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
        playerSheetDTO.setAlignment(updatePlayerSheetRequest.getAlignment());
        playerSheetDTO.setStrength(updatePlayerSheetRequest.getStrength());
        playerSheetDTO.setDexterity(updatePlayerSheetRequest.getDexterity());
        playerSheetDTO.setConstitution(updatePlayerSheetRequest.getConstitution());
        playerSheetDTO.setIntelligence(updatePlayerSheetRequest.getIntelligence());
        playerSheetDTO.setWisdom(updatePlayerSheetRequest.getWisdom());
        playerSheetDTO.setCharisma(updatePlayerSheetRequest.getCharisma());
        playerSheetDTO.setProficiencyBonus(updatePlayerSheetRequest.getProficiencyBonus());
        playerSheetDTO.setPassivePerception(updatePlayerSheetRequest.getPassivePerception());
        playerSheetDTO.setSpeed(updatePlayerSheetRequest.getSpeed());
        playerSheetDTO.setInitiative(updatePlayerSheetRequest.getInitiative());
        playerSheetDTO.setMaxHitPoints(updatePlayerSheetRequest.getMaxHitPoints());
        playerSheetDTO.setCurrentHitPoints(updatePlayerSheetRequest.getCurrentHitPoints());
        playerSheetDTO.setTempHitPoints(updatePlayerSheetRequest.getTempHitPoints());
        playerSheetDTO.setHitDice(updatePlayerSheetRequest.getHitDice());
        playerSheetDTO.setSpellcastingAbility(updatePlayerSheetRequest.getSpellcastingAbility());
        playerSheetDTO.setSpellSaveDC(updatePlayerSheetRequest.getSpellSaveDC());
        playerSheetDTO.setSpellAttackBonus(updatePlayerSheetRequest.getSpellAttackBonus());
        playerSheetDTO.setFeatures(updatePlayerSheetRequest.getFeatures());
        playerSheetDTO.setNotes(updatePlayerSheetRequest.getNotes());

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
        playerSheetResponse.setAlignment(playerSheetPO.getAlignment());
        playerSheetResponse.setStrength(playerSheetPO.getStrength());
        playerSheetResponse.setDexterity(playerSheetPO.getDexterity());
        playerSheetResponse.setConstitution(playerSheetPO.getConstitution());
        playerSheetResponse.setIntelligence(playerSheetPO.getIntelligence());
        playerSheetResponse.setWisdom(playerSheetPO.getWisdom());
        playerSheetResponse.setCharisma(playerSheetPO.getCharisma());
        playerSheetResponse.setProficiencyBonus(playerSheetPO.getProficiencyBonus());
        playerSheetResponse.setPassivePerception(playerSheetPO.getPassivePerception());
        playerSheetResponse.setSpeed(playerSheetPO.getSpeed());
        playerSheetResponse.setInitiative(playerSheetPO.getInitiative());
        playerSheetResponse.setMaxHitPoints(playerSheetPO.getMaxHitPoints());
        playerSheetResponse.setCurrentHitPoints(playerSheetPO.getCurrentHitPoints());
        playerSheetResponse.setTempHitPoints(playerSheetPO.getTempHitPoints());
        playerSheetResponse.setHitDice(playerSheetPO.getHitDice());
        playerSheetResponse.setSpellcastingAbility(playerSheetPO.getSpellcastingAbility());
        playerSheetResponse.setSpellSaveDC(playerSheetPO.getSpellSaveDC());
        playerSheetResponse.setSpellAttackBonus(playerSheetPO.getSpellAttackBonus());
        playerSheetResponse.setFeatures(playerSheetPO.getFeatures());
        playerSheetResponse.setNotes(playerSheetPO.getNotes());


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
