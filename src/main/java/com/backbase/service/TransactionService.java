/**
 * 
 */
package com.backbase.service;

import java.util.List;

import com.backbase.model.Transactions;

/**
 * @author Vaidyanath Rajpoot
 *
 */

public interface TransactionService  {
	List<Transactions> getTransactions() throws Exception ;

	List<Transactions> getTransactionsBasedOnTxnType(String txnType) throws Exception;
	
	Double getTotalTxnAmountbyTxnType(String txnType) throws Exception ;
}
