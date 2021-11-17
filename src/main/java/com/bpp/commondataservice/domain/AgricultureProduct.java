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
@Document("AgricultureProduct")
public class AgricultureProduct {
	
	@Id
	private String id;
	private String agricultureProductCode;
	private String agricultureProductName;
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
	 * @return the agricultureProductCode
	 */
	public String getAgricultureProductCode() {
		return agricultureProductCode;
	}
	/**
	 * @param agricultureProductCode the agricultureProductCode to set
	 */
	public void setAgricultureProductCode(String agricultureProductCode) {
		this.agricultureProductCode = agricultureProductCode;
	}
	/**
	 * @return the agricultureProductName
	 */
	public String getAgricultureProductName() {
		return agricultureProductName;
	}
	/**
	 * @param agricultureProductName the agricultureProductName to set
	 */
	public void setAgricultureProductName(String agricultureProductName) {
		this.agricultureProductName = agricultureProductName;
	}
	
	


}
