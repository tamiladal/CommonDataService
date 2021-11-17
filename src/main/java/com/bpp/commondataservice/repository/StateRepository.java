/**
 * 
 */
package com.bpp.commondataservice.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.bpp.commondataservice.domain.State;

/**
 * @author Adalarasu
 *
 */
@Repository
public interface StateRepository extends MongoRepository<State,String>{

}
