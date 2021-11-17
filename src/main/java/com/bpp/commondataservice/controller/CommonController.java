package com.bpp.commondataservice.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bpp.commondataservice.dto.AgricultureProductDTO;
import com.bpp.commondataservice.dto.ClimaticConditionDTO;
import com.bpp.commondataservice.dto.CountryDTO;
import com.bpp.commondataservice.dto.CuisineDTO;
import com.bpp.commondataservice.dto.StateDTO;
import com.bpp.commondataservice.service.IAgricultureProductService;
import com.bpp.commondataservice.service.IClimaticConditionService;
import com.bpp.commondataservice.service.ICountryService;
import com.bpp.commondataservice.service.ICuisineService;
import com.bpp.commondataservice.service.IStateService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;

/**
 * @author Adalarasu
 *
 */
@RestController
@CrossOrigin
@RequestMapping(path = "/common", produces = MediaType.APPLICATION_JSON_VALUE)
public class CommonController {
	
	@Autowired
	ICountryService countryService;
	
	@Autowired
	IStateService stateService;
	
	@Autowired
	IAgricultureProductService agricultureProductService;
	
	@Autowired
	IClimaticConditionService climaticConditionService;
	
	@Autowired
	ICuisineService cuisineService;
	
	@GetMapping("/check/status")
	public String checkStatus() {
		return "Successfully Checked";
	}
	
	@GetMapping("/fetch/countries")
	public List<CountryDTO> fetchAllCountries() {
		return countryService.fetchAllCountries();
	}
	
	@GetMapping("/fetch/states")
	public List<StateDTO> fetchAllStates() {
		return stateService.fetchAllStates();
	}
	
	@GetMapping("/fetch/agricultureProducts")
	public List<AgricultureProductDTO> fetchAllAgricultureProducts() {
		return agricultureProductService.fetchAllAgricultureProducts();
	}
	
	@GetMapping("/fetch/climaticConditions")
	public List<ClimaticConditionDTO> fetchAllClimaticConditions() {
		return climaticConditionService.fetchAllClimaticConditions();
	}
	
	@GetMapping("/fetch/cuisines")
	public List<CuisineDTO> fetchAllCuisines() {
		return cuisineService.fetchAllCuisines();
	}

}
