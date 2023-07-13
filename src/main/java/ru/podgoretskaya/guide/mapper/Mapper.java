package ru.podgoretskaya.guide.mapper;

public interface Mapper <E,D> {
    E toEntity(D dto);
    D toDto(E entity);
}
