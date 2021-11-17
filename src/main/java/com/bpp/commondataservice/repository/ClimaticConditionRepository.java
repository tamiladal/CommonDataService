/**
 * 
 */
package com.bpp.commondataservice.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.bpp.commondataservice.domain.ClimaticCondition;

/**
 * @author Adalarasu
 *
 */
@Repository
public interface ClimaticConditionRepository extends MongoRepository<ClimaticCondition,String>{

}
