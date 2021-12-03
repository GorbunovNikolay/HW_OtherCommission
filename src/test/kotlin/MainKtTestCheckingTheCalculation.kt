import org.junit.Test

import org.junit.Assert.*

class MainKtTestCheckingTheCalculation {

    @Test
    fun theCalculationCommission() {
        var myAmmountCurrentTransfer =  45000.00
        var myAmountOfPreviousTransfers = 85000.00
        var myPaymentSystem = "Visa"
        var expectedCommission = 300.00
        var actualCommission = calculateСommission(myAmmountCurrentTransfer, myAmountOfPreviousTransfers, myPaymentSystem)
        assertEquals(expectedCommission, actualCommission, 0.00)

        myAmmountCurrentTransfer =  65000.00
        myAmountOfPreviousTransfers = 85000.00
        myPaymentSystem = "Mastercard"
        expectedCommission = 410.00
        actualCommission = calculateСommission(myAmmountCurrentTransfer, myAmountOfPreviousTransfers, myPaymentSystem)
        assertEquals(expectedCommission, actualCommission, 0.00)

        myAmmountCurrentTransfer =  65000.00
        myAmountOfPreviousTransfers = 15000.00
        myPaymentSystem = "Maestro"
        expectedCommission = 0.00
        actualCommission = calculateСommission(myAmmountCurrentTransfer, myAmountOfPreviousTransfers, myPaymentSystem)
        assertEquals(expectedCommission, actualCommission, 0.00)

        myAmmountCurrentTransfer =  65000.00
        myAmountOfPreviousTransfers = 15000.00
        myPaymentSystem = "Maestro"
        expectedCommission = 0.00
        actualCommission = calculateСommission(myAmmountCurrentTransfer, myAmountOfPreviousTransfers, myPaymentSystem)
        assertEquals(expectedCommission, actualCommission, 0.00)

        myAmmountCurrentTransfer =  1000.00
        myAmountOfPreviousTransfers = 85000.00
        myPaymentSystem = "Visa"
        expectedCommission = 35.00
        actualCommission = calculateСommission(myAmmountCurrentTransfer, myAmountOfPreviousTransfers, myPaymentSystem)
        assertEquals(expectedCommission, actualCommission, 0.00)

        myAmmountCurrentTransfer =  45000.00
        expectedCommission = 0.00
        actualCommission = calculateСommission(myAmmountCurrentTransfer)
        assertEquals(expectedCommission, actualCommission, 0.00)

        myAmmountCurrentTransfer =  85000.00
        expectedCommission = 0.00
        actualCommission = calculateСommission(myAmmountCurrentTransfer)
        assertEquals(expectedCommission, actualCommission, 0.00)

    }
}