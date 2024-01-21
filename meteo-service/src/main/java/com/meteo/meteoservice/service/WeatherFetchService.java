package com.meteo.meteoservice.service;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.beans.factory.annotation.Value;

@Service
public class WeatherFetchService {

    @Value("${weather.api.key}")
    private String apiKey;

    private final String API_URL = "http://api.weatherapi.com/v1/current.json?key={apiKey}&q={city}";

    public String getWeatherData(String city) {
        RestTemplate restTemplate = new RestTemplate();
        String url = API_URL.replace("{apiKey}", apiKey).replace("{city}", city);
        return restTemplate.getForObject(url, String.class);
    }
}
