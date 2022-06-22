package com.backendlearning.kotlin.springboot.demo.dataSource.mock

import com.backendlearning.kotlin.springboot.demo.dataSource.BankDataSource
import com.backendlearning.kotlin.springboot.demo.model.Bank
import org.springframework.stereotype.Repository

@Repository
class MockBankDataSource : BankDataSource {
    val banks = listOf(
        Bank("1234", 3.15, 15),
        Bank("1010", 3.15, 0),
        Bank("5678", 0.0, 150),
    )

    override fun retrieveBanks(): Collection<Bank> = banks
}