package ru.podgoretskaya.guide.mapper;

import org.springframework.stereotype.Component;
import ru.podgoretskaya.guide.dto.InformationAboutVehicleDTO;
import ru.podgoretskaya.guide.entity.InformationAboutVehicleEntity;

@Component
public class InformationAboutVehicleMap implements Mapper<InformationAboutVehicleEntity, InformationAboutVehicleDTO> {

    @Override
    public InformationAboutVehicleEntity toEntity(InformationAboutVehicleDTO dto) {
        InformationAboutVehicleEntity entity = new InformationAboutVehicleEntity();
        entity.setBrand(dto.getBrand());
        entity.setModel(dto.getModel());
        entity.setCategory(dto.getCategory());
        entity.setStateNumber(dto.getStateNumber());
        entity.setVehicleType(dto.getVehicleType());
        entity.setYearOfManufacture(dto.getYearOfManufacture());
        entity.setAvailabilityOfTrailer(dto.isAvailabilityOfTrailer());
        return entity;
    }

    @Override
    public InformationAboutVehicleDTO toDto(InformationAboutVehicleEntity entity) {
        InformationAboutVehicleDTO dto = new InformationAboutVehicleDTO();
        dto.setBrand(entity.getBrand());
        dto.setModel(entity.getModel());
        dto.setCategory(entity.getCategory());
        dto.setStateNumber(entity.getStateNumber());
        dto.setVehicleType(entity.getVehicleType());
        dto.setYearOfManufacture(entity.getYearOfManufacture());
        dto.setAvailabilityOfTrailer(entity.isAvailabilityOfTrailer());
        return dto;
    }
}
