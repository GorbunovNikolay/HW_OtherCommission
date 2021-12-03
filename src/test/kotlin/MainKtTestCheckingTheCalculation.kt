import org.junit.Test

import org.junit.Assert.*

class MainKtTestCheckingTheCalculation {

    @Test
    fun theCalculationCommission() {
        val myAmmountCurrentTransfer =  45000.00
        val myAmountOfPreviousTransfers = 85000.00
        val myPaymentSystem = "Visa"
        val expectedCommission = 300.00
        val actualCommission = calculateСommission(myAmmountCurrentTransfer, myAmountOfPreviousTransfers, myPaymentSystem)
        assertEquals(expectedCommission, actualCommission, 0.00)
    }
}