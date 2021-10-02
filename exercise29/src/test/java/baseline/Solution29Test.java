package baseline;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution29Test {

    @Test
    void inputValidation() {
        String input = "0";
        boolean actual = Solution29.inputValidation(input);

        assertEquals(true,actual);

    }

    @Test
    void doubleInvestment() {
        int r = 4;
        assertEquals(18,Solution29.doubleInvestment(r));

    }
}