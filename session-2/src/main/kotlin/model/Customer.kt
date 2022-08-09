package model

data class Customer(val mobileNumber: String, val name: String, val address: String, val age: Int) {
    fun toCustomerDomainModel(): CustomerDomainModel {
        return CustomerDomainModel(mobileNumber, name, address, age, true)
    }

}
