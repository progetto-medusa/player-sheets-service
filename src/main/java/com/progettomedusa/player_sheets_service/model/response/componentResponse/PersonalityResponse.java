package com.progettomedusa.player_sheets_service.model.response.componentResponse;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.Data;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Data
public class PersonalityResponse {

    @JsonProperty ("personality-traits")
    private String personalityTraits;
    @JsonProperty
    private String ideals;
    @JsonProperty
    private String bonds;
    @JsonProperty
    private String flaws;
    @JsonProperty
    private String feature1;
    @JsonProperty
    private String feature2;
    @JsonProperty
    private String feature3;
    @JsonProperty
    private String notes;
    @JsonProperty
    private String backstory;
}
