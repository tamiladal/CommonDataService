/**
 * 
 */
package com.bpp.commondataservice.service;

import java.util.List;

import com.bpp.commondataservice.dto.StateDTO;

/**
 * @author Adalarasu
 *
 */
public interface IStateService {
	
	List<StateDTO> fetchAllStates();

}
