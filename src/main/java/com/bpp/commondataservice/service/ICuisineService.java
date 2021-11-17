/**
 * 
 */
package com.bpp.commondataservice.service;

import java.util.List;

import com.bpp.commondataservice.dto.CuisineDTO;

/**
 * @author Adalarasu
 *
 */
public interface ICuisineService {
	
	List<CuisineDTO> fetchAllCuisines();

}
