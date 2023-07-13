package ru.podgoretskaya.guide.repository;

import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import ru.podgoretskaya.guide.dto.enums.Category;
import ru.podgoretskaya.guide.entity.InformationAboutVehicleEntity;

import java.util.List;

public interface InformationAboutVehicleRepo  extends JpaRepository<InformationAboutVehicleEntity,Long> {
   // @Query(value = "SELECT * FROM information_about_vehicle i WHERE i.brand=:brand",nativeQuery = true)
    List<InformationAboutVehicleEntity> findAllVehicleByBrand(String brand);// фильтрую по бренду

   // @Query(value = "SELECT * FROM information_about_vehicle i WHERE i.model=:model",nativeQuery = true)
    List<InformationAboutVehicleEntity>findAllByModel(String model);//фильтрую по модели


    List<InformationAboutVehicleEntity> findAllByCategory(Category category);

    List<InformationAboutVehicleEntity> findAllByStateNumber(String stateNumber);

    List<InformationAboutVehicleEntity> findAllByYearOfManufacture(String yearOfManufacture);
}
