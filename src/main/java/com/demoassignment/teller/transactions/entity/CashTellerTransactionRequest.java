package com.demoassignment.teller.transactions.entity;

import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class CashTellerTransactionRequest {

    private String tranRefNo;
    private Long tranCode;
    private String tranType;
    private BigDecimal amount;
    private Long sourceAccount;
    private String sourceAccountName;
    private Long tellerId;
    private Long beneficiaryAccount;
    private String beneficiaryName;
    private String beneficiaryFinCode;
    private String narration;
    private Long createdBy;
    private String slipNo;
    private String vaultNo;
    private int status;
    private Long verifiedBy;
    private int verifyStatus;
    private int updateCount;
}
