/**
 * 
 */
package com.backbase.controller;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.backbase.model.Transactions;

/**
 * @author Vaidyanath Rajpoot
 *
 */
public interface TransactionController {

	@RequestMapping(value = "/transactions/transactionlist", method = RequestMethod.GET)
	public List<Transactions> getAllTransactions();

	@RequestMapping(value = "/transactions/transactionlist/{type}", method = RequestMethod.GET)
	public List<Transactions> getTxnBasedOnTxnType(String type);

	@RequestMapping(value = "/transactions/transactionlist/totaltxnAmount/{type}", method = RequestMethod.GET)
	public Double getTotalTxnAmountBasedOnTxnType(String type);

}