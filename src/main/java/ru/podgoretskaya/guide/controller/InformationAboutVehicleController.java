package ru.podgoretskaya.guide.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ru.podgoretskaya.guide.dto.InformationAboutVehicleDTO;
import ru.podgoretskaya.guide.service.InformationAboutVehicleService;

import java.util.List;

@RequiredArgsConstructor
@Slf4j
@RestController
@Tag(name = "справочник", description = "Методы разделены по типу операции")
public class InformationAboutVehicleController {
    private final InformationAboutVehicleService service;

    @PostMapping("/save")
    @Operation(summary = "добавление ТС")
    public ResponseEntity<Long> save(@RequestBody InformationAboutVehicleDTO model) {
        return ResponseEntity.ok(service.saveInDB(model));
    }

    @PostMapping("/edit/{id}")
    @Operation(summary = "редактирование ТС по идентификатору (id)")
    public ResponseEntity<InformationAboutVehicleDTO> edit(@RequestBody InformationAboutVehicleDTO model, @RequestParam("id") Long id) {
        return new ResponseEntity<>(service.edit(id, model), HttpStatus.OK);
    }

    @PostMapping("/filter")
    @Operation(summary = "фильтрация содержимого таблицы")
    public ResponseEntity<List<InformationAboutVehicleDTO>> filter(@RequestBody InformationAboutVehicleDTO model) {
        return new ResponseEntity<>(service.filter(model), HttpStatus.OK);
    }

    @PostMapping("/guide")
    @Operation(summary = "вся база")
    public ResponseEntity<List<InformationAboutVehicleDTO>> guide() {
        return new ResponseEntity<>(service.findAll(), HttpStatus.OK);
    }

}
