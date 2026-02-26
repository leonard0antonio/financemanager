package com.leonardo.financemanager.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.leonardo.financemanager.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
}