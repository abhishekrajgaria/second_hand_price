package com.secondhand.api.vehicledataservice.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
@Document("vehicles")
public class VehicleMetaData {
    @Id
    @JsonProperty("VehicleId")
    private String vehicleId;

    @JsonProperty("Brand")
    private String brand;

    @JsonProperty("Model")
    private String model;

    @JsonProperty("Year")
    private String year;

    @JsonProperty("Price")
    private String price;

    @JsonProperty("FuelType")
    private String fuelType;

    @JsonProperty("VehicleType")
    private String vehicleType;

    @JsonProperty("PictureUrl")
    private String pictureUrl;
}
