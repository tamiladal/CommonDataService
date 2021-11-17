/**
 * 
 */
package com.bpp.commondataservice.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.bpp.commondataservice.domain.Cuisine;

/**
 * @author Adalarasu
 *
 */
@Repository
public interface CuisineRepository extends MongoRepository<Cuisine,String>{

}
