package com.meteo.meteoservice.repository;

import com.meteo.meteoservice.model.WeatherData;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WeatherDataRepository extends JpaRepository<WeatherData, Long> {
    // Méthodes personnalisées si nécessaire
}
