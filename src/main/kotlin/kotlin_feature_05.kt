fun main() {
    val company = Company("Uber", 1993)
    val result = company.name?.length ?: "name property is null"
    println(" ${result}")
}