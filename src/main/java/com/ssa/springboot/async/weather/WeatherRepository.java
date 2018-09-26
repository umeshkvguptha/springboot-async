/**
 * 
 */
package com.ssa.springboot.async.weather;

import java.util.concurrent.CompletableFuture;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Repository;

/**
 * @author Umesh Kumar K.V
 * 
 */
@Repository
public class WeatherRepository {
	@Async("asyncExecutor")
	public CompletableFuture<Weather> getWeather(String zipcode) throws InterruptedException {
		String string = System.currentTimeMillis() + ",,,,,,,,,," + Thread.currentThread().getName();
		System.out.println(string);
		Thread.sleep(2000);
		return CompletableFuture.completedFuture(new Weather(string));

	}
}
