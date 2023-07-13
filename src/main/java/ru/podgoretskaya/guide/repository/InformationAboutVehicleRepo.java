package ru.podgoretskaya.guide.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.podgoretskaya.guide.dto.enums.Category;
import ru.podgoretskaya.guide.entity.InformationAboutVehicleEntity;

import java.util.List;

public interface InformationAboutVehicleRepo extends JpaRepository<InformationAboutVehicleEntity, Long> {
    List<InformationAboutVehicleEntity> findAllVehicleByBrand(String brand);

    List<InformationAboutVehicleEntity> findAllByModel(String model);


    List<InformationAboutVehicleEntity> findAllByCategory(Category category);

    List<InformationAboutVehicleEntity> findAllByStateNumber(String stateNumber);

    List<InformationAboutVehicleEntity> findAllByYearOfManufacture(String yearOfManufacture);
}
