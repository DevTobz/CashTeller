package com.demoassignment.teller.transactions.repository;

import com.demoassignment.teller.transactions.entity.CashTellerTransaction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public interface CashTellerTransactionRepository extends JpaRepository<CashTellerTransaction,Long> {
    CashTellerTransaction findByTranCode(Long tranCode);


   /*List<CashTellerTransaction> findAllByCreatedDate(Date createdDate);*/

    @Query("SELECT t FROM CashTellerTransaction t WHERE t.createdDate BETWEEN :startDate AND :endDate")
    List<CashTellerTransaction> findTransactionsBetweenDates(@Param("startDate") Date startDate, @Param("endDate") Date endDate);
}
