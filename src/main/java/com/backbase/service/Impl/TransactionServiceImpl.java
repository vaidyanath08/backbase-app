/**
 * 
 */
package com.backbase.service.Impl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.backbase.constant.BBConstants;
import com.backbase.model.Transactions;
import com.backbase.model.TransactionsList;
import com.backbase.service.TransactionService;

/**
 * @author Vaidyanath Rajpoot
 *
 */

@Service("txnService")
public class TransactionServiceImpl implements TransactionService {

	/**
	 * This method is used to return the transaction list.
	 * 
	 * @return List returns the transaction list.
	 */
	@Override
	public List<Transactions> getTransactions() throws Exception {

		RestTemplate restTemplate = new RestTemplate();
		List<Transactions> transactionList = restTemplate
				.getForObject(BBConstants.OPENBANK_TXN_SERVICE, TransactionsList.class).getTransactions();

		return transactionList;
	}

	/**
	 * This method is used to return the transaction list based on transaction
	 * type.
	 * 
	 * @param txnType
	 * @return List returns the transaction list based on transaction type.
	 */
	@Override
	public List<Transactions> getTransactionsBasedOnTxnType(String txnType) throws Exception {

		List<Transactions> listBasedOnTxnType = new ArrayList<Transactions>();
		List<Transactions> allTransactions = getTransactions();

		for (Transactions txn : allTransactions) {
			if (null != txn.getDetails().getType()) {
				if (txn.getDetails().getType().equals(txnType)) {
					listBasedOnTxnType.add(txn);
				}
			}
		}

		return listBasedOnTxnType;
	}

	/**
	 * This method is used to return the total transaction amount based on
	 * transaction type.
	 * 
	 * @param txnType
	 * @return Double returns the total transaction amount based on transaction
	 *         type.
	 */
	@Override
	public Double getTotalTxnAmountbyTxnType(String txnType) throws Exception  {

		Double totalTxAmount = 0.0;

		List<Transactions> listbasedOnTxnType = getTransactionsBasedOnTxnType(txnType);
		Iterator<Transactions> itr = listbasedOnTxnType.iterator();
		while (itr.hasNext()) {
			totalTxAmount += Double.parseDouble(itr.next().getDetails().getValue().getAmount());
		}
		return totalTxAmount;
	}
}
