package com.progettomedusa.player_sheets_service.service;

import com.progettomedusa.player_sheets_service.model.converter.PlayerSheetConverter;
import com.progettomedusa.player_sheets_service.model.dto.PlayerSheetDTO;
import com.progettomedusa.player_sheets_service.model.po.PlayerSheetPO;
import com.progettomedusa.player_sheets_service.model.response.*;
import com.progettomedusa.player_sheets_service.repository.PlayerSheetsRepository;
import com.progettomedusa.player_sheets_service.model.exception.*;
import com.progettomedusa.player_sheets_service.model.serviceValidator.ServiceValidator;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

import static com.progettomedusa.player_sheets_service.util.Constants.BASE_ERROR_DETAILS;

@Slf4j
@RequiredArgsConstructor
@Service
public class PlayerSheetsService {

    private final PlayerSheetsRepository playerSheetsRepository;
    private final PlayerSheetConverter playerSheetConverter;



    public CreatePlayerSheetResponse createPlayerSheet(PlayerSheetDTO playerSheetDTO) throws CreatePlayerSheetException {
        log.info("Service - createPlayerSheet START with DTO -> {}",playerSheetDTO);

        PlayerSheetPO playerSheetToCreate = playerSheetConverter.dtoToPo(playerSheetDTO);
        try {
            ServiceValidator.validateCreate(playerSheetToCreate);

            PlayerSheetPO playerSheetCreated = playerSheetsRepository.save(playerSheetToCreate);

            CreatePlayerSheetResponse createPlayerSheetResponse =
                    playerSheetConverter.createPlayerSheetResponse(playerSheetCreated);

            log.info("Service - createPlayerSheet END with response -> {}", createPlayerSheetResponse);
            return createPlayerSheetResponse;

        } catch (CreatePlayerSheetException e) {
            log.error("CreatePlayerSheet validation failed: {}", e.getMessage());
            throw e;
        } catch (Exception e) {
            log.error("Unexpected error during createPlayerSheet: {}", e.getMessage(), e);
            return playerSheetConverter.createPlayerSheetResponse(e);
        }
    }

    public UpdatePlayerSheetResponse updatePlayerSheet(PlayerSheetDTO playerSheetDTO) throws UpdatePlayerSheetException {
        log.info("Service - UpdatePlayerSheet START with dto -> {}", playerSheetDTO);

        PlayerSheetPO playerSheetToUpdate = playerSheetConverter.dtoToPo(playerSheetDTO);

        try {
            ServiceValidator.validateUpdate(playerSheetToUpdate);

            PlayerSheetPO currentPlayerSheet = playerSheetsRepository.save(playerSheetToUpdate);
            UpdatePlayerSheetResponse updatePlayerSheetResponse = playerSheetConverter.playerSheetToUpdateResponse(currentPlayerSheet);


            log.info("Service - UpdatePlayerSheet END with dto -> {}", updatePlayerSheetResponse);
            return updatePlayerSheetResponse;

        }catch (UpdatePlayerSheetException e) {
            log.error("UpdatePlayerSheet validation failed: {}", e.getMessage());
            throw e;
        } catch (Exception e) {
            log.error("Unexpected error during createPlayerSheet: {}", e.getMessage(), e);
            return playerSheetConverter.updatePlayerSheetResponse(e);
        }
    }



    public GetPlayerSheetsResponse getPlayerSheets()  {
        log.info("Service - Retrieving all sheets (getPlayerSheets) START");
        List<PlayerSheetPO> playerSheetPOList = playerSheetsRepository.findAll();
        GetPlayerSheetsResponse getPlayerSheetsResponse = playerSheetConverter.listOfPlayerSheetsGetPlayerSheetsResponse(playerSheetPOList);
        log.info("Service - Retrieving all sheets END, count={} ", getPlayerSheetsResponse);
        return getPlayerSheetsResponse;
    }

    public GetPlayerSheetResponse getPlayerSheet(Long id) {
        log.info("Service - getPlayerSheet by id={} START", id);
        Optional<PlayerSheetPO> playerSheetPO = playerSheetsRepository.findById(id);

        GetPlayerSheetResponse getPlayerSheetResponse;
        if (playerSheetPO.isPresent()){
            getPlayerSheetResponse = playerSheetConverter.playerSheetPoToGetPlayerSheetResponse(playerSheetPO.get(), false);
        }else{
            getPlayerSheetResponse = playerSheetConverter.getPlayerSheetResponse();
        }

        log.info("Service - getPlayerSheet by id END with response -> {}", getPlayerSheetResponse);
        return getPlayerSheetResponse;
    }




    public DeletePlayerSheetResponse deletePlayerSheet(Long id) {
        log.info("Service - DeletePlayerSheet START with id -> {}", id);
        playerSheetsRepository.deleteById(id);
        DeletePlayerSheetResponse deletePlayerSheetResponse = playerSheetConverter.deletePlayerSheetResponse();
        log.debug("Service - DeletePlayerSheet END with response -> {}", deletePlayerSheetResponse);
        return deletePlayerSheetResponse;
    }
}