/**
 * 
 */
package com.backbase.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author Vaidyanath Rajpoot
 *
 */
public class TransactionsList implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -1734196191489992489L;
	@JsonProperty("transactions")
	private List<Transactions> transactions =new ArrayList<Transactions>();

	/**
	 * @return the transactions
	 */
	public List<Transactions> getTransactions() {
		return transactions;
	}

	/**
	 * @param transactions the transactions to set
	 */
	public void setTransactions(List<Transactions> transactions) {
		this.transactions = transactions;
	}

}
