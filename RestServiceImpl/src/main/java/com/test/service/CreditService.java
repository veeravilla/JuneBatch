package com.test.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.test.service.CreditAccount;
import com.test.service.CreditRequest;
import com.test.service.CreditResponse;

public class CreditService  implements ICreditService,ICreditSOAPService{
	private static Logger logger = LoggerFactory.getLogger(CreditService.class);
	
	public CreditResponse getCreditReport(CreditRequest request) {
		//B.L
		logger.info(" Input " + request.toString());
		
		//TODO: DataBase
		CreditResponse response = new CreditResponse();
		response.setCreditScore(765);
		response.setNoOfAccounts(5);
		response.getAccounts().add(new CreditAccount("Boa", 10000, 2345.90));
		response.getAccounts().add(new CreditAccount("Chase", 6563, 785.90));
		response.getAccounts().add(new CreditAccount("Boa", 12345, 6543.90));
		response.getAccounts().add(new CreditAccount("Boa", 5689, 4321.90));
		return response;
	}
}
