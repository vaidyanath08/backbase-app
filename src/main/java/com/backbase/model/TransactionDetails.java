/**
 * 
 */
package com.backbase.model;

import java.io.Serializable;

/**
 * @author Vaidyanath Rajpoot
 *
 */

public class TransactionDetails  implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 5788622049842725203L;

	private String type;

    private String description;

    private String posted;

    private String completed;

    private New_balance new_balance;

    private Value value;

	/**
	 * @return the type
	 */
	public String getType() {
		return type;
	}

	/**
	 * @param type the type to set
	 */
	public void setType(String type) {
		this.type = type;
	}

	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * @return the posted
	 */
	public String getPosted() {
		return posted;
	}

	/**
	 * @param posted the posted to set
	 */
	public void setPosted(String posted) {
		this.posted = posted;
	}

	/**
	 * @return the completed
	 */
	public String getCompleted() {
		return completed;
	}

	/**
	 * @param completed the completed to set
	 */
	public void setCompleted(String completed) {
		this.completed = completed;
	}

	/**
	 * @return the new_balance
	 */
	public New_balance getNew_balance() {
		return new_balance;
	}

	/**
	 * @param new_balance the new_balance to set
	 */
	public void setNew_balance(New_balance new_balance) {
		this.new_balance = new_balance;
	}

	/**
	 * @return the value
	 */
	public Value getValue() {
		return value;
	}

	/**
	 * @param value the value to set
	 */
	public void setValue(Value value) {
		this.value = value;
	}

}
