package com.progettomedusa.player_sheets_service.service;

import com.progettomedusa.player_sheets_service.dto.ApiResponse;
import com.progettomedusa.player_sheets_service.dto.PlayerSheetDTO;

import java.util.List;

public interface PlayerSheetsService {
    ApiResponse<List<PlayerSheetDTO>> getAll();
    ApiResponse<PlayerSheetDTO> getById(Long id);
    ApiResponse<PlayerSheetDTO> create(PlayerSheetDTO dto);
    ApiResponse<PlayerSheetDTO> update(Long id, PlayerSheetDTO dto);
    ApiResponse<Void> delete(Long id);
}