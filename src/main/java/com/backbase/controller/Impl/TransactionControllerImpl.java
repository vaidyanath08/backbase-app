/**
 * 
 */
package com.backbase.controller.Impl;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.backbase.controller.TransactionController;
import com.backbase.model.Transactions;
import com.backbase.service.TransactionService;

/**
 * @author Vaidyanath Rajpoot
 * class TransactionControllerImpl
 * 
 */
@RestController
public class TransactionControllerImpl implements TransactionController {
	
	private static final Logger logger = Logger.getLogger(TransactionControllerImpl.class);
 

	@Autowired
	TransactionService txnService;
	/**
	 * @method will return all the Transactions 
	 * Type.
	 * 
	 * 
	 * @return List<Transactions>
	 */
	@Override
	public List<Transactions> getAllTransactions() {
		logger.debug("Inside getAllTransactions() method ");

		List<Transactions> txnList=null;
		try {
			txnList = txnService.getTransactions();
		} catch (Exception e) {
			logger.error("Inside TransactionControllerImpl:getAllTransaction()" + e.getMessage());
			logger.error("Internal Server Error has occured");
		}
		return txnList;
	}

	
	/**
	 * @method will return all the Transactions based on the transaction type 
	 * 
	 * @param String type
	 * @return List<Transactions>
	 */
	@Override

	public List<Transactions> getTxnBasedOnTxnType(@PathVariable("type") String type) {
		logger.debug("Inside getTxnBasedOnTxnType() method ");
		List<Transactions> txnTypeList=null;
		try {
			txnTypeList = txnService.getTransactionsBasedOnTxnType(type);
		} catch (Exception e) {
			logger.error("Inside TransactionControllerImpl:getTxnBasedOnTxnType" + e.getMessage());
			logger.error("Internal Server Error has occured");
		}
		return txnTypeList;
	}

	
	/**
	 * @method will return all the total transaction amount  based on the transaction type 
	 * 
	 * @param String type
	 * @return Double totalTxnAmount
	 */
	@Override

	public Double getTotalTxnAmountBasedOnTxnType(@PathVariable("type") String type)  {
		logger.debug("Inside getTotalTxnAmountBasedOnTxnType() method ");
		Double totalTxnAmount=0.0;
		try {
			totalTxnAmount = txnService.getTotalTxnAmountbyTxnType(type);
		} catch (Exception e) {
			logger.error("Inside TransactionControllerImpl:getTotalTxnAmountBasedOnTxnType" + e.getMessage());
			logger.error("Internal Server Error has occured");
		}
		return totalTxnAmount;
	}

}
