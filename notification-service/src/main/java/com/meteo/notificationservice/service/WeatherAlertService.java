package com.meteo.notificationservice.service;

import com.meteo.notificationservice.model.WeatherAlert;
import com.meteo.notificationservice.repository.WeatherAlertRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class WeatherAlertService {
    private final WeatherAlertRepository weatherAlertRepository;

    @Autowired
    public WeatherAlertService(WeatherAlertRepository weatherAlertRepository) {
        this.weatherAlertRepository = weatherAlertRepository;
    }

    public List<WeatherAlert> getAllAlerts() {
        return weatherAlertRepository.findAll();
    }

    public Optional<WeatherAlert> getAlertById(Long id) {
        return weatherAlertRepository.findById(id);
    }

    public WeatherAlert createAlert(WeatherAlert weatherAlert) {
        return weatherAlertRepository.save(weatherAlert);
    }

    public WeatherAlert updateAlert(Long id, WeatherAlert weatherAlert) {
        return weatherAlertRepository.findById(id)
                .map(existingAlert -> {
                    existingAlert.setCity(weatherAlert.getCity());
                    existingAlert.setMessage(weatherAlert.getMessage());
                    existingAlert.setAlertLevel(weatherAlert.getAlertLevel());
                    return weatherAlertRepository.save(existingAlert);
                })
                .orElseGet(() -> {
                    weatherAlert.setId(id);
                    return weatherAlertRepository.save(weatherAlert);
                });
    }

    public void deleteAlert(Long id) {
        weatherAlertRepository.deleteById(id);
    }
}
