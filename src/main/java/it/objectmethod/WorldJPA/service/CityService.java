package it.objectmethod.WorldJPA.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.objectmethod.WorldJPA.entity.City;
import it.objectmethod.WorldJPA.repository.CityRepository;

@Service
public class CityService {

	@Autowired
	private CityRepository cityRepo;

	public City findByName(String cityName) {
		City city = cityRepo.findByName(cityName);
		return city;
	}

}
