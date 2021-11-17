/**
 * 
 */
package com.bpp.commondataservice.service;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bpp.commondataservice.dto.CuisineDTO;
import com.bpp.commondataservice.repository.CuisineRepository;

/**
 * @author Adalarasu
 *
 */
@Service
public class CuisineServiceImpl implements ICuisineService{
	
	@Autowired
	CuisineRepository cuisineRepository;
	
	@Autowired
	ModelMapper modelMapper;
	
	public List<CuisineDTO> fetchAllCuisines(){
		return cuisineRepository.findAll().stream().map(cuisine -> modelMapper.map(cuisine,CuisineDTO.class)).collect(Collectors.toList());
	}
	

}
