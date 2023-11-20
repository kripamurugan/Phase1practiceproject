package com.app.TDD.demo;

import java.util.HashMap;
import java.util.Map;

public class PopulationSearch {

	private Map<String, Integer> getpopulationdata() {

		Map<String, Integer> populationMap = new HashMap<>();

		populationMap.put("Banglore", 1000000);
		populationMap.put("New Delhi", 2500000);
		populationMap.put("Mumbai", 2000000);
		populationMap.put("Pune", 500000);
		return populationMap;

	}

	public int getPopulation(String city) {

		// if city is empty > provide message "city name cannot be empty
		// if city name not contains any valid key (valid city) city name does not
		// exist.
		// if we have valid city in our list then provide count of populations

		Map<String, Integer> populationMap = null;
		int count = 0;

		if (city.isEmpty()) {
			throw new NullPointerException("City Name cannot be empty..");
		}

		populationMap = getpopulationdata();

		if (!populationMap.containsKey(city)) {
			throw new NullPointerException("City Name does not exist");
		} else {
			count = populationMap.get(city);
		}

		return count;
	}

}
