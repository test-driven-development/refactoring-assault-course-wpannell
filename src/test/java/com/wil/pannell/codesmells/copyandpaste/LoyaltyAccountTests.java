package com.wil.pannell.codesmells.copyandpaste;

import org.junit.Test;

import java.util.Calendar;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class LoyaltyAccountTests {
  @Test
  public void debitingAccountShouldDeductAmountFromBalanceRecordTransactionAndUpdateLastDebitDate() throws Exception {
    LoyaltyAccount account = new LoyaltyAccount();
    account.credit(100);
    account.debit(50);

    assertEquals(50, account.getBalance(), 0);

    Transaction lastTransaction = account.getLastTransaction();

    assertTrue(lastTransaction.isDebit());
    assertEquals(-50, lastTransaction.getAmount(), 0);

    Calendar calendar = Calendar.getInstance();

    assertEquals(calendar.get(Calendar.DATE) + "/" +
            calendar.get(Calendar.MONTH) + "/" +
            calendar.get(Calendar.YEAR),
        account.getLastTransactionDate());
  }
}
