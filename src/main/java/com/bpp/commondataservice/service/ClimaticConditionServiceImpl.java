/**
 * 
 */
package com.bpp.commondataservice.service;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bpp.commondataservice.dto.ClimaticConditionDTO;
import com.bpp.commondataservice.repository.ClimaticConditionRepository;

/**
 * @author Adalarasu
 *
 */
@Service
public class ClimaticConditionServiceImpl implements IClimaticConditionService{
	
	@Autowired
	ClimaticConditionRepository climaticConditionRepository;
	
	@Autowired
	ModelMapper modelMapper;
	
	public List<ClimaticConditionDTO> fetchAllClimaticConditions(){
		return climaticConditionRepository.findAll().stream().map(climaticCondition -> modelMapper.map(climaticCondition,ClimaticConditionDTO.class)).collect(Collectors.toList());
	}

}
