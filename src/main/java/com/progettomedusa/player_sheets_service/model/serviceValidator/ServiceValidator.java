package com.progettomedusa.player_sheets_service.model.serviceValidator;

import com.progettomedusa.player_sheets_service.model.exception.*;
import com.progettomedusa.player_sheets_service.model.po.PlayerSheetPO;
import static com.progettomedusa.player_sheets_service.util.Constants.BASE_ERROR_DETAILS;

public final class ServiceValidator {

    public static void validateUpdate(PlayerSheetPO playerSheetToUpdate) throws UpdatePlayerSheetException {


        if (playerSheetToUpdate.getName() == null || playerSheetToUpdate.getName().isBlank()) {
            throw new UpdatePlayerSheetException(
                    ErrorMsg.PLSRV08.getCode(),
                    ErrorMsg.PLSRV08.getMessage(),
                    DomainMsg.MICROSERVICE_FUNCTIONAL.getName(),
                    BASE_ERROR_DETAILS
            );
        }
        if (playerSheetToUpdate.getRace() == null || playerSheetToUpdate.getRace().isBlank()) {
            throw new UpdatePlayerSheetException(
                    ErrorMsg.PLSRV09.getCode(),
                    ErrorMsg.PLSRV09.getMessage(),
                    DomainMsg.MICROSERVICE_FUNCTIONAL.getName(),
                    BASE_ERROR_DETAILS
            );
        }
        if (playerSheetToUpdate.getCharacterClass() == null || playerSheetToUpdate.getCharacterClass().isBlank()) {
            throw new UpdatePlayerSheetException(
                    ErrorMsg.PLSRV10.getCode(),
                    ErrorMsg.PLSRV10.getMessage(),
                    DomainMsg.MICROSERVICE_FUNCTIONAL.getName(),
                    BASE_ERROR_DETAILS
            );
        }
        if (playerSheetToUpdate.getBackground() == null || playerSheetToUpdate.getBackground().isBlank()) {
            throw new UpdatePlayerSheetException(
                    ErrorMsg.PLSRV11.getCode(),
                    ErrorMsg.PLSRV11.getMessage(),
                    DomainMsg.MICROSERVICE_FUNCTIONAL.getName(),
                    BASE_ERROR_DETAILS
            );
        }
        if (playerSheetToUpdate.getExperience() == null || playerSheetToUpdate.getExperience() < 0) {
            throw new UpdatePlayerSheetException(
                    ErrorMsg.PLSRV12.getCode(),
                    ErrorMsg.PLSRV12.getMessage(),
                    DomainMsg.MICROSERVICE_FUNCTIONAL.getName(),
                    BASE_ERROR_DETAILS
            );
        }
        if (playerSheetToUpdate.getLevel() == null || playerSheetToUpdate.getLevel() <= 0 || playerSheetToUpdate.getLevel() > 20) {
            throw new UpdatePlayerSheetException(
                    ErrorMsg.PLSRV13.getCode(),
                    ErrorMsg.PLSRV13.getMessage(),
                    DomainMsg.MICROSERVICE_FUNCTIONAL.getName(),
                    BASE_ERROR_DETAILS
            );
        }
        if (playerSheetToUpdate.getAlignment() == null || playerSheetToUpdate.getAlignment().isBlank()) {
            throw new UpdatePlayerSheetException(
                    ErrorMsg.PLSRV14.getCode(),
                    ErrorMsg.PLSRV14.getMessage(),
                    DomainMsg.MICROSERVICE_FUNCTIONAL.getName(),
                    BASE_ERROR_DETAILS
            );
        }
    }

    public static void validateCreate(PlayerSheetPO playerSheetToCreate) throws CreatePlayerSheetException {

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
        if (playerSheetToCreate.getExperience() == null || playerSheetToCreate.getExperience() < 0) {
            throw new CreatePlayerSheetException(
                    ErrorMsg.PLSRV05.getCode(),
                    ErrorMsg.PLSRV05.getMessage(),
                    DomainMsg.MICROSERVICE_FUNCTIONAL.getName(),
                    BASE_ERROR_DETAILS
            );
        }
        if (playerSheetToCreate.getLevel() == null || playerSheetToCreate.getLevel() <= 0 || playerSheetToCreate.getLevel() > 20) {
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

    }

}
