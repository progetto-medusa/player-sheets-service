package com.progettomedusa.player_sheets_service.model.request.componentRequest;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.NotBlank;
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
public class PersonalityRequest {

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
