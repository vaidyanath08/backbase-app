/**
 * 
 */
package com.backbase.model;

import java.io.Serializable;

/**
 * @author Vaidyanath Rajpoot
 *
 */
public class Holder implements Serializable{

    /**
	 * 
	 */
	private static final long serialVersionUID = -4135559651939656343L;

	private String name;

    private boolean is_alias;

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

	/**
	 * @return the is_alias
	 */
	public boolean isIs_alias() {
		return is_alias;
	}

	/**
	 * @param is_alias the is_alias to set
	 */
	public void setIs_alias(boolean is_alias) {
		this.is_alias = is_alias;
	}
}
