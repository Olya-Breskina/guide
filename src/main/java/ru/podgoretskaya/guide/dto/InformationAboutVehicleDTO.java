package ru.podgoretskaya.guide.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import ru.podgoretskaya.guide.dto.enums.Category;
import ru.podgoretskaya.guide.dto.enums.VehicleType;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class InformationAboutVehicleDTO {
    @Schema(description = "марка")
    String brand;
    @Schema(description = "модель")
    String model;
    @Schema(description = "категория ТС")
    Category category;
    @Schema(description = "государственный номер")
    String stateNumber;
    @Schema(description = " типа ТС")
    VehicleType vehicleType;
    @Schema(description = "год выпуска")
    String yearOfManufacture;
    @Schema(description = "наличие прицепа")
    boolean availabilityOfTrailer;
}
