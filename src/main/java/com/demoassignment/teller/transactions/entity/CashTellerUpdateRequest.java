package com.demoassignment.teller.transactions.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CashTellerUpdateRequest {
    private String tranRefNo;
    private int tranCode;
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
