package com.demoassignment.teller.transactions.entity;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table(name = "cm_transactions")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CashTellerTransaction {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "Tran_Ref_No", length = 128, unique = true)
    private String tranRefNo;

    @Column(name = "Tran_Code")
    private int tranCode;


    @Column(name = "Tran_Type", length = 128, nullable = false)
    private String tranType;

    @Column(name = "Amount", precision = 19, scale = 6, nullable = false)
    private BigDecimal amount;


    @Column(name = "Source_Account")
    private Long sourceAccount;

    @Column(name = "Source_Acc_Name", length = 256)
    private String sourceAccountName;

    @Column(name = "Teller_Id")
    private Long tellerId;

    @Column(name = "Beneficiary_Account")
    private Long beneficiaryAccount;

    @Column(name = "Beneficiary_Name", length = 256)
    private String beneficiaryName;

    @Column(name = "Beneficiary_Fin_Code", length = 128)
    private String beneficiaryFinCode;

    @Column(name = "Narration", columnDefinition = "text")
    private String narration;

    @Column(name = "Created_Date", nullable = false)
    private Date createdDate;

    @Column(name = "Created_By")
    private Long createdBy;

    @Column(name = "Slip_No", length = 128)
    private String slipNo;

    @Column(name = "Vault_No", length = 128)
    private String vaultNo;

    @Column(name = "Status")
     private int status;

    @Column(name = "Verified_By")
     private Long verifiedBy;

    @Column(name = "Verify_Status")
     private int verifyStatus;
    @Column(name = "Verified_Date")
    private Date verifiedDate;

    @Column(name = "Update_Count")
    private int updateCount;



}
