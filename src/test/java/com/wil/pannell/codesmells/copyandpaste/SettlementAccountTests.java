package com.wil.pannell.codesmells.copyandpaste;

import org.junit.Test;

import java.util.Calendar;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class SettlementAccountTests {
	
	@Test
	public void debitingAccountShouldDeductAmountFromBalanceRecordTransactionAndUpdateLastDebitDate() throws Exception {
		SettlementAccount account = new SettlementAccount();
		account.credit(100);
		account.debit(50);
		assertEquals(50, account .getBalance(), 0);
		Transaction lastTransaction = account.getLastTransaction();
		assertTrue(lastTransaction.isDebit());
		assertEquals(-50, lastTransaction.getAmount(), 0);

		Calendar calendar = Calendar.getInstance();
		
		assertEquals(calendar.get(Calendar.DATE) + "/" +
				calendar.get(Calendar.MONTH) + "/" + 
				calendar.get(Calendar.YEAR),
				account.getLastTransactionDate());
	}
	

	@Test
	public void settlingAccounShouldDeductOwingFromBalance() throws Exception {
		SettlementAccount account = new SettlementAccount();
		account.credit(100);
		account.borrow(50);
		account.settle();
		assertEquals(50, account.getBalance(), 0);
	}

}
