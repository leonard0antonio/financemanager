package com.leonardo.financemanager.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import com.leonardo.financemanager.repository.TransactionRepository;
import com.leonardo.financemanager.model.Transaction;
import java.util.List;

@Service
@RequiredArgsConstructor
public class TransactionService {

    private final TransactionRepository repository;

    public Transaction create(Transaction transaction){
        return repository.save(transaction);
    }

    public List<Transaction> findByUser(Long userId){
        return repository.findByUserId(userId);
    }

    public Double calculateBalance(Long userId) {
        List<Transaction> transactions = repository.findByUserId(userId);

        return transactions.stream()
                .mapToDouble(t ->
                        t.getType().equals("INCOME")
                                ? t.getAmount()
                                : -t.getAmount())
                .sum();
    }
}