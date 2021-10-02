package baseline;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PaymentCalculatorTest {

    @Test
    void calculateMonthsUntilPaidOff() {
        Solution26 solution = new Solution26();

        solution.b = 5000;
        solution.i = (.12/365);
        solution.p = 100;

        double expected = 70;
        double actual = PaymentCalculator.calculateMonthsUntilPaidOff();

        assertEquals(expected,actual);
    }
}