package edu.dcccd.trans.service;

import edu.dcccd.trans.entity.SelectedDay;
import edu.dcccd.trans.entity.Transaction;
import java.util.List;


public interface TransactionService
{
    String createTransaction(Transaction transaction);
    Iterable<Transaction> getAllTransaction();
}
