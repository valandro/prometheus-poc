package com.valandro.contract.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Response {
    @JsonProperty("endereco")
    public String address;
    @JsonProperty("cidade")
    public String city;
    @JsonProperty("nome")
    public String restaurantName;
    @JsonProperty("uk")
    public String outCode;
    @JsonProperty("codigo_postal")
    public String postCode;
    @JsonProperty("nota")
    public Float rating;
    @JsonProperty("tipo_de_comida")
    public String typeFood;
}
