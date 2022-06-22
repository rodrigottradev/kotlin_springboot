package com.backendlearning.kotlin.springboot.demo.dataSource

import com.backendlearning.kotlin.springboot.demo.model.Bank

interface BankDataSource {

    fun retrieveBanks(): Collection<Bank>

}