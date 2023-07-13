package ru.podgoretskaya.guide.service;

import ru.podgoretskaya.guide.dto.InformationAboutVehicleDTO;

import java.util.List;

public interface InformationAboutVehicleService {
    Long saveInDB(InformationAboutVehicleDTO dto);

    InformationAboutVehicleDTO edit(Long id, InformationAboutVehicleDTO dto);

    List<InformationAboutVehicleDTO> filter(InformationAboutVehicleDTO dto);

    List<InformationAboutVehicleDTO> findAll();
}
