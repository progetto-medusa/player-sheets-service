package com.progettomedusa.player_sheets_service.controller;

import com.progettomedusa.player_sheets_service.dto.ApiResponse;
import com.progettomedusa.player_sheets_service.dto.PlayerSheetDTO;
import com.progettomedusa.player_sheets_service.service.PlayerSheetsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/player-sheets")
public class PlayerSheetsController {
    @Autowired
    private PlayerSheetsService service;

    @GetMapping
    public ResponseEntity<ApiResponse<List<PlayerSheetDTO>>> getAll() {
        return ResponseEntity.ok(service.getAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<ApiResponse<PlayerSheetDTO>> getById(@PathVariable Long id) {
        return ResponseEntity.ok(service.getById(id));
    }

    @PostMapping
    public ResponseEntity<ApiResponse<PlayerSheetDTO>> create(@RequestBody PlayerSheetDTO dto) {
        return ResponseEntity.ok(service.create(dto));
    }

    @PutMapping("/{id}")
    public ResponseEntity<ApiResponse<PlayerSheetDTO>> update(@PathVariable Long id, @RequestBody PlayerSheetDTO dto) {
        return ResponseEntity.ok(service.update(id, dto));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<ApiResponse<Void>> delete(@PathVariable Long id) {
        return ResponseEntity.ok(service.delete(id));

    }
}

