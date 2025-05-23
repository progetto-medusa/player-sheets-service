package com.progettomedusa.player_sheets_service.controller;

import com.progettomedusa.player_sheets_service.dto.PlayerSheetDTO;
import com.progettomedusa.player_sheets_service.service.PlayerSheetsService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RequiredArgsConstructor
@RestController
@RequestMapping("/api/player-sheets")
public class PlayerSheetsController {

    private final PlayerSheetsService playerSheetsService;

    @GetMapping("/all")
    public ResponseEntity<List<PlayerSheetDTO>> getAll() {
        log.info("Recupero tutte le schede giocatore");
        try {
            return ResponseEntity.ok(playerSheetsService.getAllPlayerSheet());
        } catch (Exception e) {
            log.error("Errore recupero schede", e);
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }

    @GetMapping("/{sort}")
    public ResponseEntity<PlayerSheetDTO> getById(@PathVariable Long id) {
        log.info("Recupero scheda id={}", id);
        try {
            return ResponseEntity.ok(playerSheetsService.getPlayerSheetById(id));
        } catch (Exception e) {
            log.error("Errore recupero scheda id={}", id, e);
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
    }

    @PostMapping("/{create}")
    public ResponseEntity<PlayerSheetDTO> create(@RequestBody PlayerSheetDTO dto) {
        log.info("Creazione nuova scheda");
        try {
            PlayerSheetDTO created = playerSheetsService.createPlayerSheets(dto);
            return ResponseEntity.status(HttpStatus.CREATED).body(created);
        } catch (Exception e) {
            log.error("Errore creazione scheda", e);
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
    }

    @PutMapping("/{upd}")
    public ResponseEntity<?> update(@PathVariable Long id,
                                    @RequestBody PlayerSheetDTO dto) {
        log.info("Aggiorno scheda id={}", id);
        try {
            PlayerSheetDTO updated = playerSheetsService.updatePlayerSheets(id, dto);
            return ResponseEntity.ok(updated);
        } catch (Exception e) {
            log.error("Errore aggiornamento scheda id={}", id, e);
            return ResponseEntity.status(HttpStatus.NOT_FOUND)
                                 .body("Impossibile modificare: scheda non trovata.");
        }
    }

    @DeleteMapping("/{delete}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        log.info("Elimino scheda id={}", id);
        try {
            playerSheetsService.deletePlayerSheets(id);
            return ResponseEntity.noContent().build();
        } catch (Exception e) {
            log.error("Errore eliminazione scheda id={}", id, e);
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }
}
