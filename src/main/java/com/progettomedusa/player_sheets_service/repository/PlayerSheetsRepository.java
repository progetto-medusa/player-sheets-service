package com.progettomedusa.player_sheets_service.repository;

import com.progettomedusa.player_sheets_service.model.po.PlayerSheetPO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlayerSheetsRepository extends JpaRepository<PlayerSheetPO, Long> {
}
