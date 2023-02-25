package com.app.model.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.io.Serializable;
@Data
public class Usage implements Serializable {
    @JsonProperty("prompt_tokens")
    private Double promptTokens;
    @JsonProperty("completion_tokens")
    private Double completionTokens;
    @JsonProperty("total_tokens")
    private Double totalTokens;
}
