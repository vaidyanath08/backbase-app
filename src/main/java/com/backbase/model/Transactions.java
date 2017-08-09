/**
 * 
 */
package com.backbase.model;

import java.io.Serializable;

/**
 * @author Vaidyanath Rajpoot
 *
 */
public class Transactions implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 6082640534603768819L;

	private String id;

    private This_account this_account;

    private Other_account other_account;

  //@JsonProperty("TxnDetails")
    private TransactionDetails details;

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
	 * @return the this_account
	 */
	public This_account getThis_account() {
		return this_account;
	}

	/**
	 * @param this_account the this_account to set
	 */
	public void setThis_account(This_account this_account) {
		this.this_account = this_account;
	}

	/**
	 * @return the other_account
	 */
	public Other_account getOther_account() {
		return other_account;
	}

	/**
	 * @param other_account the other_account to set
	 */
	public void setOther_account(Other_account other_account) {
		this.other_account = other_account;
	}

	/**
	 * @return the details
	 */
	public TransactionDetails getDetails() {
		return details;
	}

	/**
	 * @param details the details to set
	 */
	public void setDetails(TransactionDetails details) {
		this.details = details;
	}

	

}
