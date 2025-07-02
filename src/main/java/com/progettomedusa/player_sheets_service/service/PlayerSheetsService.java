package com.progettomedusa.player_sheets_service.service;

import com.progettomedusa.player_sheets_service.model.converter.PlayerSheetConverter;
import com.progettomedusa.player_sheets_service.model.dto.PlayerSheetDTO;
import com.progettomedusa.player_sheets_service.model.po.PlayerSheetPO;
import com.progettomedusa.player_sheets_service.model.request.CreatePlayerSheetRequest;
import com.progettomedusa.player_sheets_service.model.response.*;
import com.progettomedusa.player_sheets_service.repository.PlayerSheetsRepository;
import com.progettomedusa.player_sheets_service.model.exception.*;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import static com.progettomedusa.player_sheets_service.util.Constants.BASE_ERROR_DETAILS;

@Slf4j
@RequiredArgsConstructor
@Service
public class PlayerSheetsService {

    private final PlayerSheetsRepository playerSheetsRepository;
    private final PlayerSheetConverter playerSheetConverter;

    /*public RestResponse getRootStatus(PlayerSheetDTO dto) {
        log.debug("Service - getRootStatus START");
        RestResponse resp = converter.retrieveRestResponseForRootPath(dto);
        log.debug("Service - getRootStatus END");
        return resp;
    }*/

    public CreatePlayerSheetRequestResponse createPlayerSheet(PlayerSheetDTO playerSheetDTO) throws CreatePlayerSheetException {
        log.info("Service - createPlayerSheet START with DTO -> {}",playerSheetDTO);

        PlayerSheetPO playerSheetToCreate = playerSheetConverter.dtoToPo(playerSheetDTO);

        try {
            if (playerSheetToCreate.getName() == null || playerSheetToCreate.getName().isBlank()) {
                throw new CreatePlayerSheetException(
                        ErrorMsg.PLSRV01.getCode(),
                        ErrorMsg.PLSRV01.getMessage(),
                        DomainMsg.MICROSERVICE_FUNCTIONAL.getName(),
                        BASE_ERROR_DETAILS
                );
            }
            if (playerSheetToCreate.getRace() == null || playerSheetToCreate.getRace().isBlank()) {
                throw new CreatePlayerSheetException(
                        ErrorMsg.PLSRV02.getCode(),
                        ErrorMsg.PLSRV02.getMessage(),
                        DomainMsg.MICROSERVICE_FUNCTIONAL.getName(),
                        BASE_ERROR_DETAILS
                );
            }
            if (playerSheetToCreate.getCharacterClass() == null || playerSheetToCreate.getCharacterClass().isBlank()) {
                throw new CreatePlayerSheetException(
                        ErrorMsg.PLSRV03.getCode(),
                        ErrorMsg.PLSRV03.getMessage(),
                        DomainMsg.MICROSERVICE_FUNCTIONAL.getName(),
                        BASE_ERROR_DETAILS
                );
            }
            if (playerSheetToCreate.getBackground() == null || playerSheetToCreate.getBackground().isBlank()) {
                throw new CreatePlayerSheetException(
                        ErrorMsg.PLSRV04.getCode(),
                        ErrorMsg.PLSRV04.getMessage(),
                        DomainMsg.MICROSERVICE_FUNCTIONAL.getName(),
                        BASE_ERROR_DETAILS
                );
            }
            if (playerSheetToCreate.getExperience() < 0) {
                throw new CreatePlayerSheetException(
                        ErrorMsg.PLSRV05.getCode(),
                        ErrorMsg.PLSRV05.getMessage(),
                        DomainMsg.MICROSERVICE_FUNCTIONAL.getName(),
                        BASE_ERROR_DETAILS
                );
            }
            if (playerSheetToCreate.getLevel() == null || playerSheetToCreate.getLevel() <=0 ) {
                throw new CreatePlayerSheetException(
                        ErrorMsg.PLSRV06.getCode(),
                        ErrorMsg.PLSRV06.getMessage(),
                        DomainMsg.MICROSERVICE_FUNCTIONAL.getName(),
                        BASE_ERROR_DETAILS
                );
            }
            if (playerSheetToCreate.getAlignment() == null || playerSheetToCreate.getAlignment().isBlank()) {
                throw new CreatePlayerSheetException(
                        ErrorMsg.PLSRV07.getCode(),
                        ErrorMsg.PLSRV07.getMessage(),
                        DomainMsg.MICROSERVICE_FUNCTIONAL.getName(),
                        BASE_ERROR_DETAILS
                );
            }

            PlayerSheetPO playerSheetCreated = playerSheetsRepository.save(playerSheetToCreate);

            CreatePlayerSheetRequestResponse createPlayerSheetRequestResponse =
                    playerSheetConverter.createPlayerSheetRequestResponse(playerSheetCreated);

            log.info("Service - createPlayerSheet END with response -> {}", createPlayerSheetRequestResponse);
            return createPlayerSheetRequestResponse;

        } catch (CreatePlayerSheetException e) {
            log.error("CreatePlayerSheet validation failed: {}", e.getMessage());
            throw e;
        } catch (Exception e) {
            log.error("Unexpected error during createPlayerSheet: {}", e.getMessage(), e);
            return playerSheetConverter.createPlayerSheetRequestResponse(e);
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


    public UpdatePlayerSheetResponse updatePlayerSheet(PlayerSheetDTO playerSheetDTO) {
        log.info("Service - UpdatePlayerSheet START with dto -> {}", playerSheetDTO );

        PlayerSheetPO playerSheetToUpdate = playerSheetConverter.dtoToPo(playerSheetDTO);
        PlayerSheetPO currentPlayerSheet = playerSheetsRepository.save(playerSheetToUpdate);
        UpdatePlayerSheetResponse updatePlayerSheetResponse = playerSheetConverter.playerSheetToUpdateResponse(currentPlayerSheet);

        log.info("Service - UpdatePlayerSheet END with dto -> {}", updatePlayerSheetResponse );
        return updatePlayerSheetResponse;
    }

    public DeletePlayerSheetResponse deletePlayerSheet(Long id) {
        log.info("Service - DeletePlayerSheet START with id -> {}", id);
        playerSheetsRepository.deleteById(id);
        DeletePlayerSheetResponse deletePlayerSheetResponse = playerSheetConverter.deletePlayerSheetResponse();
        log.debug("Service - DeletePlayerSheet END with response -> {}", deletePlayerSheetResponse);
        return deletePlayerSheetResponse;
    }
}