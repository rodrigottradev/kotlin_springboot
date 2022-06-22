package com.backendlearning.kotlin.springboot.demo.dataSource.mock

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MockBankDataSourceTest {

    private val mockDataSource = MockBankDataSource()

    @Test
    fun `should provide a collection of banks`() {
        // when
        val banks = mockDataSource.retrieveBanks()
        
        // then
        assertThat(banks.size).isGreaterThanOrEqualTo(3)

    }
    
    @Test
    fun `should provide some mock data`() {
        // given
        val banks = mockDataSource.retrieveBanks()
        
        // when
        //ALLMATCH: que todos los bancos lo cumplan
        assertThat(banks).allMatch { it.accountNumber.isNotBlank() }

        //ANYMATCH: que alguno lo cumpla
        assertThat(banks).anyMatch { it.trust != 0.0 }
        assertThat(banks).anyMatch { it.transactionFee != 0 }
        // then
        
    }

}