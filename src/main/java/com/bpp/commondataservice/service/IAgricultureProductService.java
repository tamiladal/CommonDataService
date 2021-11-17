/**
 * 
 */
package com.bpp.commondataservice.service;

import java.util.List;

import com.bpp.commondataservice.dto.AgricultureProductDTO;

/**
 * @author Adalarasu
 *
 */
public interface IAgricultureProductService {
	
	List<AgricultureProductDTO> fetchAllAgricultureProducts();

}
