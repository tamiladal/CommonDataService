/**
 * 
 */
package com.bpp.commondataservice.service;

import java.util.List;

import com.bpp.commondataservice.dto.ClimaticConditionDTO;

/**
 * @author Adalarasu
 *
 */
public interface IClimaticConditionService {
	
	List<ClimaticConditionDTO> fetchAllClimaticConditions();

}
