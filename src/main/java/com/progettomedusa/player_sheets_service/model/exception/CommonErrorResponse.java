package com.progettomedusa.player_sheets_service.model.exception;

import com.progettomedusa.player_sheets_service.model.response.Error;
import com.progettomedusa.player_sheets_service.model.response.RestResponse;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class CommonErrorResponse extends RestResponse {
    private Error error;
}
