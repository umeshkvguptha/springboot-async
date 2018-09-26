/**
 * 
 */
package com.ssa.springboot.async.weather;

import java.util.List;

/**
 * @author Umesh Kumar K.V
 *
 */
public interface WeatherService {

	/**
	 * 
	 * @param zipcode 
	 * @return
	 * @throws InterruptedException 
	 */
	List<Weather> get(String zipcode) throws InterruptedException;

}
