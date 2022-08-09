package controller

import model.Customer
import org.springframework.beans.factory.annotation.Value
import org.springframework.http.HttpStatus
import org.springframework.http.HttpStatus.BAD_REQUEST
import org.springframework.http.HttpStatus.OK
import org.springframework.http.HttpStatus.INTERNAL_SERVER_ERROR
import service.CustomerService

class CustomerController(
    private val customerValidator: CustomerValidator,
    private val customerService: CustomerService,
    @Value("\${MAX_ADDRESS_SIZE:20}") val maxAddressSize: Int

) {
    fun save(customer: Customer): HttpStatus {
        val isCustomerValid = customerValidator.validate(customer, maxAddressSize)
        return if (isCustomerValid) {
            if (customerService.save(customer, true)) {
                return OK
            } else {
                INTERNAL_SERVER_ERROR
            }
        } else BAD_REQUEST
    }
}
