package com.progettomedusa.player_sheets_service.model.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class RestResponse {
    @JsonProperty("message")
    @Size(max = 2048)
    private String message;

    @JsonProperty("domain")
    @Size(max = 64)
    private String domain;

    @JsonProperty("detailed")
    @Size(max = 4096)
    private String detailed;

    @JsonProperty("timestamp")
    @Size(max = 1024)
    private String timestamp;
}
