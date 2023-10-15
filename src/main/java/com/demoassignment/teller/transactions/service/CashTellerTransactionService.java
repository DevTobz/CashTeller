package com.demoassignment.teller.transactions.service;

import com.demoassignment.teller.transactions.entity.CashTellerTransaction;
import com.demoassignment.teller.transactions.entity.CashTellerTransactionRequest;
import com.demoassignment.teller.transactions.entity.CashTellerUpdateRequest;
import com.demoassignment.teller.transactions.repository.CashTellerTransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class CashTellerTransactionService {

    @Autowired
    private CashTellerTransactionRepository cashTellerTransactionRepository;



    // can modify code later for extra exception handling
    public List<CashTellerTransaction> getAllCashTransactions() {

        return cashTellerTransactionRepository.findAll();

    }

    // can modify code later for extra exception handling
    public CashTellerTransaction getCashTellerTransactionById(Long Id){
       return cashTellerTransactionRepository.findById(Id).orElse(null);
    }

    public CashTellerTransaction saveCashTellerTransaction (CashTellerTransactionRequest request){
            CashTellerTransaction cashTellerTransaction = CashTellerTransaction.
                    builder().
                    tellerId(request.getTellerId()).
                    amount(request.getAmount()).
                    beneficiaryAccount(request.getBeneficiaryAccount()).
                    beneficiaryName(request.getBeneficiaryName()).
                    beneficiaryFinCode(request.getBeneficiaryFinCode()).
                    createdBy(request.getCreatedBy()).
                    narration(request.getNarration()).
                    slipNo(request.getSlipNo()).
                    sourceAccount(request.getSourceAccount()).
                    sourceAccountName(request.getSourceAccountName()).
                    status(request.getStatus()).
                    tranCode(request.getTranCode()).
                    tranRefNo(request.getTranRefNo()).
                    tranType(request.getTranType()).
                    updateCount(request.getUpdateCount()).
                    vaultNo(request.getVaultNo()).
                    verifyStatus(request.getVerifyStatus()).
                    verifiedBy(request.getVerifiedBy())
                    .build();

            cashTellerTransaction.setCreatedDate(new Date());

            // I can implement extra checks for transactions before the saving operation
            cashTellerTransactionRepository.save(cashTellerTransaction);


        return cashTellerTransaction;
        //return "Cash Teller saved Successfully";
    }

    public String updateTellerTransactionById(Long Id, CashTellerUpdateRequest updateRequest){
        Optional<CashTellerTransaction> cashTellerTransaction = cashTellerTransactionRepository.findById(Id);
        CashTellerTransaction cashTellerTransaction1 = cashTellerTransaction.get();
        //Doesn't know what values will be updated
        cashTellerTransaction1.setTellerId(updateRequest.getTellerId());
        cashTellerTransaction1.setAmount(updateRequest.getAmount());
        cashTellerTransaction1.setTranCode(updateRequest.getTranCode());
        cashTellerTransaction1.setTranType(updateRequest.getTranType());
        cashTellerTransaction1.setSourceAccount(updateRequest.getSourceAccount());
        cashTellerTransaction1.setSourceAccountName(updateRequest.getSourceAccountName());
        cashTellerTransaction1.setTranRefNo(updateRequest.getTranRefNo());
        cashTellerTransaction1.setBeneficiaryAccount(updateRequest.getBeneficiaryAccount());
        cashTellerTransaction1.setBeneficiaryName(updateRequest.getBeneficiaryName());
        cashTellerTransaction1.setBeneficiaryFinCode(updateRequest.getBeneficiaryFinCode());
        cashTellerTransaction1.setNarration(updateRequest.getNarration());
        cashTellerTransaction1.setCreatedBy(updateRequest.getCreatedBy());
        cashTellerTransaction1.setSlipNo(updateRequest.getSlipNo());
        cashTellerTransaction1.setVaultNo(updateRequest.getVaultNo());
        cashTellerTransaction1.setStatus(updateRequest.getStatus());
        cashTellerTransaction1.setVerifiedBy(updateRequest.getVerifiedBy());
        cashTellerTransaction1.setVerifyStatus(updateRequest.getVerifyStatus());
        cashTellerTransaction1.setUpdateCount(updateRequest.getUpdateCount());

        cashTellerTransaction1.setVerifiedDate(new Date());

        cashTellerTransactionRepository.save(cashTellerTransaction1);
        return "Cash Teller Successfully Update";
    }
}
