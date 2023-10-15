package com.demoassignment.teller.transactions.controller;

import com.demoassignment.teller.transactions.entity.CashTellerTransaction;
import com.demoassignment.teller.transactions.entity.CashTellerTransactionRequest;
import com.demoassignment.teller.transactions.entity.CashTellerUpdateRequest;
import com.demoassignment.teller.transactions.service.CashTellerTransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/transaction")
public class Controller {
    @Autowired
    private CashTellerTransactionService service;

    @Autowired
    private SimpMessagingTemplate messagingTemplate;


    @GetMapping(path = "/getAllTransactions")
    public List<CashTellerTransaction> getAllCashTellerTransaction(){
        return service.getAllCashTransactions();
    }

    @PostMapping(path = "/saveTransaction")
    public String saveCashTransaction(@RequestBody CashTellerTransactionRequest cashTellerTransactionRequest){
        CashTellerTransaction cashTellerTransaction = service.saveCashTellerTransaction(cashTellerTransactionRequest);

        return "Transaction saved successfully";
    }

    @PutMapping(path = "/updateTransaction/{id}")
    public String updateCashTransaction(@PathVariable Long Id, @RequestBody CashTellerUpdateRequest updateRequest){
            return service.updateTellerTransactionById(Id, updateRequest);
    }

}
