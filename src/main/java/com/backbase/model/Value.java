/**
 * 
 */
package com.backbase.model;

import java.io.Serializable;

/**
 * @author Vaidyanath Rajpoot
 *
 */
public class Value implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -9189543499581143823L;

	private String currency;

    private String amount;

	/**
	 * @return the currency
	 */
	public String getCurrency() {
		return currency;
	}

	/**
	 * @param currency the currency to set
	 */
	public void setCurrency(String currency) {
		this.currency = currency;
	}

	/**
	 * @return the amount
	 */
	public String getAmount() {
		return amount;
	}

	/**
	 * @param amount the amount to set
	 */
	public void setAmount(String amount) {
		this.amount = amount;
	}

}
