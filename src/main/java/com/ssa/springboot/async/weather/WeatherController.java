/**
 * 
 */
package com.ssa.springboot.async.weather;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Umesh Kumar K.V
 *
 */
@RestController
public class WeatherController {
	private WeatherService weatherService;

	@Autowired
	public WeatherController(WeatherService weatherService) {
		super();
		this.weatherService = weatherService;
	}

	@GetMapping("/{zipcode}")
	public List<Weather> get(@PathVariable String zipcode) throws InterruptedException {
		return weatherService.get(zipcode);
	}
}
