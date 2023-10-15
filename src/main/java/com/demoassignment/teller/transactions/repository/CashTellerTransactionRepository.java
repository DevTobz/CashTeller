package com.demoassignment.teller.transactions.repository;

import com.demoassignment.teller.transactions.entity.CashTellerTransaction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CashTellerTransactionRepository extends JpaRepository<CashTellerTransaction,Long> {
}
