package ru.podgoretskaya.guide.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import ru.podgoretskaya.guide.dto.InformationAboutVehicleDTO;
import ru.podgoretskaya.guide.entity.InformationAboutVehicleEntity;
import ru.podgoretskaya.guide.mapper.Mapper;
import ru.podgoretskaya.guide.repository.InformationAboutVehicleRepo;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
@Slf4j
public class InformationAboutVehicleServiceImpl implements InformationAboutVehicleService {
    private final InformationAboutVehicleRepo repo;
    private final Mapper<InformationAboutVehicleEntity, InformationAboutVehicleDTO> mapper;

    @Override
    public Long saveInDB(InformationAboutVehicleDTO dto) {
        log.info("\n>>> сохраниение  данных " + dto.toString() + ">>>\n");
        InformationAboutVehicleEntity save = repo.save(mapper.toEntity(dto));
        return save.getId();
    }

    @Override
    public InformationAboutVehicleDTO edit(Long id, InformationAboutVehicleDTO dto) {
        log.info("\n>>> редактирование товара по id:  " + id + ">>>\n" + "\n>>> сохраниение  данных " + dto.toString() + ">>>\n");
        InformationAboutVehicleEntity entity = repo.findById(id).orElseThrow(NoSuchElementException::new);
        InformationAboutVehicleEntity entity1 = mapper.toEntity(dto);
        entity1.setId(entity.getId());
        InformationAboutVehicleEntity save = repo.save(entity1);
        return mapper.toDto(save);
    }

    @Override
    public List<InformationAboutVehicleDTO> filter(InformationAboutVehicleDTO dto) {
        log.info("\n>>> фильтрация по:  " + dto.toString() + ">>>\n");
        List<InformationAboutVehicleEntity> vehicleFilter = new ArrayList<>();
        if (dto.getBrand() != null) {
            vehicleFilter = repo.findAllVehicleByBrand(dto.getBrand());
        } else if (dto.getModel() != null) {
            vehicleFilter = repo.findAllByModel(dto.getModel());
        }
        else if(dto.getCategory()!=null){
            vehicleFilter = repo.findAllByCategory(dto.getCategory());
        }
        else if (dto.getStateNumber()!=null){
            vehicleFilter = repo.findAllByStateNumber(dto.getStateNumber());
        }
        else if(dto.getYearOfManufacture()!=null)
        {
            vehicleFilter = repo.findAllByYearOfManufacture(dto.getYearOfManufacture());
        }
        return vehicleFilter.stream().map(mapper::toDto).collect(Collectors.toList());
    }
}
