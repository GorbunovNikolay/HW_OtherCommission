
fun main() {
    println(calculateСommission(45000.00))
    println(calculateСommission(85000.00))
    println(calculateСommission(65000.00, 15000.00, "Mastercard"))
    println(calculateСommission(65000.00, 85000.00, "Mastercard"))
    println(calculateСommission(45000.00, 85000.00, "Visa"))
    println(calculateСommission(1000.00, 85000.00, "Visa"))
}



fun calculateСommission(amountСurrentTransfer: Double, amountOfPreviousTransfers : Double = 0.0, paymentSystem : String = "VK Pay"): Double {
    var result = 0.0
    if (paymentSystem == "Mastercard" || paymentSystem == "Maestro") {
        if (amountOfPreviousTransfers < 75000.00){
            var result = 0
        }
        else result = (amountСurrentTransfer * 0.6 / 100) + 20
    }
    if (paymentSystem == "Visa" || paymentSystem == "Мир") {
        if (amountСurrentTransfer * 0.6 / 100 < 35.00) {
            result = 35.00
        }
        else result = amountСurrentTransfer * 0.6 / 100
    }
    return result
}


