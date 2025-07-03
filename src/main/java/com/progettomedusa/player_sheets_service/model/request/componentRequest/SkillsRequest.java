package com.progettomedusa.player_sheets_service.model.request.componentRequest;

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
public class SkillsRequest {

    @JsonProperty
    private Integer acrobatics; //(Dex)
    @JsonProperty ("animal_handling")
    private Integer animalHandling; //(Wis)
    @JsonProperty
    private Integer arcana; //(Int)
    @JsonProperty
    private Integer athletics; //(Str)@JsonProperty
    @JsonProperty
    private Integer deception; //(Cha)
    @JsonProperty
    private Integer history; //(Int)
    @JsonProperty
    private Integer insight; //(Wis)
    @JsonProperty
    private Integer intimidation; //(Cha)
    @JsonProperty
    private Integer investigation; //(Int)
    @JsonProperty
    private Integer medicine; //(Wis)
    @JsonProperty
    private Integer nature; //(Int)
    @JsonProperty
    private Integer perception; //(Wis)
    @JsonProperty
    private Integer performance; //(Cha)
    @JsonProperty
    private Integer persuasion; //(Cha)
    @JsonProperty
    private Integer religion; //(Int)
    @JsonProperty ("sight_of_hand")
    private Integer sightOfHand; //(Dex)
    @JsonProperty
    private Integer stealth; //(Dex)
    @JsonProperty
    private Integer survival; //(Wis)
}
