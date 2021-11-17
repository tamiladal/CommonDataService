/**
 * 
 */
package com.bpp.commondataservice.service;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bpp.commondataservice.dto.CountryDTO;
import com.bpp.commondataservice.repository.CountryRepository;

/**
 * @author Adalarasu
 *
 */
@Service
public class CountryServiceImpl implements ICountryService{
	
	@Autowired
	CountryRepository countryRepository;
	
	@Autowired
	ModelMapper modelMapper;
	
	public List<CountryDTO> fetchAllCountries(){
		return countryRepository.findAll().stream().map(country -> modelMapper.map(country,CountryDTO.class)).collect(Collectors.toList());
	}
}
