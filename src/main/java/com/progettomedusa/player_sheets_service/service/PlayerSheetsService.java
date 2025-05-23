package com.progettomedusa.player_sheets_service.service;

import com.progettomedusa.player_sheets_service.dto.PlayerSheetDTO;
import com.progettomedusa.player_sheets_service.mapper.PlayerSheetMapper;
import com.progettomedusa.player_sheets_service.model.PlayerSheetsModel;
import com.progettomedusa.player_sheets_service.repository.PlayerSheetsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
@Slf4j
@RequiredArgsConstructor
@Service
public class PlayerSheetsService {

    private final PlayerSheetsRepository playerSheetsRepository;

    public List<PlayerSheetDTO> getAllPlayerSheet() {
        log.debug("Sono nel service per recuperare le schede.");
        List<PlayerSheetsModel> models = playerSheetsRepository.findAll();
        List<PlayerSheetDTO> responseDto = new ArrayList<>();
        for (PlayerSheetsModel model : models) {
            responseDto.add(PlayerSheetMapper.toDTO(model));
        }
        return responseDto;
    }

    public PlayerSheetDTO getPlayerSheetById(Long id) {
            log.debug("Sono nel service per recuperare la scheda cercata.");
        Optional<PlayerSheetsModel> sheet = playerSheetsRepository.findById(id);
        if (sheet.isPresent()) {
            PlayerSheetDTO dto = PlayerSheetMapper.toDTO(sheet.get());
            log.debug("Scheda trovata.");
            return dto;
        } else {
            throw new RuntimeException("Scheda non trovata, id=null");
        }
    }

    public PlayerSheetDTO createPlayerSheets(PlayerSheetDTO dto) {
        PlayerSheetsModel modelSaved = playerSheetsRepository.save(PlayerSheetMapper.toModel(dto));
        log.debug("Scheda personaggio salvata.");
        return PlayerSheetMapper.toDTO(modelSaved);
    }

    public PlayerSheetDTO updatePlayerSheets(Long id, PlayerSheetDTO dto) {
        log.debug("Sono nel service per fare le modifiche");
        Optional<PlayerSheetsModel> update = playerSheetsRepository.findById(id);
        if (update.isPresent()) {
            dto.setId(id);
            PlayerSheetsModel updatedSheet = playerSheetsRepository.save(PlayerSheetMapper.toModel(dto));
            log.debug("Scheda modificata con successo");
            return PlayerSheetMapper.toDTO(updatedSheet);
        } else {
            log.debug("Scheda non modificata");
            throw new RuntimeException("Impossibile modificare la scheda, scheda originale non trovata.");
        }
    }
    

    public void deletePlayerSheets(Long id) {
        log.debug("Sono nel service per recuperare la scheda cercata.");
        Optional<PlayerSheetsModel> deleatedSheet = playerSheetsRepository.findById(id);
        if (deleatedSheet.isPresent()) {
            log.debug("Scheda eliminata");
            playerSheetsRepository.deleteById(id);
        } else {
            log.debug("Scheda non eliminata");
            throw new RuntimeException("Impossibile eliminare la scheda, id " + id + " non trovato.");
        }
    }
}
