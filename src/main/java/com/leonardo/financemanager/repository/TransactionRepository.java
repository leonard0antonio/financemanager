package com.leonardo.financemanager.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.leonardo.financemanager.model.Transaction;
import java.util.List;

public interface TransactionRepository extends JpaRepository<Transaction, Long> {
    List<Transaction> findByUserId(Long userId);
}