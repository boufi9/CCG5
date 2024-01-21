package com.meteo.notificationservice.repository;

import com.meteo.notificationservice.model.WeatherAlert;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WeatherAlertRepository extends JpaRepository<WeatherAlert, Long> {
    // Méthodes personnalisées si nécessaire
}
