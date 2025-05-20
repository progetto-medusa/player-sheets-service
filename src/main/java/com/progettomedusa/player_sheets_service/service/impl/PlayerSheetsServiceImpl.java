package com.progettomedusa.player_sheets_service.service.impl;

import com.progettomedusa.player_sheets_service.dto.ApiResponse;
import com.progettomedusa.player_sheets_service.dto.PlayerSheetDTO;
import com.progettomedusa.player_sheets_service.mapper.PlayerSheetMapper;
import com.progettomedusa.player_sheets_service.model.PlayerSheetsModel;
import com.progettomedusa.player_sheets_service.repository.PlayerSheetsRepository;
import com.progettomedusa.player_sheets_service.service.PlayerSheetsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class PlayerSheetsServiceImpl implements PlayerSheetsService {
    @Autowired
    private PlayerSheetsRepository repository;

    @Override
    public ApiResponse<List<PlayerSheetDTO>> getAll() {
        List<PlayerSheetDTO> list = repository.findAll().stream()
            .map(PlayerSheetMapper::toDTO)
            .collect(Collectors.toList());
        return new ApiResponse<>(true, "Fetched all player sheets", list);
    }

    @Override
    public ApiResponse<PlayerSheetDTO> getById(Long id) {
        return repository.findById(id)
            .map(model -> new ApiResponse<>(true, "Found player sheet", PlayerSheetMapper.toDTO(model)))
            .orElse(new ApiResponse<>(false, "Player sheet not found", null));
    }

    @Override
    public ApiResponse<PlayerSheetDTO> create(PlayerSheetDTO dto) {
        PlayerSheetsModel saved = repository.save(PlayerSheetMapper.toModel(dto));
        return new ApiResponse<>(true, "Created player sheet", PlayerSheetMapper.toDTO(saved));
    }

    @Override
    public ApiResponse<PlayerSheetDTO> update(Long id, PlayerSheetDTO dto) {
        return repository.findById(id)
            .map(existing -> {
                dto.setId(id);
                PlayerSheetsModel updated = repository.save(PlayerSheetMapper.toModel(dto));
                return new ApiResponse<>(true, "Updated player sheet", PlayerSheetMapper.toDTO(updated));
            })
            .orElse(new ApiResponse<>(false, "Player sheet not found", null));
    }

    @Override
    public ApiResponse<Void> delete(Long id) {
        return repository.findById(id)
            .map(existing -> {
                repository.deleteById(id);
                return new ApiResponse<Void>(true, "Deleted player sheet", null);
            })
            .orElse(new ApiResponse<Void>(false, "Player sheet not found", null));
    }
}