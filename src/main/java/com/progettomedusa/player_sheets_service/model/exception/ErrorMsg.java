package com.progettomedusa.player_sheets_service.model.exception;

import lombok.Getter;
import org.springframework.http.HttpStatus;

@Getter
public enum ErrorMsg {

    USRSRV01("USRSRV01", "Invalid fields:", HttpStatus.BAD_REQUEST),

    USRSRV02("USRSRV02", "Bad request", HttpStatus.BAD_REQUEST),

    USRSRV03("USRSRV03", "Bad request", HttpStatus.BAD_REQUEST),

    USRSRV04("USRSRV04", "Bad request", HttpStatus.BAD_REQUEST),

    USRSRV05("USRSRV05", "Bad request", HttpStatus.BAD_REQUEST),

    USRSRV06("USRSRV06", "Bad request", HttpStatus.BAD_REQUEST),

    USRSRV07("USRSRV07", "Activity details not found", HttpStatus.BAD_REQUEST),

    USRSRV08("USRSRV08", "Executions details not found", HttpStatus.BAD_REQUEST),

    USRSRV09("USRSRV09", "Error from DIM SDK", HttpStatus.BAD_REQUEST),

    USRSRV10("USRSRV10", "Error from Decoding Algorithm", HttpStatus.BAD_REQUEST),

    USRSRV11("USRSRV11", "Activity already closed", HttpStatus.BAD_REQUEST),

    USRSRV12("USRSRV12", "Decryption error", HttpStatus.BAD_REQUEST),

    USRSRV13("USRSRV13", "Missing mandatory parameters", HttpStatus.BAD_REQUEST),

    PLSRV01("PLSRV01", "Error: character name is missing", HttpStatus.BAD_REQUEST),

    PLSRV02("PLSRV02", "Error: character race is missing", HttpStatus.BAD_REQUEST),

    PLSRV03("PLSRV03", "Error: character class is missing", HttpStatus.BAD_REQUEST),

    PLSRV04("PLSRV04", "Error: character background is missing", HttpStatus.BAD_REQUEST),

    PLSRV05("PLSRV05", "Error: character experience can't be less than zero", HttpStatus.BAD_REQUEST),

    PLSRV06("PLSRV06", "Error: character level is missing", HttpStatus.BAD_REQUEST),

    PLSRV07("PLSRV07", "Error: character alignment is missing", HttpStatus.BAD_REQUEST),

    USRSRV99("USRSRV99", "Generic error", HttpStatus.INTERNAL_SERVER_ERROR);



    private final String code;

    private final String message;

    private final HttpStatus httpStatus;

    ErrorMsg(String code, String message, HttpStatus httpStatus) {
        this.code = code;
        this.message = message;
        this.httpStatus = httpStatus;
    }
}
