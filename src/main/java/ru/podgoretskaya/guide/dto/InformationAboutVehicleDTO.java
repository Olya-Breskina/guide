package ru.podgoretskaya.guide.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotNull;
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
    @NotNull (message = "поле не должно быть пустым")
    String brand;
    @Schema(description = "модель")
   // @NotNull
    String model;
    @Schema(description = "категория ТС")
    @NotNull
    Category category;
    @Schema(description = "государственный номер")
    @NotNull
    String stateNumber;
    @Schema(description = " типа ТС")
    @NotNull
    VehicleType vehicleType;
    @Schema(description = "год выпуска")
    @NotNull
    String yearOfManufacture;
    @Schema(description = "наличие прицепа")
    @NotNull
    boolean availabilityOfTrailer;
}
