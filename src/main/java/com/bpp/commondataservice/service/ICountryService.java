/**
 * 
 */
package com.bpp.commondataservice.service;

import java.util.List;

import com.bpp.commondataservice.dto.CountryDTO;

/**
 * @author Adalarasu
 *
 */
public interface ICountryService {
	
	List<CountryDTO> fetchAllCountries();

}
