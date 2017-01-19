package com.chatbotmanila.service.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by IDT-Maynelson-PC on 1/18/2017.
 */

@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public class WaterRefillingBusinessJson {

    @JsonProperty("facebookPageId")
    private String facebookPageId;

    @JsonProperty("containerType")
    private String containerType;

    @JsonProperty("fbClientId")
    private String facebookClientId;

    @JsonProperty("noOfContainer")
    private String numberOfContainer;
}
