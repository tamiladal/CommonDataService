/**
 * 
 */
package com.bpp.commondataservice.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.bpp.commondataservice.domain.Country;

/**
 * @author Adalarasu
 *
 */
@Repository
public interface CountryRepository extends MongoRepository<Country,String>{

}
