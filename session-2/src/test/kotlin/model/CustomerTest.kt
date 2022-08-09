package model

import io.kotlintest.shouldBe
import org.junit.jupiter.api.Test

class CustomerTest {
    //multiple assertions
    @Test
    fun `should convert customer to customer domain model with age higher than 70`() {
        val customerRequest = Customer("1", "Mark", "123,8th Cross Road", 84)
        val expectedCustomerDomainModel = CustomerDomainModel(
            "1",
            "Mark",
            "123,8th Cross Road",
            84,
            true
        )
        val response = customerRequest.toCustomerDomainModel()
        response shouldBe expectedCustomerDomainModel
        response.isSeniorCitizen shouldBe true
    }

//    @Test
//    fun `should set customer as senior citizen when age is more than 70`() {
//        val customerRequest = Customer("1", "Mark", "123,8th Cross Road", 84)
//        val response = customerRequest.toCustomerDomainModel()
//
//    }
}