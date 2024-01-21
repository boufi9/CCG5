package com.meteo.notificationservice.controller;

import com.meteo.notificationservice.model.WeatherAlert;
import com.meteo.notificationservice.service.WeatherAlertService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/alerts")
public class WeatherAlertController {
    private final WeatherAlertService weatherAlertService;

    @Autowired
    public WeatherAlertController(WeatherAlertService weatherAlertService) {
        this.weatherAlertService = weatherAlertService;
    }

    @GetMapping
    public List<WeatherAlert> getAllAlerts() {
        return weatherAlertService.getAllAlerts();
    }

    @GetMapping("/{id}")
    public ResponseEntity<WeatherAlert> getAlertById(@PathVariable Long id) {
        return weatherAlertService.getAlertById(id)
                .map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping
    public WeatherAlert createAlert(@RequestBody WeatherAlert weatherAlert) {
        return weatherAlertService.createAlert(weatherAlert);
    }

    @PutMapping("/{id}")
    public WeatherAlert updateAlert(@PathVariable Long id, @RequestBody WeatherAlert weatherAlert) {
        return weatherAlertService.updateAlert(id, weatherAlert);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteAlert(@PathVariable Long id) {
        weatherAlertService.deleteAlert(id);
        return ResponseEntity.ok().build();
    }
}
