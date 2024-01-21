package com.meteo.meteoservice.controller;

import com.meteo.meteoservice.service.WeatherFetchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class    WeatherController {

    @Autowired
    private WeatherFetchService weatherFetchService;

    @GetMapping("/weather/{city}")
    public String getWeather(@PathVariable String city) {
        return weatherFetchService.getWeatherData(city);
    }
}
