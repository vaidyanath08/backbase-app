/**
 * 
 */
package com.backbase.model;

import java.io.Serializable;

/**
 * @author Vaidyanth Rajpoot
 *
 */
public class Bank implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 8444388823399942682L;

	private String national_identifier;

    private String name;

	/**
	 * @return the national_identifier
	 */
	public String getNational_identifier() {
		return national_identifier;
	}

	/**
	 * @param national_identifier the national_identifier to set
	 */
	public void setNational_identifier(String national_identifier) {
		this.national_identifier = national_identifier;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

}
