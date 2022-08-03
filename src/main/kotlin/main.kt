fun main () {
    val price = 10000
    val regularCustomer = true
    val amountDiscount = if (price <= 1000) 0 else if (price <= 10000) 100 else (price * 0.05).toInt()
    val discountedAmount = price - amountDiscount
    val regularCustomerDiscount = if (regularCustomer) (discountedAmount * 0.01).toInt() else 0
    val purchase = discountedAmount - regularCustomerDiscount

    val finalDiscount = amountDiscount + regularCustomerDiscount

    println("Сумма покупки $purchase (скидка $finalDiscount руб.)")
}