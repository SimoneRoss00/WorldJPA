package it.objectmethod.WorldJPA.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import it.objectmethod.WorldJPA.entity.City;
import it.objectmethod.WorldJPA.service.CityService;

@RestController
public class CityController {

	@Autowired
	private CityService cityService;

	@GetMapping("/name")
	public City findByName(@RequestParam("cityName") String name) {
		City city = cityService.findByName(name);
		return city;
	}

}
