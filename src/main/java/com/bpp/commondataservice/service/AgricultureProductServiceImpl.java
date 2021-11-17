/**
 * 
 */
package com.bpp.commondataservice.service;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bpp.commondataservice.dto.AgricultureProductDTO;
import com.bpp.commondataservice.repository.AgricultureProductRepository;

/**
 * @author Adalarasu
 *
 */
@Service
public class AgricultureProductServiceImpl implements IAgricultureProductService{
	
	@Autowired
	AgricultureProductRepository agricultureProductRepository;
	
	@Autowired
	ModelMapper modelMapper;
	
	public List<AgricultureProductDTO> fetchAllAgricultureProducts(){
		return agricultureProductRepository.findAll().stream().map(agricultureProduct -> modelMapper.map(agricultureProduct, AgricultureProductDTO.class)).collect(Collectors.toList());
	}

}
