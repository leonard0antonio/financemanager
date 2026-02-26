package com.leonardo.financemanager.dto;

import java.time.LocalDate;

public record TransactionDTO(
        String description,
        Double amount,
        String type,
        LocalDate date
){}
