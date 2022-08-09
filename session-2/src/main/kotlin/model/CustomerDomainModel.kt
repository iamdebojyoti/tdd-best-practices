package model

data class CustomerDomainModel(
    val mobileNumber: String,
    val name: String,
    val address: String,
    val age: Int,
    val isSeniorCitizen: Boolean
)
