package com.sezo.function.runner;

import java.util.ArrayList;
import java.util.function.Function;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.sezo.function.model.TollStation;

@Configuration
public class TollStationRunner  {

	
	private static ArrayList<TollStation>  gettollStations() {

		ArrayList<TollStation> tollStations = new ArrayList<TollStation>();
		tollStations.add((new TollStation("100A", 112.5f, 2)));
		tollStations.add((new TollStation("111C", 124f, 4)));
		tollStations.add((new TollStation("112C", 126f, 2)));
		return tollStations;
	}

	@Bean
	 Function<String, TollStation> retrieveStation() {
		System.out.println("Spring cloud retrieveStation function!");
		return value -> {
			System.out.println("received request for station - " + value);
			return gettollStations().stream().filter(toll -> value.equals((toll.getStationId()))).findAny().orElse(null);
		};
	}

}
