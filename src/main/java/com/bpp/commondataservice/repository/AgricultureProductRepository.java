/**
 * 
 */
package com.bpp.commondataservice.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.bpp.commondataservice.domain.AgricultureProduct;

/**
 * @author Adalarasu
 *
 */
@Repository
public interface AgricultureProductRepository extends MongoRepository<AgricultureProduct,String>{

}
