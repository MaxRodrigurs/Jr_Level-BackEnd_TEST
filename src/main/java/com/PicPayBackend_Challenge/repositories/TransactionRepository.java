package com.PicPayBackend_Challenge.repositories;

import com.PicPayBackend_Challenge.domain.transaction.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransactionRepository extends JpaRepository<Transaction, Long> {
}
