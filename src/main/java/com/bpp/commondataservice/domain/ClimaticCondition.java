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
@Document("ClimaticCondition")
public class ClimaticCondition {

	@Id
	private String id;
	private String climaticConditionCode;
	private String climaticConditionName;
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
	 * @return the climaticConditionCode
	 */
	public String getClimaticConditionCode() {
		return climaticConditionCode;
	}
	/**
	 * @param climaticConditionCode the climaticConditionCode to set
	 */
	public void setClimaticConditionCode(String climaticConditionCode) {
		this.climaticConditionCode = climaticConditionCode;
	}
	/**
	 * @return the climaticConditionName
	 */
	public String getClimaticConditionName() {
		return climaticConditionName;
	}
	/**
	 * @param climaticConditionName the climaticConditionName to set
	 */
	public void setClimaticConditionName(String climaticConditionName) {
		this.climaticConditionName = climaticConditionName;
	}
	
	
}
