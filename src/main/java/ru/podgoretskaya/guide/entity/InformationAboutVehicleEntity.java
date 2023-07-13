package ru.podgoretskaya.guide.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import ru.podgoretskaya.guide.dto.enums.Category;
import ru.podgoretskaya.guide.dto.enums.VehicleType;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name= "information_about_vehicle")
@Inheritance(strategy= InheritanceType.JOINED)
public class InformationAboutVehicleEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "brand")
    String brand;
    @Column(name = "model")
    String model;
    @Column(name = "category_TS")
    Category category;
    @Column(name = " state_number")
    String stateNumber;
    @Column(name = "vehicle_type")
    VehicleType vehicleType;
    @Column(name = "year_of_manufacture")
    String yearOfManufacture;
    @Column(name = "availability_of_trailer")
    boolean availabilityOfTrailer;
}
