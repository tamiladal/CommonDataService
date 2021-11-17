/**
 * 
 */
package com.bpp.commondataservice.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * @author Adalarasu
 *
 */
@Document("Cuisine")
public class Cuisine {
	
	@Id
	private String id;
	private String cuisineCode;
	private String cuisineName;
	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}
	/**
	 * @return the cuisineCode
	 */
	public String getCuisineCode() {
		return cuisineCode;
	}
	/**
	 * @param cuisineCode the cuisineCode to set
	 */
	public void setCuisineCode(String cuisineCode) {
		this.cuisineCode = cuisineCode;
	}
	/**
	 * @return the cuisineName
	 */
	public String getCuisineName() {
		return cuisineName;
	}
	/**
	 * @param cuisineName the cuisineName to set
	 */
	public void setCuisineName(String cuisineName) {
		this.cuisineName = cuisineName;
	}
	
	

}
