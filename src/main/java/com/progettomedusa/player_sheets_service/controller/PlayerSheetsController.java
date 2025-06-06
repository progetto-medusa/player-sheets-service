package com.progettomedusa.player_sheets_service.controller;

import com.progettomedusa.player_sheets_service.model.dto.PlayerSheetDTO;
import com.progettomedusa.player_sheets_service.model.request.CreatePlayerSheetRequest;
import com.progettomedusa.player_sheets_service.model.request.UpdatePlayerSheetRequest;
import com.progettomedusa.player_sheets_service.model.response.*;
import com.progettomedusa.player_sheets_service.service.PlayerSheetsService;
import com.progettomedusa.player_sheets_service.config.PlayerSheetsApplicationProperties;
import com.progettomedusa.player_sheets_service.model.converter.PlayerSheetConverter;
import com.progettomedusa.player_sheets_service.util.Tools;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static com.progettomedusa.player_sheets_service.util.Constants.*;

@Slf4j
@RequiredArgsConstructor
@RestController
//@RequestMapping("/api/player-sheets")
public class PlayerSheetsController {

    private final PlayerSheetsService playerSheetsService;
    private final PlayerSheetConverter playerSheetConverter;
   

    @GetMapping("/all")
    public ResponseEntity<GetPlayerSheetsResponse> getAllUsers() {
        log.info("Controller - getPlayerSheets (all) START");
        GetPlayerSheetsResponse getPlayerSheetsResponse = playerSheetsService.getPlayerSheets();
        log.info("Controller - getPlayerSheets END with response -> {}", getPlayerSheetsResponse);

        if (getPlayerSheetsResponse.getDetailed() == null) {
            return new ResponseEntity<>(getPlayerSheetsResponse, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(getPlayerSheetsResponse, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }


    @GetMapping("/getId/{id}")
    public ResponseEntity<GetPlayerSheetResponse> getUser(@PathVariable Long id) {
        log.info("Controller - getPlayerSheet START with id -> {}", id);
        GetPlayerSheetResponse getPlayerSheetResponse = playerSheetsService.getPlayerSheet(id);
        log.info("Controller - getPlayerSheet END with response -> {}", getPlayerSheetResponse);

        if (getPlayerSheetResponse.getMessage() == null) {
            return new ResponseEntity<>(getPlayerSheetResponse, HttpStatus.OK);
        } else if (getPlayerSheetResponse.getMessage().equals(PLAYER_SHEET_NOT_FOUND_MESSAGE)) {
            return new ResponseEntity<>(getPlayerSheetResponse, HttpStatus.NOT_FOUND);
        } else {
            return new ResponseEntity<>(getPlayerSheetResponse, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }


    @PostMapping("/save")
    public ResponseEntity<CreatePlayerSheetRequestResponse> createUser(@Valid @RequestBody CreatePlayerSheetRequest createPlayerSheetRequest) {
        log.info("Controller - createPlayerSheet START with request -> {}", createPlayerSheetRequest);
        PlayerSheetDTO playerSheetDTO = playerSheetConverter.createRequestToPlayerSheetDTO(createPlayerSheetRequest);
        CreatePlayerSheetRequestResponse createPlayerSheetRequestResponse = playerSheetsService.createPlayerSheet(playerSheetDTO);
        log.info("Controller - createPlayerSheet END with response -> {}", createPlayerSheetRequestResponse);
        return new ResponseEntity<>(createPlayerSheetRequestResponse, HttpStatus.ACCEPTED);
    }


    @PutMapping("/update/{id}")
    public ResponseEntity<UpdatePlayerSheetResponse> updatePlayerSheet(@RequestBody UpdatePlayerSheetRequest updatePlayerSheetRequest) {
        log.info("Controller - updatePlayerSheet START with id -> {}", updatePlayerSheetRequest);
        PlayerSheetDTO playerSheetDTO = playerSheetConverter.updatePlayerSheetRequestToDto(updatePlayerSheetRequest);
        UpdatePlayerSheetResponse updatePlayerSheetResponse = playerSheetsService.updatePlayerSheet(playerSheetDTO);
        log.info("Controller - updatePlayerSheet END with response -> {}", updatePlayerSheetResponse);

        return new ResponseEntity<>(updatePlayerSheetResponse, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<DeletePlayerSheetResponse> deletePlayerSheet(@PathVariable Long id) {
        log.info("Controller - deletePlayerSheet START with id -> {}", id);
        DeletePlayerSheetResponse deletePlayerSheetResponse = playerSheetsService.deletePlayerSheet(id);
        log.info("Controller - deletePlayerSheet END with response -> {}", deletePlayerSheetResponse);
        return new ResponseEntity<>(deletePlayerSheetResponse, HttpStatus.ACCEPTED);
    }
}
