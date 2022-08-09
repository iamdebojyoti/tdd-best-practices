package controller

import io.kotlintest.shouldBe
import io.mockk.every
import io.mockk.mockk
import io.mockk.verify
import model.Customer
import org.junit.jupiter.api.Test
import org.springframework.http.HttpStatus.BAD_REQUEST
import org.springframework.http.HttpStatus.INTERNAL_SERVER_ERROR
import org.springframework.http.HttpStatus.OK
import service.CustomerService

class CustomerControllerV2Test {

    @Test
    fun `should save a customer when age is valid`() {
        val customerRequest = Customer("1", "Mark", "123,8th Cross Road", 10)

        val customerValidator = mockk<CustomerValidator>()
        val customerService = mockk<CustomerService>()
        val customerController = CustomerController(customerValidator, customerService, 20)

        every { customerValidator.validate(any(), any()) } returns true
        every { customerService.save(any(), any()) } returns true

        val response = customerController.save(customerRequest)

        response shouldBe OK


    }

    @Test
    fun `should return bad request when customer age is invalid`() {
        val customerRequest = Customer("1", "Mark", "123,8th Cross Road", 10)

        val customerValidator = mockk<CustomerValidator>()
        val customerService = mockk<CustomerService>()
        val customerController = CustomerController(customerValidator, customerService, 20)

        every { customerValidator.validate(any(), any()) } returns false

        val response = customerController.save(customerRequest)

        response shouldBe BAD_REQUEST
        verify(exactly = 0) {
            customerService.save(customerRequest, false)
        }

    }

    @Test
    fun `should return internalServer error if customer is not saved successfully`() {
        val customerRequest = Customer("1", "Mark", "123,8th Cross Road", 10)

        val customerValidator = mockk<CustomerValidator>()
        val customerService = mockk<CustomerService>()
        val customerController = CustomerController(customerValidator, customerService, 10)

        every { customerValidator.validate(any(), any()) } returns true
        every { customerService.save(any(), any()) } returns false

        val response = customerController.save(customerRequest)
        response shouldBe INTERNAL_SERVER_ERROR
    }

    @Test
    fun `should return forbidden`() {
        val customerValidator = mockk<CustomerValidator>()
        val customerService = mockk<CustomerService>()
        val customerController = CustomerController(customerValidator, customerService, 10)
        val customer = Customer("","","",10)
        customerController.save(customer)
    }
}
