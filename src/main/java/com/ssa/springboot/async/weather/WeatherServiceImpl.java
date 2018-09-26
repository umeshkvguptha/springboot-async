/**
 * 
 */
package com.ssa.springboot.async.weather;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Umesh Kumar K.V
 *
 */	
@Service
public class WeatherServiceImpl implements WeatherService {
	private WeatherRepository weatherRepository;

	@Autowired
	public WeatherServiceImpl(WeatherRepository weatherRepository) {
		super();
		this.weatherRepository = weatherRepository;
	}

	@Override
	public List<Weather> get(String zipcode) throws InterruptedException {
		List<CompletableFuture<Weather>> cfs = new ArrayList<>();
		for (int i = 0; i < 108; i++) {
			cfs.add(weatherRepository.getWeather(zipcode));
		}

		return cfs.stream()
					.map(CompletableFuture::join)
					.collect(Collectors.toList());
	}
}
