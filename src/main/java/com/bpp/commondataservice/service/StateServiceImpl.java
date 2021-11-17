/**
 * 
 */
package com.bpp.commondataservice.service;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bpp.commondataservice.dto.StateDTO;
import com.bpp.commondataservice.repository.StateRepository;

/**
 * @author Adalarasu
 *
 */
@Service
public class StateServiceImpl implements IStateService{
	
	@Autowired
	StateRepository stateRepository;
	
	@Autowired
	ModelMapper modelMapper;
	
	public List<StateDTO> fetchAllStates(){
		return stateRepository.findAll().stream().map(state -> modelMapper.map(state,StateDTO.class)).collect(Collectors.toList());
	}

}
