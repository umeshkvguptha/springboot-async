/**
 * 
 */
package com.ssa.springboot.async.weather;

import java.io.Serializable;

/**
 * @author Umesh Kumar K.V
 *
 */
public class Weather implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -7758208232526335772L;
	private String temp;

	public Weather(String temp) {
		super();
		this.temp = temp;
	}

	public String getTemp() {
		return temp;
	}

	public void setTemp(String temp) {
		this.temp = temp;
	}

	@Override
	public String toString() {
		return "Weather [temp=" + temp + "]";
	}

}
