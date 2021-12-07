import org.junit.Test

import org.junit.Assert.*

class MainKtTestCheckingTheCalculation {

    @Test
    fun theCalculationCommission4585() {
        val myAmmountCurrentTransfer =  45000.00
        val myAmountOfPreviousTransfers = 85000.00
        val myPaymentSystem = "Visa"
        val expectedCommission = 270.00
        val actualCommission = calculateCommission(myAmmountCurrentTransfer, myAmountOfPreviousTransfers, myPaymentSystem)
        assertEquals(expectedCommission, actualCommission, 0.00)
    }

    @Test
    fun theCalculationCommission6585() {
        val myAmmountCurrentTransfer = 65000.00
        val myAmountOfPreviousTransfers = 85000.00
        val myPaymentSystem = "Mastercard"
        val expectedCommission = 410.00
        val actualCommission = calculateCommission(myAmmountCurrentTransfer, myAmountOfPreviousTransfers, myPaymentSystem)
        assertEquals(expectedCommission, actualCommission, 0.00)
    }

    @Test
    fun theCalculationCommission6515() {
        val myAmmountCurrentTransfer = 65000.00
        val myAmountOfPreviousTransfers = 15000.00
        val myPaymentSystem = "Maestro"
        val expectedCommission = 0.00
        val actualCommission = calculateCommission(myAmmountCurrentTransfer, myAmountOfPreviousTransfers, myPaymentSystem)
        assertEquals(expectedCommission, actualCommission, 0.00)
    }

    @Test
    fun theCalculationCommission185() {
        val myAmmountCurrentTransfer = 1000.00
        val myAmountOfPreviousTransfers = 85000.00
        val myPaymentSystem = "Visa"
        val expectedCommission = 35.00
        val actualCommission = calculateCommission(myAmmountCurrentTransfer, myAmountOfPreviousTransfers, myPaymentSystem)
        assertEquals(expectedCommission, actualCommission, 0.00)
    }

    @Test
    fun theCalculationCommission450() {
        val myAmmountCurrentTransfer = 45000.00
        val expectedCommission = 0.00
        val actualCommission = calculateCommission(myAmmountCurrentTransfer)
        assertEquals(expectedCommission, actualCommission, 0.00)
    }

    @Test
    fun theCalculationCommission850() {
        val myAmmountCurrentTransfer =  85000.00
        val expectedCommission = 0.00
        val actualCommission = calculateCommission(myAmmountCurrentTransfer)
        assertEquals(expectedCommission, actualCommission, 0.00)
    }
}