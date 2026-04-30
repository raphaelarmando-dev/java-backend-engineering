package com.raphael.fundamentals.oo;

import java.util.List;

public class BankSystem {
    public void processEndOfMonth(List<Account> accounts) {
        accounts.forEach(Account::applyMonthlyFee);
    }
}
