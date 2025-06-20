package com.progettomedusa.player_sheets_service.model.response.componentResponse;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.NotNull;
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
public class SkillsResponse {

    @JsonProperty
    @NotNull
    private Integer acrobatics; //(Dex)
    @JsonProperty
    @NotNull
    private Integer animalHandling; //(Wis)
    @JsonProperty
    @NotNull
    private Integer arcana; //(Int)
    @JsonProperty
    @NotNull
    private Integer athletics; //(Str)@JsonProperty
    @NotNull
    private Integer deception; //(Cha)
    @JsonProperty
    @NotNull
    private Integer history; //(Int)
    @JsonProperty
    @NotNull
    private Integer insight; //(Wis)
    @JsonProperty
    @NotNull
    private Integer intimidation; //(Cha)
    @JsonProperty
    @NotNull
    private Integer investigation; //(Int)
    @JsonProperty
    @NotNull
    private Integer medicine; //(Wis)
    @JsonProperty
    @NotNull
    private Integer nature; //(Int)
    @JsonProperty
    @NotNull
    private Integer perception; //(Wis)
    @JsonProperty
    @NotNull
    private Integer performance; //(Cha)
    @JsonProperty
    @NotNull
    private Integer persuasion; //(Cha)
    @JsonProperty
    @NotNull
    private Integer religion; //(Int)
    @JsonProperty
    @NotNull
    private Integer sightOfHand; //(Dex)
    @JsonProperty
    @NotNull
    private Integer stealth; //(Dex)
    @JsonProperty
    @NotNull
    private Integer survival; //(Wis)
}
