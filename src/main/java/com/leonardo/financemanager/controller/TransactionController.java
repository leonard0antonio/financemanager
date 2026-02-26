package com.leonardo.financemanager.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import com.leonardo.financemanager.service.TransactionService;
import com.leonardo.financemanager.model.Transaction;
import java.util.List;

@RestController
@RequestMapping("/transactions")
@RequiredArgsConstructor
public class TransactionController {

    private final TransactionService service;

    @PostMapping
    public Transaction create(@RequestBody Transaction transaction){
        return service.create(transaction);
    }

    @GetMapping("/user/{userId}")
    public List<Transaction> listByUser(@PathVariable Long userId){
        return service.findByUser(userId);
    }

    @GetMapping("/user/{userId}/balance")
    public Double getBalance(@PathVariable Long userId){
        return service.calculateBalance(userId);
    }

}